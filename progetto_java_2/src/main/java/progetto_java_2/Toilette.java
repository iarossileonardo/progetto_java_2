package progetto_java_2;

public class Toilette {
    private boolean disp = true;
    int contaDonne = 2;

    public synchronized int entra(Persona p) throws InterruptedException {
        String persona = p.getName(); // salvo il nome della persona (thread) che ha occupato il bagno (risorsa)
        try {
            while ((!disp) || (((!p.getName().equals("Sandra")) && (!p.getName().equals("Sara"))) && (contaDonne > 0))) {
                System.out.println(persona + " sta aspettando, priorità: " + p.getPriority() + "...");
                wait();
            }
        } catch (InterruptedException e) {}
        disp = false;
        System.out.println(persona + " è entrato/a in bagno");
        if((persona.equals("Sandra")) || (persona.equals("Sara"))){
            contaDonne--;
            System.out.println("Donna entrata");
        }
        return (int) (Math.random() * 10000) + 1; // Estraggo un tempo casuale di occupazione (moltipliato così tanto
                                                  // per avere ms che serviranno per sleep())
    }

    public synchronized void esce() {
        String persona = Thread.currentThread().getName();
        System.out.println(persona + " ha lasciato il bagno" + "\n---------------------");
        disp = true;
        notifyAll();
    }

}
