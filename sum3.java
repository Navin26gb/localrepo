import java.util.Scanner;
public class sum3 {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number:");
        float a = sc.nextFloat();
        System.out.print("Enter second number:");
        float b = sc.nextFloat();
        System.out.print("Enter third number:");
        float c = sc.nextFloat();
        float sum = a+b+c;
        System.out.print("the sum of three numbre is:");
        System.out.println(sum);

    }
    
}
