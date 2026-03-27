public record EmpleadoRecord(String nombre, int idEmpleado, double salarioBase, double bonoMensual, int puntajeTest, int edad, int idSede, boolean esActivo) {

    public double calcularSalarioFinal(){
        return (salarioBase + (bonoMensual * 1.10)) - (salarioBase * 0.05);
        /*Orden de ejecución:
        1. (bonoMensual * 1.10) -> Multiplicación dentro de paréntesis.
        2. (salarioBase * 0.05)  -> Multiplicación dentro de paréntesis (Descuento).
        3. salarioBase + Resultado1 -> Suma.
        4. Resultado3 - Resultado2 -> Resta final.*/
    }

    public double calcularBonoExtra(){
        int bonoExtra = 0; /*Se inicializa una variable por si se cumple la condidion*/
        if ((idEmpleado % 2 == 0)) {
            bonoExtra += 2_000_000;
            /*// El operador % devuelve el residuo. Si es 0, el número es par.*/
        }
        return bonoExtra;
        /*Como la condicion se aplico le suma a la variable inicializada*/
    }

    public boolean validarElegibilidad(){
        return (puntajeTest > 85 && edad < 30) || (idSede == 1 && !esActivo);
        /*Precedencia de operadores:
        1. ! (NOT) -> Niega 'esActivo' primero.
        2. && (AND) -> Evalúa los grupos de comparaciones.
        3. || (OR) -> Evalúa el resultado final entre los dos bloques.*/
    }
}

class Main {
    public static void main(String[] args) {
        EmpleadoRecord emp1 = new EmpleadoRecord("Luis", 1, 8_000_000, 3_000_000, 82, 22, 3, false);

        System.out.println("--- Reporte de Empleado ---");
        System.out.println("Nombre: " + emp1.nombre());
        System.out.println("Salario Final: $" + emp1.calcularSalarioFinal());
        System.out.println("Bono Extra (por ID par): $" + emp1.calcularBonoExtra());
        System.out.println("¿Es elegible?: " + (emp1.validarElegibilidad() ? "Sí" : "No"));



        System.out.println("Longitud del nombre: " + emp1.nombre().length());
        /*Este print es para visualizar el error y para ello debe cambiar el nombre Luis en el constructor a null, le pongo .length para poder operar con ese nulo, porque si no lo opero no se activara el error aunque el atributo este en null*/
    }
}
