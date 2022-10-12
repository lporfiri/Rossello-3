public class Test {
    public static void main(String[] args) {
        // creo la empresa
        Empresa fravega = new Empresa();
        // agrego empleados a la empresa
        fravega.agregarEmpleado(new Persona("Juan","Perez",NivelEstudio.TERCIARIO));
        fravega.agregarEmpleado(new Persona("Ingacio","Rodriguez",NivelEstudio.SECUNDARIO));
        fravega.agregarEmpleado(new Persona("Vanina","Mujica",NivelEstudio.TERCIARIO));
        fravega.agregarEmpleado(new Persona("Martina","Juarez",NivelEstudio.UNIVERSITARIO));
        fravega.agregarEmpleado(new Persona("Juanita","Ruiz",NivelEstudio.SIN_ESTUDIOS));
        fravega.agregarEmpleado(new Persona("Pepe","Larrea",NivelEstudio.TERCIARIO));
        fravega.agregarEmpleado(new Persona("Felipe","Volpe",NivelEstudio.TERCIARIO));
        fravega.agregarEmpleado(new Persona("Martin","Feliz",NivelEstudio.TERCIARIO));
        fravega.agregarEmpleado(new Persona("Luis","D'Angelo",NivelEstudio.UNIVERSITARIO));

        // muestros todos los empleados
        System.out.println("** lista de empleados **");
        System.out.println("------------------------");
        fravega.mostrarEmpleados();
        System.out.println("\n");

        // muestro segun el tipo de estudio: ej. TERCIARIO
        System.out.println("** lista por estudios **");
        System.out.println("-------------------------");
        fravega.mostrarPorEstudio(NivelEstudio.TERCIARIO);
    }
}
