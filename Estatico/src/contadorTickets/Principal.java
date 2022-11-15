package contadorTickets;

public class Principal {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("2022/11/12","23442455");
        Ticket t2 = new Ticket("2022/11/12","274998345");
        Ticket t3 = new Ticket("2022/11/12","3143i3455");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
