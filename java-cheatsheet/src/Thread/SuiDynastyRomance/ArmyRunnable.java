package Thread.SuiDynastyRomance;

public class ArmyRunnable implements Runnable {

    volatile boolean keepRunning = true;

    @Override
    public void run() {
        while (keepRunning) {
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+"发功了攻击["+i+"]");
            }
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+"结束了攻击");

    }

}
