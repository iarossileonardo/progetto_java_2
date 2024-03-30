package progetto_java_2;

import java.util.concurrent.Semaphore;

public class Toilette{
    private Semaphore s = new Semaphore(1);
    String persona;

    public int entra(Persona p) throws InterruptedException{
        persona = p.getName(); //salvo il nome della persona (thread) che ha occupato il bagno (risorsa)
        System.out.println(persona + " è entrato/a in bagno");
        return (int) (Math.random() * 10000) + 1; //Estraggo un tempo casuale di occupazione (moltipliato così tanto per avere ms che serviranno per sleep())
    }

    public void esce(){
        System.out.println(persona + " ha lasciato il bagno");
    }

    public Semaphore getS() {
        return s; //Restituisce il semaforo
    }

    

}
