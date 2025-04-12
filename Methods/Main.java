
import java.util.Scanner;
public class Main {
    public static int sumFirstAndLast(int number){
        if (number <0){
            return -1;
        }
        int lastNumber =number%10;
        int firstNumber = number;
        while(firstNumber>=10){
            firstNumber/=10;

        }
        return firstNumber+lastNumber;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number to sum First number and Last number : ");
        Scanner input=new Scanner (System.in);
        int num=input.nextInt();
        int result =sumFirstAndLast(num);

        if (result ==-1){
            System.out.print("Negative number detected!  ");
            System.out.print("\n Done");
        }
        else
            System.out.print("Sum of first and last numbers are "+result);
    }
}
