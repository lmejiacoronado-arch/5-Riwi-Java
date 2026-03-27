public class Empleado {
    public static void main(String[] args) {
        // Tipos primitivos y String
        private byte edad;
        private short codigoDepartamento;
        private int id;
        private long salarioAnual; // Requiere sufijo L al asignar
        private float bonificacion; // Requiere sufijo f al asignar
        private double deducciones;
        private char inicialNombre;
        private boolean esActivo;
        private String nombreCompleto;

        // Constructor para inicializar los datos
        public Empleado(byte edad, short codigoDepartamento, int id, long salarioAnual,
        float bonificacion, double deducciones, char inicialNombre,
        boolean esActivo, String nombreCompleto) {
            this.edad = edad;
            this.codigoDepartamento = codigoDepartamento;
            this.id = id;
            this.salarioAnual = salarioAnual;
            this.bonificacion = bonificacion;
            this.deducciones = deducciones;
            this.inicialNombre = inicialNombre;
            this.esActivo = esActivo;
            this.nombreCompleto = nombreCompleto;
        }
    }
}