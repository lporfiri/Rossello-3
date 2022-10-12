public class TestPlaneta {
    public static void main(String[] args) {
        Planeta saturno = new Planeta("Saturno",3, 23412342,2341234.34,384784758,1237473747,false,TipoPlaneta.GASEOSO);
        Planeta tierra = new Planeta("Tierra", 1, 12312318,1234127.38, 838383838, 234872834,true, TipoPlaneta.TERRESTRE);

        System.out.println("Imprimindo datos de Saturno");
        saturno.imprimir();
        System.out.println("Densidad: " + saturno.calcularDensidad());
        if(saturno.esPlanetaExterior()) System.out.println("Es Planeta Exterior");
        else System.out.println("No es Planeta Exterior");

        System.out.println("Imprimindo datos de Tierra");
        tierra.imprimir();
        System.out.println("Densidad: " + tierra.calcularDensidad());
        if(tierra.esPlanetaExterior()) System.out.println("Es Planeta Exterior");
        else System.out.println("No es Planeta Exterior");


    }
}
