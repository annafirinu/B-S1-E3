package Esercizio1;

public class ProvaRettangolo {
    public static void main(String[] args) {
        //Definisco i due rettangoli necessari
        Rettangolo r1 = new Rettangolo(10,20);
        Rettangolo r2 = new Rettangolo(10.5,19.5);

        stampaRettangolo(r1);
        stampaRettangolo(r2);
        stampaDueRettangoli(r1,r2);
    }
        //Creo i due metodi stampa
        public static void stampaRettangolo(Rettangolo rettangolo){
            System.out.println("Perimetro: "+rettangolo.perimetro());
            System.out.println("Area: "+rettangolo.area());
        }

        public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
            stampaRettangolo(r1);
            stampaRettangolo(r2);
            System.out.println("Somma perimetri: " + (r1.perimetro() + r2.perimetro()));
            System.out.println("Somma aree: " + (r1.area() + r2.area()));
        }
}
