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
 7. С клавиатуры вводятся числовые координаты двух полей шахматной доски (x1,y1,x2,y2). Требуется определить,
     относятся ли к поля к одному цвету или нет.
 8. Ввести a и b и вывести квадраты и кубы чисел от a до b.
 9. Даны целые положительные числа N и K. Используя только операции сложения и вычитания,
    найти частное от деления нацело N на K, а также остаток от этого деления.
 10. Дано целое число N (> 0). С помощью операций деления нацело и взятия остатка от деления определить,
    имеются ли в записи числа N нечетные цифры. Если имеются, то вывести True, если нет — вывести False.
 11. С клавиатуры вводятся числа, пока не будет введен 0.
    Подсчитать среднее арифметическое всех положительных четных чисел, оканчивающихся на 8.

 * @author Alexandr Shishenkov
 * @version March 24, 2018
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("*********Упражнение 1***************");
        bodyIndex();
        System.out.println("*********Упражнение 2***************");
        maxNumber();
        System.out.println("*********Упражнение 3***************");
        changeNumber();
        System.out.println("*********Упражнение 4***************");
        foundRoots();
        System.out.println("*********Упражнение 5***************");
        season();
        System.out.println("*********Упражнение 6***************");
        humanAge();
        System.out.println("*********Упражнение 7***************");
         chessBoard();
        System.out.println("*********Упражнение 8***************");
        quickPow();
        System.out.println("*********Упражнение 9***************");
        quotient();
        System.out.println("*********Упражнение 10***************");
        average();
    }

    static void average() {
        int k = 0;
        int s = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N: ");
        int n = scanner.nextInt();

        while ( n!=0 ) {
            k = k + 1;
            s = s + n;
            System.out.println("Input N: ");
            n = scanner.nextInt();
        }
            if (s % 8 ==0) System.out.println("Average:  " + s/k);
    }

    static void quotient() {    // частное от деления
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input N: ");
        int n = scanner.nextInt();
        System.out.println("Input K: ");
        int k = scanner.nextInt();
        int h = 0;
        int o = 0;
        int res = n;
        while (n >= k){
                 h = h+1;
                 n = n -k;
        }
       o = n;
        System.out.println("Частное: " + h + "\tОстаток:" + o);
        int result = 0;
        while ( res > 0)
        {
            result = result + res % 2;
            res = res / 10;
        }
        if (result> 0 && res == 0) System.out.println("True");
        else System.out.println("False");
    }

    private static void quickPow() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input power a: ");
        int a = scanner.nextInt();
        System.out.println("Input power b: ");
        int b = scanner.nextInt();
        long b1= b;
        long n = 1;
        while (b!=0) {
            n = a * a * a;
            b--;
        }
        b1 =a * a;
        System.out.println("Square Power : " + b1 + "\tCube Power: "+n);
    }

//
//        while ( b!=1 ) {
//            if ( b % 2) {
//                b --;
//                n *= a;
//            } else {
//                a *= a;
//                b /= 2;
//            }
//        }
   //     System.out.println(" "+a +" "+b +" " +n);


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