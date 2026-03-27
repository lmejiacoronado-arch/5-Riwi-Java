public record EmpresaRecord(String nombre, String nit, int anioFundacion) {

}
class Main {
    public static void main(String[] args) {
        EmpresaRecord empresa1 = new EmpresaRecord("Riwi", "1234-5", 2023);

        String compararVerbosidad =
                """
                Podemos ver que en Java 8 (POJOs) el proceso es mas largo y consta de crear primeo la clase y luego un constructor, el codigo se hace mas largo, en cambio con el record todo eso se hace en dos lineas, se declara todo junto: la clase y se declara los atributos alli mismo.
                """;
        System.out.println(compararVerbosidad);
    }
}
/*En proyectos reales, los Records se usan solo para definir datos (como una tabla de base de datos) y la lógica de ejecución (el main) vive en otra clase aparte (como App o Main).*/



