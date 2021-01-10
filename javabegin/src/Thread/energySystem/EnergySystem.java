package Thread.energySystem;

public class EnergySystem {
    public final double[] energyBoxes;
    Object LockOj=new Object();

    public EnergySystem(int n, double initialEnergy){
        energyBoxes=new double[n];
        for(int i=0;i<n;i++){
            energyBoxes[i]=initialEnergy;
        }

    }

    /**
     * 能量的转移，从一个盒子到另一个盒子
     * @param from 能量源
     * @param to     能量终点
     * @param amount 能量值
     */
    public void transfer(int from, int to, double amount) throws InterruptedException {
        synchronized (LockOj){
            while (energyBoxes[from]<amount){
                LockOj.wait();
            }
            energyBoxes[from]-=amount;
            energyBoxes[to]+=amount;
            System.out.println("从"+from+"转移"+amount+"单位能量到"+to+" 能量总和"+getTotalEnergies());
        }
    }

    /**
     * 获取能量世界的能量总和
     */
    public double getTotalEnergies(){
        double sum=0.0;
        for(int i=0;i<energyBoxes.length;i++){
            sum+=energyBoxes[i];
        }
        return sum;
    }

    /**
     * 返回能量盒子的长度
     */
    public int getBoxAmount() {
        return energyBoxes.length;
    }


}
