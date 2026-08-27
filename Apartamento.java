public class Apartamento {

    private int numero;
    private int numhabit;

    public Apartamento(int numero, int numhabit) {
        this.numero = numero;
        this.numhabit = numhabit;
    }
     
    public int getNumero() {
        return numero;
    } 

    public int getNumhabit() {
        return numhabit;
    } 

    @Override
    public String toString() {
        return "Apartamento N°: " + numero + " | Tiene " + numhabit + " habitaciones";
    }
}
