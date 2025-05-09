package Esercizio2;

public class Chiamata {
    private double durata;
    private int numeroChiamato;

    //Creo i costruttori: il primo parametrizzato, il secondo vuoto
    public Chiamata(double durata, int numeroChiamato){
        this.durata=durata;
        this.numeroChiamato=numeroChiamato;
    }
    public Chiamata(){
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    public int getNumeroChiamato() {
        return numeroChiamato;
    }

    public void setNumeroChiamato(int numeroChiamato) {
        this.numeroChiamato = numeroChiamato;
    }

    public void stampa(){
        System.out.println("Numero: "+ numeroChiamato + " - Durata: "+ durata);
    }
}
