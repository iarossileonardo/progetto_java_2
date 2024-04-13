package progetto_java_2;

public class Main {
    public static void main(String[] args) {
        //I nomi (i Thread) di chi userà il bagno (la risorsa)
        String [] nomi = {"Marco", "Sara", "Antonella", "Concetta", "Sandra", "Marta", "Giovanna", "Samuela", "Gioele", "Marcoantonio", "Maicol"};

        //Il bagno, ovvero la risorsa che verrà usata
        Toilette t = new Toilette();

        //Creao un'aray di oggetti persona (i thread)
        Persona[] persone = new Persona[11];

        //riempio l'array di oggetti persona
        persone[0] = new Persona(t, nomi[0], false);
        persone[1] = new Persona(t, nomi[1], true);
        persone[2] = new Persona(t, nomi[2], true);
        persone[3] = new Persona(t, nomi[3], true);
        persone[4] = new Persona(t, nomi[4], true);
        persone[5] = new Persona(t, nomi[5], true);
        persone[6] = new Persona(t, nomi[6], true);
        persone[7] = new Persona(t, nomi[7], true);
        persone[8] = new Persona(t, nomi[8], false);
        persone[9] = new Persona(t, nomi[9], false);
        persone[9] = new Persona(t, nomi[10], false);

        for(int i = 0; i < 11; i++){
            persone[i].start();
        }
    }
}