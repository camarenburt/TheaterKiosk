import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;



        System.out.println("How old are you? ");
        age = scan.nextInt();

        if(age>=21){
            System.out.println("You get a wristband.");
        }
    }
}