import java.util.Scanner;

public class Main {
    public static void ADMIN_CODE1234(int PIN){
        boolean ADMIN_DOSTEP;
        if (PIN == 1234){
            ADMIN_DOSTEP = true;
        }
        else {
            ADMIN_DOSTEP = false;
        }
        System.out.println("ADMIN_DOSTEP = " + ADMIN_DOSTEP);
    }
    public static void USER_CODE5678(int PIN){
        boolean USER_DOSTEP;
        if (PIN == 5678){
            USER_DOSTEP = true;
        }
        else {
            USER_DOSTEP = false;
        }
        System.out.println("USER_DOSTEP = " + USER_DOSTEP);
    }

    public static void main(String[] args) {
        System.out.println("Podaj pin ( 4 cyfry )");
        Scanner sc = new Scanner(System.in);

        int PIN = sc.nextInt();
        sc.close();
        ADMIN_CODE1234(PIN);
        USER_CODE5678(PIN);
    }
}