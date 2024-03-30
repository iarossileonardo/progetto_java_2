package progetto_java_2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Toilette{
    private Semaphore s = new Semaphore(1);

    public int entra(String [] persone) throws InterruptedException{
        System.out.println(persone[ThreadLocalRandom.current().nextInt(0, 6)] + " è entrato/a in bagno");
        return (int) (Math.random()*10) + 1;
    }

    public void esce(){
        System.out.println("Bagno libero");
    }

}
