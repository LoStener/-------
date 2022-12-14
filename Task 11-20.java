/* 11
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{

		String text = "Hi";
    int n = 0;
    StringBuilder repeat = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
        for (int j = 0; j < n; j++) {
            repeat.append(text.charAt(i));
        }
    }
    System.out.println(repeat);
		
	}
}
*/


/* 12

public class Main
{
	public static void main(String args[])
	{

		int[] M = { 3, 2, 1};
		int mx = M[0], mn = M[0];
		for(int i=1; i<M.length; i++) {
		  if (mx < M[i]) mx = M[i];
		  if (mn > M[i]) mn = M[i];
		}
		
    System.out.println (mx - mn);
		
	}
}
*/

/* 13
public class Main
{
	public static void main(String args[])
	{
		int[] numbers = { 1, 2, 3, 4};

		int sum = 0;
            for (int i = 0;i != numbers.length; i++){
				
                sum += numbers[i];
				
			}

			if(sum%numbers.length==0){
				System.out.println ("True");

			}
		else{
			System.out.println ("False");
		}
	}
}
*/

/* 14
public class Main
{
	public static void main(String args[])
	{
		int[] numbers = { 3, 3, -2, 408, 3,3};
		int temp[] = new int[numbers.length];
		int sum = 0;
            for (int i = 0;i != numbers.length; i++){

				temp [i]+= numbers[i]+sum;
                sum += numbers[i];
				
			}
				
			for (int i=0; i!=numbers.length;i++)
			System.out.println (temp[i]);
		}
	}

*/


/* 15
public class Main
{
	public static void main(String args[])
	{
		String str = "15,090";
        String[] words = str.split(",");
		System.out.println(words[1].length());
        
		
	}
}
*/



/* 16
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] f = new int[n];
		f[0] = 1;
		f[1] = 2;
		for (int i = 2; i < n; ++i) {
    		f[i] = f[i - 1] + f[i - 2];
}
    	System.out.println(f[n-1]);
	}
}
*/

/* 17
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a zip code: ");
        String zipCode = input.nextLine();

        System.out.println(isValid(zipCode));
    }

    public static boolean isValid(String zipCode) {
        boolean yes = false;
        // Check that only digits are accepted and the length is equals to 4
        if (zipCode.matches("[0-9]+") && zipCode.length() == 5) {
            yes = true;
        }
        return yes;
    }
}
*/


/* 18
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

		String fistString = "firsb"; // создаем 2 строки для сравнения
		String secondString = "btecof";

		char[] fArray = fistString.toCharArray();  // помещаем символы строк в массив для удобства сравнения
		char[] sArray = secondString.toCharArray();


        if((fArray[0] == sArray[secondString.length() - 1]) && (sArray[0] == fArray[fistString.length() - 1])) // условия сравнения из задачи. Находим первый символ и последний через длинну строки и вычитаем 1 для нахождения последнего символа в массиве
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
    }
}
*/


 /*  19 
    public static boolean isPrefix(String word, String prefix) {
        prefix = prefix.replaceAll("-$", "");
        return word.startsWith(prefix);
    }

    public static boolean isSuffix(String word, String suffix) {
        suffix = suffix.replaceAll("^-", "");
        return word.endsWith(suffix);
    }

    public static void main(String[] args) {
        System.out.println("isPrefix(\"automation\", \"auto-\") -> " + isPrefix("automation", "auto-"));
        System.out.println("isSuffix(\"arachnophobia\", \"-phobia\") -> " + isSuffix("arachnophobia", "-phobia"));
        System.out.println("isPrefix(\"retrospect\", \"sub-\") -> " + isPrefix("retrospect", "sub-"));
        System.out.println("isSuffix(\"vocation\", \"-logy\") -> " + isSuffix("vocation", "-logy"));
    }
*/

/* 20
public class Main {
    public static void main(String[] args) {

		String resault = ""; // переменная вывода фигуры
		int number = 37; //вводимое число
        if(((3 + Math.sqrt(12 * number - 3)) / 6) % 1 != 0) // формула валидации прямоугольника
			System.out.println("Invalid");
        
		else{	
		int temp = (int)((3 + Math.sqrt(12 * number - 3)) / 6); 
        int heightOfHex = temp + temp - 1; //считаем высоту шестиугольника
 
        for(int i = 0; i < heightOfHex;){
            
            int repeatTimes = Math.abs(++i - temp);
            resault += " ".repeat(repeatTimes);
            resault += "o ".repeat(heightOfHex - repeatTimes);
            resault += "\n";
             
        }
		System.out.println(resault);
	}
	}
}
*/