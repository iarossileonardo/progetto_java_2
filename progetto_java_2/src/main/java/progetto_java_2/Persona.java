package progetto_java_2;

public class Persona extends Thread{
    private Toilette t;
    private String nome;

    

    public Persona(Toilette t, String nome) {
        this.t = t;
        this.nome = nome;
    }



    @Override
    public void run() {
        //TODO
    }
    
}
