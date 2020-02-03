import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();
        while((number<100)||(number>200)||(number%3!=0)){
            if (number < 100) {
                System.out.println("Liczba jest za mała");
            } else if (number > 200) {
                System.out.println("Liczba jest za duża");
            } else {
                System.out.println("Liczba jest niepodzielna przez 3");
            }
            System.out.println("Podaj inną liczbę: ");
            number = scanner.nextInt();
        }
        System.out.println("Dobra liczba");
    }
}
