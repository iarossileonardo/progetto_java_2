package progetto_java_2;

import java.util.concurrent.Semaphore;

public class Toilette extends Semaphore{

    public Toilette(int permits) {
        super(permits);
        //TODO Auto-generated constructor stub
    }

    public void entra() throws InterruptedException{
        System.out.println("Nome è entrato in bagno");
        Thread.sleep((long) ((Math.random() * 10000) + 1));
    }

    public void esce(){
        System.out.println("Nome è uscito dal bagno");
    }

}
