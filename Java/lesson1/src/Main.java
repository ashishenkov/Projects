import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.*;

/**
 * Java. Lesson 1. Homework
 * 1 Ввести вес и рост человека. Рассчитать и вывести индекс массы тела по формуле I=m/(h*h);
 * где m-масса тела в килограммах, h - рост в метрах.
 * 2 Найти максимальное из четырех чисел. Массивы не использовать.
 *3. Написать программу обмена значениями двух целочисленных переменных:
 a. с использованием третьей переменной;
 b. *без использования третьей переменной.
 * @author Alexandr Shishenkov
 * @version March 22, 2018
 */
public class Main {

    public static void main(String[] args) {

//        bodyIndex();
//        maxNumber();
        changeNumber();

    }

    static void changeNumber() {
        System.out.println("Inpet number1: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Inpet number2: ");
        Scanner scanner2 = new Scanner(System.in);
        int num1 = scanner2.nextInt();
        System.out.println("Input number " + "number1: " + num + " number2: "+num1);
        int c = num;
        num = num1;
        num1 = c;
        System.out.println("Output number: " + "number1: " + num + "  number2: "+num1);
        num = num + num1;
        num1 = num1 - num;
        num1 = -num1;
        num = num-num1;
        System.out.println("Output number: " + "number1: " + num + "  number2: "+num1);
    }


    static void maxNumber() {
        int max = 0;
        int num1 = 0;
        int i=0;
        do {

            System.out.println("Input number: ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            //num1 =  num;
            if (num1 > num){
                num1 = max;

            }else if(num1 < num){
                num1 = num;
            }
            max = num1;
            i++;
        }while (i != 4);
        System.out.println("Maximum number: " + max);

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