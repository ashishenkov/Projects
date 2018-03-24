import java.lang.reflect.Array;
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
 4 Написать программу нахождения корней заданного квадратного уравнения. ax2+bx+c=0
 5 С клавиатуры вводится номер месяца. Требуется определить, к какому времени года он относится.
 6. Ввести возраст человека (от 1 до 150 лет) и вывести его вместе с последующим словом «год», «года» или «лет».

 * @author Alexandr Shishenkov
 * @version March 22, 2018
 */
public class Main {

    public static void main(String[] args) {

//        bodyIndex();
//        maxNumber();
//        changeNumber();
//        foundRoots();
 //       season();
      //  humanAge();
        chessBoard();



    }

    static void chessBoard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x1");
        int x1 = scanner.nextInt();
        System.out.println("Input x2");
        int x2 = scanner.nextInt();
        System.out.println("Input y1");
        int y1 = scanner.nextInt();
        System.out.println("Input y2");
        int y2 = scanner.nextInt();
        x1+=x2;
        y1+=y2;
        if (x1%2==y1%2) {
            System.out.println("color is the same\n");
        }else System.out.println("color is not the same\n");


    }


    static void humanAge() {
        int i = 0;
        System.out.println("Input age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int t1 = age % 10;
        int t2 = age % 100;
        if(t1 == 1 && t2 != 11) {
            System.out.println("Возраст " + age + "год");
        }
        if(t1 >= 2 && t1 <= 4 && (t2 < 10 || t2 >= 20)) {
            System.out.println("Возраст " +age + " года");
        }else
            System.out.println("Возраст "  +age +" лет ");

    }

    static void season() {
       // final  int month = 12;
       // String [] array = ("зима","весна","лето","осень");
            System.out.println("Input number of month:");
            Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt();
            if(m <= 12){
                if(m < 6|| m == 12){
                    if(m < 3||m ==12)
                        System.out.println("\nSeason: Winter!");
                else
                        System.out.println("\nSeason: Spring!");
            }
            else
            {
                if(m < 9)
                    System.out.println("\nSeason: Summer!");
                else
                    System.out.println("\nSeason: Autumn!");
            }
        }
        else
                System.out.println("Number of month must be within at 1 to 12");
    }

    static void foundRoots() {
       DecimalFormat df = new DecimalFormat("#.##");
       df.setRoundingMode(RoundingMode.CEILING);

       System.out.println("Input a:");
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       System.out.println("Input b:");
       int b = scanner.nextInt();
       System.out.println("Input c:");
       int c = scanner.nextInt();

        double des = b*b -4*a*c;
       System.out.println("Discriminant: " +des);
     if (des <  0) System.out.println("No roots");
     if (des == 0) {
         double x2 = (-b - Math.sqrt(des)) / (2 * a);
         System.out.println("Two equal roots " + df.format(x2) );
        }
     if (des > 0) {
         double x1 = (-b - Math.sqrt(des)) / (2 * a);
         double x2 = (-b + Math.sqrt(des)) / (2 * a);
         System.out.println("One root " +df.format(x1) + "\nTwo root "+ df.format(x2));
     }
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