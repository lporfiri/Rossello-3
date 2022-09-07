package Basicos;

public class Ej27 {
    /*
    27. Realiza una cuenta atras con horas, minutos y segundos.
     */
    public static void main(String[] args) throws InterruptedException {
        int hora = 0, minuto = 1, segundo = 0;

        while (hora != 0 || minuto != 0 || segundo != 0) {

            if (hora < 10) System.out.print("0");
            System.out.print(hora + ":");
            if (minuto < 10) System.out.print("0");
            System.out.print(minuto + ":");
            if (segundo < 10) System.out.print("0");
            System.out.println(segundo);

            if (segundo == 0) {
                minuto--;
                if (minuto == 0) {
                    hora--;
                    minuto = 59;
                    segundo = 59;
                } else if (minuto != 0) {
                    minuto--;
                    segundo = 59;
                }
            } else segundo--;

            Thread.sleep(1000);// delay de 1 seg
        }
    }
}


