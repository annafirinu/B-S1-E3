package Esercizio3;

import java.time.LocalDate;

public class ProvaCarrello {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1234,"Mario Rossi", "mario.rossi@ciao.it", LocalDate.of(2025,5, 7));
        Articolo articolo1 = new Articolo(123,"Giacca",22.50,6);
        Articolo articolo2=new Articolo(567, "Pantalone", 43.2, 7);

        Articolo[] articolo= new Articolo[2];
        articolo[0]=articolo1;
        articolo[1]=articolo2;

        Carrello carrello = new Carrello(cliente,articolo);

        System.out.println(carrello.getCostoTotale());
    }
}
