package Esercizio3;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articolo;
    private double costoTotale;

    public Carrello(Cliente cliente, Articolo[] articolo){
        this.cliente=cliente;
        this.articolo=articolo;
        calcolaTotale();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Articolo[] getArticolo() {
        return articolo;
    }

    public void setArticolo(Articolo[] articolo) {
        this.articolo = articolo;
    }

    public double getCostoTotale() {
        return costoTotale;
    }

    public void setCostoTotale(double costoTotale) {
        this.costoTotale = costoTotale;
    }

    public void calcolaTotale(){
        for (int i = 0; i < articolo.length; i++) {
           costoTotale += articolo[i].getPrezzo();
        }
    }
}
