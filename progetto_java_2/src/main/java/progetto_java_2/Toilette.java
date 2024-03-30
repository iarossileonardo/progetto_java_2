package progetto_java_2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Toilette extends Semaphore{

    

    public Toilette(int permits, boolean fair) {
        super(permits, fair);
        //TODO Auto-generated constructor stub
    }

    public int entra(String [] persone) throws InterruptedException{
        System.out.println(persone[ThreadLocalRandom.current().nextInt(0, 6)] + " è entrato/a in bagno");
        return (int) (Math.random()*10) + 1;
    }

    public void esce(){
        System.out.println("Bagno libero");
    }

}
