import javax.swing.JOptionPane;
import java.util.Scanner;

public class InputVariablesDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nowYear = 2023;
        String name;
        int age;
        double height;
        double mass;

        System.out.println("Ваше имя:");
        name = input.nextLine();
        System.out.println("Ваш возраст");
        age = input.nextInt();
        System.out.println("Ваш рост (в метрах): ");
        height = input.nextDouble();
        System.out.println("Ваш вес (в килограммах): ");
        mass = input.nextDouble();
        double bmi  = mass/height/height;
        System.out.println("Здравствуйте, " + name);
        System.out.println("Вы родились в: " + (nowYear-age) + " году");
        System.out.printf("Ваш индекс массы тела:%5.2f\n",bmi);

    }
}