package progetto_java_2;

public class Main {
    public static void main(String[] args) {
        //I nomi (i Thread) di chi userà il bagno (la risorsa)
        String [] nomi = {"Marco", "Sara", "Gioele", "Marcoantonio", "Sandra"};

        //Il bagno, ovvero la risorsa che verrà usata
        Toilette t = new Toilette();

        //Creao un'aray di oggetti persona (i thread)
        Persona[] persone = new Persona[5];

        //riempio l'array di oggetti persona
        for(int i = 0; i < 5; i++){
            persone[i] = new Persona(t, nomi[i]);
        }

        for(int i = 0; i < 5; i++){
            persone[i].start();
        }
    }
}