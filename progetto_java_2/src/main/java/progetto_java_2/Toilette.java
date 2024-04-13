package progetto_java_2;

public class Toilette {
    private boolean disp = true;
    int contaUomini;
    int contaDonne = 0;
    int donneEntrate = 0;

    public synchronized int entra(Persona p) throws InterruptedException {
        String persona = p.getName(); // salvo il nome della persona (thread) che ha occupato il bagno (risorsa)
        if(p.isDonna()) contaDonne++;
        else contaUomini ++;
        try {
            while ((!disp) || (((!p.isDonna()) && (contaDonne > 0) && ((donneEntrate % 3 != 0) || (donneEntrate == 0)))) || ((p.isDonna()) && (donneEntrate % 3 == 0) && (contaUomini > 0) && (donneEntrate != 0))) {
                System.out.println(persona + " sta aspettando...");
                wait();
            }
        } catch (InterruptedException e) {}
        //turnoUomo = false;
        disp = false;
        System.out.println(persona + " è entrato/a in bagno");
        if(p.isDonna()){
            donneEntrate++;
            contaDonne--;
            System.out.println("Donna entrata...DONNA");
        }
        else{
            contaUomini--;
            donneEntrate = 0;
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
