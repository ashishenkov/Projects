import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.*;

/**
 * Java. Lesson 1. Homework
 * 1 Ввести вес и рост человека. Рассчитать и вывести индекс массы тела по формуле I=m/(h*h);
 * где m-масса тела в килограммах, h - рост в метрах.
 *
 * @author Alexandr Shishenkov
 * @version March 22, 2018
 */
public class Main {

    public static void main(String[] args) {

    bodyIndex();

    }


public static void bodyIndex() {
    DecimalFormat df = new DecimalFormat("#.##");
    df.setRoundingMode(RoundingMode.CEILING);
    System.out.println("Input man's weight in kg : ");
    Scanner scanner = new Scanner(System.in);
    int v = scanner.nextInt();
    System.out.println("Input man's height in m: ");
    float h = scanner.nextFloat();
    float idx = (v / (h * h));
    System.out.println("Body mass index : \n" + df.format(idx));
}
}