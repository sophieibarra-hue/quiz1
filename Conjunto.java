public class ProjectName {

    public static void main(String[] args) {
        // 1. Crear el edificio con capacidad para 3 apartamentos
        Edificio edificio = new Edificio("Calle 100 #20-30", 3);

        System.out.println("--- Agregando Apartamentos ---");
        // 2. Crear y añadir apartamentos
        edificio.agregarApartamento(101, 2);
        edificio.agregarApartamento(102, 3);
        edificio.agregarApartamento(201, 1);

        System.out.println();
        // 3. Mostrar todos los apartamentos del edificio
        edificio.mostrarApartamentos();

        System.out.println();
        // 4. Buscar un apartamento por número
        System.out.println("--- Buscando Apartamento 102 ---");
        Apartamento buscado = edificio.buscarApartamento(102);
        
        if (buscado != null) {
            System.out.println("Encontrado -> " + buscado.toString());
        } else {
            System.out.println("El apartamento no existe en el edificio.");
        }
    }
}