package Basicos;




public class Ej26 {
    public static void main(String[] args) throws InterruptedException{
        int hora = 0, minuto = 0, segundo = 0;

        while (true) {

            if (hora < 10) System.out.print("0");
            System.out.print(hora + ":");
            if (minuto < 10) System.out.print("0");
            System.out.print(minuto + ":");
            if (segundo < 10) System.out.print("0");
            System.out.println(segundo);

            segundo++;

            if (segundo == 60) {
                segundo = 0;
                minuto++;
                if (minuto == 60) {
                    minuto = 0;
                    hora++;
                    if (hora == 24) {
                        hora = 0;

                    }
                }
            }
            Thread.sleep(1000);// delay de 1 seg
        }
    }
}
