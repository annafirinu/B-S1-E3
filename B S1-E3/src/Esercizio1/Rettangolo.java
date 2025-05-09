package Esercizio1;

public class Rettangolo {
    //Definisco le variabili d'istanza
    private double altezza;
    private double larghezza;
    //Creo i costruttori: il primo parametrizzato, il secondo vuoto
    public Rettangolo(double altezza, double larghezza){
        this.altezza=altezza;
        this.larghezza=larghezza;
    }
    public Rettangolo(){

    }
    //Creo i metodi
    public double perimetro(){
        return (altezza+larghezza)*2;
    }

    public double area(){
        return altezza*larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }
}
