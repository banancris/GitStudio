import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        double a,b;
        char c;
        System.out.println("Введите 1 число: ");
        a = in.nextDouble();
        System.out.println("ведите 2 числo: ");
        b = in.nextDouble();
        System.out.println("Введите операцию: +,-,/,*");
        c = (char) System.in.read();
        if (b == 0 && c == '/') {
            System.out.println("Деление на 0 невозможно.");
            System.exit(1);
        }
        switch (c) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            default:
                System.out.println("Вы не ввели оператор!");

        }
    }
}
