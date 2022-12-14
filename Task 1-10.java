/* 
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{

		Scanner in = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int num1 = in.nextInt();
		System.out.print("Input a number 2: ");
        int num2 = in.nextInt();

		System.out.println(num1 % num2);
		
	}
}

*/

/* 2
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{

		Scanner in = new Scanner(System.in);
        System.out.print("Введите основание: ");
        int num1 = in.nextInt();
		System.out.print("Введите высоту: ");
        int num2 = in.nextInt();

		System.out.println("Площадь треугольника: " + (num1 * num2)*0.5 );
		
	}
}
*/


/* 3
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{

		Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
		num1=num1*2;
		System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
		num2=num2*4;
		System.out.print("Введите третье число: ");
        int num3 = in.nextInt();
		num3=num3*4;

		System.out.println( num1 +num2 + num3 );
	}
}
*/


/* 4
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{

		Scanner in = new Scanner(System.in);
        System.out.print("prob: ");
        double prob = in.nextDouble();
		
		System.out.print("prize: ");
        double prize = in.nextDouble();
		
		System.out.print("pay: ");
        double pay = in.nextDouble();
		boolean flag;

		if ((prob*prize)>pay){
			flag=true;
			System.out.println(flag );}
		else {
		flag=false;
		System.out.println( flag );}
	}
}
*/


/* 5
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{

		Scanner in = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int n = in.nextInt();
		System.out.print("Input a number 2: ");
        int a = in.nextInt();
		System.out.print("Input a number 3: ");
        int b = in.nextInt();


		if(a+b==n){
			System.out.println("Сложение");
		}
		else if(a-b==n){
			System.out.println("Вычитание");
		}
		else if(a/b==n){
			System.out.println("Деление");
		}
		else if(a*b==n){
			System.out.println("Умножение");
		}

		else{
			System.out.println("None");

		System.out.println();
		}
	}
}
*/

/* 6
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{

		Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        char c = in.next().charAt(0);

		System.out.println((int)c);
		
	}
}

*/

/* 7
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{

		Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
		int sum=0;
		int count = 1;
        while (count <= n) {
			sum=sum+count;
            count++;
        }
		System.out.println("Count is: " + sum);
	}
}
*/


/* 8
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{

		Scanner in = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int num1 = in.nextInt();
		System.out.print("Input a number 2: ");
        int num2 = in.nextInt();

		System.out.println((num1 + num2)-1);
		
	}
}
*/


/* 9
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{

		Scanner in = new Scanner(System.in);
        
		int[] numbers = { 2, 2};

		int sum = 0;
            for (int i = 0; i < numbers.length; i++){
                sum += numbers[i] * numbers[i] * numbers[i];}
		System.out.println (sum);
	
		}
}
*/

/* 10
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		int[] numbers = { 5, 2, 1};

		int sum = 0;
		int temp = numbers[0];
            for (int i = 0;i != numbers[1]; i++){
				
                sum += temp+temp;
				temp = sum;
			}

			if(sum%numbers[2]==0){
				System.out.println ("True");

			}
		else{
			System.out.println ("False");
		}
	}
}
*/