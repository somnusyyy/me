package Thread.SuiDynastyRomance;

public class stage extends Thread {

    public void run(){
        ArmyRunnable ArmyOfSuiDynasty=new ArmyRunnable();
        ArmyRunnable ArmyOfRevolt=new ArmyRunnable();

        Thread ArmySuiDynasty=new Thread(ArmyOfSuiDynasty,"隋军");
        Thread ArmyRevolt=new Thread(ArmyOfRevolt,"起义军");

        ArmySuiDynasty.start();
        ArmyRevolt.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ArmyOfSuiDynasty.keepRunning=false;
        ArmyOfRevolt.keepRunning=false;

        KeyPersonThread MrChengThread=new KeyPersonThread();

        Thread MrCheng=new Thread(MrChengThread,"MrCheng");
        MrCheng.start();

        try {
            MrCheng.join();//join方法强制加入线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        MrChengThread.KeepRunning=false;



//        try {
//            Thread.sleep(50);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("演出结束");


    }

    public static void main(String[] args) {
//        stage.currentThread().run();
        new stage().run();
    }



}
