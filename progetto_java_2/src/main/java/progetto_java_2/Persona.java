package progetto_java_2;

public class Persona extends Thread{
    private Toilette t;
    private String nome;

    

    public Persona(Toilette t, String nome) {
        super(nome);
        this.t = t;
    }



    @Override
    public void run() {
        try {
            this.t.getS().acquire(); //"Aquisisco" il semaforo, bloccando l'accesso agli altri Thread, che saranno in attesa"
            int tempo = t.entra(this); //Faccio entrare una persona (thread) in bagno (risorsa) e salvo il tempo occupato
            System.out.println(this.getName() + " occupa il bagno per: " + ((int)tempo/1000) + "s");
            Thread.sleep(tempo); //blocco il thread per il tempo occupato
            t.esce(); //La persona esce dal bagno
            this.t.getS().release(); //"Rilascio il semaforo, liberando l'accesso alla risorsa per gli altri Thread"
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
