package progetto_java_2;

public class Main {
    public static void main(String[] args) {
        //I nomi (i Thread) di chi userà il bagno (la risorsa)
        String [] nomi = {"Marco", "Sara", "Gioele", "Marcoantonio", "Sandra"};

        //Il bagno, ovvero la risorsa che verrà usata
        Toilette t = new Toilette();

        Persona[] persone = new Persona[5];

        for(int i = 0; i < 5; i++){
            persone[i] = new Persona(t, nomi[i]);
        }
    }
}