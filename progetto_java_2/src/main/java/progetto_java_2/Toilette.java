package progetto_java_2;

import java.util.concurrent.Semaphore;

public class Toilette{
    private Semaphore s = new Semaphore(1);
    String persona;

    public int entra(Persona p) throws InterruptedException{
        persona = p.getName();
        System.out.println(persona+ " è entrato/a in bagno");
        return (int) (Math.random()*10) + 1;
    }

    public void esce(){
        System.out.println(persona + " ha lasciato il bagno");
    }

    public Semaphore getS() {
        return s;
    }

    

}
