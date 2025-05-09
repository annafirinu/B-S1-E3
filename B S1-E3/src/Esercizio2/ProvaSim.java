package Esercizio2;

public class ProvaSim {
    public static void main(String[] args) {
        //Uso il costruttore per definire il numero
        Sim s1 = new Sim(326158098);

        //Vado a cambiare con set il credito di default
        s1.setCredito(8);

        //Definisco le varie chiamate, dopo aver definito la lunghezza dell'array
        Chiamata[] chiamate = new Chiamata[4];
        Chiamata c1 = new Chiamata(4,354678954);
        Chiamata c2 = new Chiamata(2.5,354666954);
        Chiamata c3 = new Chiamata(6,399678004);
        Chiamata c4 = new Chiamata(3.8,328987954);
        //Assegno le varie chiamate all'array
        chiamate[0]=c1;
        chiamate[1]=c2;
        chiamate[2]=c3;
        chiamate[3]=c4;
        //Tramite il set faccio in modo che possa avvenire la modifica
        s1.setChiamate(chiamate);

        //Stampo i dati
        s1.stampaDati();


    }
}
