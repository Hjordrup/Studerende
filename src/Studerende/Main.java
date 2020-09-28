package Studerende;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studerende st1 = new Studerende();
        st1.navn = "Anders";
        st1.alder = 24;
        st1.by = "Skælskør";


        Studerende st2 = new Studerende();
        st2.navn = "Mike";
        st2.alder = 24;
        st2.by = "Næstved";


        Studerende st3 = new Studerende();
        st3.navn = "Kim";
        st3.alder = 24;
        st3.by = "Næstved";


        Studerende st4 = new Studerende();
        st4.navn = "Mathias";
        st4.alder = 24;
        st4.by = "Næstved";


        Studerende st5 = new Studerende();
        st5.navn = "Mikkel";
        st5.alder = 24;
        st5.by = "Haslev";
        System.out.println("Indtast et navn med storst første bokstav");
        String nameIn = sc.nextLine();
        switch (nameIn) {

            case "Anders": {
                System.out.println(st1.navn);
                System.out.println(st1.alder);
            }
            break;
            case "Mike": {
                System.out.println(st2.navn);
                System.out.println(st2.alder);
            }
            break;

            case "Kim": {
                System.out.println(st3.navn);
                System.out.println(st3.alder);
            }
            break;

            case "Mathias": {
                System.out.println(st4.navn);
                System.out.println(st4.alder);
            }
            break;

            case "Mikkel": {
                System.out.println(st5.navn);
                System.out.println(st5.alder);
            }
            break;
            default: {
                System.out.println("Navn og alder er ikke i databasen");

            }


        }
    }
}