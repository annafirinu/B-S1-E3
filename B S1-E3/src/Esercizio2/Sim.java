package Esercizio2;

public class Sim {
    //Definisco le variabili d'istanza
    private int numero;
    private double credito;
    private Chiamata[] chiamate;
    //Creo i costruttori: il primo parametrizzato, il secondo vuoto
    public Sim(int numero){
        this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public Chiamata[] getChiamate() {
        return chiamate;
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }
   //Metodo per stampare, per le chiamate riprendo con .stampa il metodo del file Chiamata
    public void stampaDati(){
        System.out.println("Numero: "+ numero);
        System.out.println("Credito: "+ credito);
        for (int i = 0; i <4 ; i++) {
            chiamate[i].stampa();
        }
    }
}
