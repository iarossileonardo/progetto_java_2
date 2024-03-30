package progetto_java_2;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Toilette extends Semaphore{

    public Toilette(int permits) {
        super(permits);
        Random rand = new Random();
        //TODO Auto-generated constructor stub
    }

    public void entra(String [] persone) throws InterruptedException{
        System.out.println(persone[ThreadLocalRandom.current().nextInt(0, 6)] + " è entrato/a in bagno");
        Thread.sleep((long) ((Math.random() * 10000) + 1));
    }

    public void esce(){
        System.out.println("Nome è uscito dal bagno");
    }

}
