record Empresa(String nombre, int sedes) {}
public class pruebaRecord {
    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa("Riwi-Tech", 2);

        System.out.println("Empresa original: " + miEmpresa);

        /*miEmpresa.sedes = 5;*/
        /*pruebaRecord.java:8: error: sedes has private access in Empresa*/
    }
}