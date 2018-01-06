import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);






        Transport t1 = new Transport();
        Transport t2 = new Transport(2);
        Moto c1 = new Moto();
        Moto c2 = new Moto(1);
        System.out.println(t1.getVelocity());
        System.out.println(t2.getVelocity());
        System.out.println(c1.getVelocity());
        System.out.println(c2.getVelocity());
        Moto c3 = new Moto(c2);
        System.out.println(c3.getVelocity());
        System.out.println(Transport.name);
    }
}
