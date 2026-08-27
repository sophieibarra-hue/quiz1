public class Edificio {

    private int Direccion;
    private int numapartamento;
    private Apartamento [] apartamentos;

    Public Edificio(int Dirección, int apartamentos) {
        this.Direccion =  Direccion;
        this.apartamentos = new apartamentos (numero, numhabit);
        this.numapartamento = 0;
        
    }

     public void agregarApartamento(int numero, int numhabit) {
        if (this.contador < this.apartamentos.length) {
            this.apartamentos[this.contador] = new Apartamento(numero, numhabit);
            this.contador++;
            System.out.println("Apartamento N° " + numero + " agregado con éxito.");
        } else {
            System.out.println("ERROR: El edificio ya está lleno.");
        }
    }

    public void mostrarApartamentos() {
        System.out.println("--- Lista de Apartamentos (Edificio: " + direccion + ") ---");
        for (int i = 0; i < contador; i++) {
            System.out.println(this.apartamentos[i].toString());
        }
    }
    
    public Apartamento buscarApartamento(int numeroBuscado) {
        for (int i = 0; i < contador; i++) {
            if (this.apartamentos[i].getNumero() == numeroBuscado) {
                return this.apartamentos[i];
            }
        }
        return null;
}