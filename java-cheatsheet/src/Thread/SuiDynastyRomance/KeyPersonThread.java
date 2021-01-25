package Thread.SuiDynastyRomance;

public class KeyPersonThread extends Thread {
    public boolean KeepRunning=true;

    public void run(){
//        while (KeepRunning){
            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+"发动了攻击["+i+"]");
            }

            Thread.yield();
//        }
        System.out.println(Thread.currentThread().getName()+"结束了攻击");
    }
}
