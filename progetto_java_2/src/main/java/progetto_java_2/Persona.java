package progetto_java_2;

public class Persona extends Thread{
    private Toilette t;
    private boolean donna;

    

    public Persona(Toilette t, String nome, boolean donna) {
        super(nome);
        this.donna = donna;
        this.t = t;
    }



    @Override
    public void run() {
        try {
            int tempo = t.entra(this); //Faccio entrare una persona (thread) in bagno (risorsa) e salvo il tempo occupato
            System.out.println(this.getName() + " occupa il bagno per: " + ((int)tempo/1000) + "s");
            Thread.sleep(tempo); //blocco il thread per il tempo occupato
            t.esce(); //La persona esce dal bagno
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public boolean isDonna() {
        return donna;
    }

    
    
}
