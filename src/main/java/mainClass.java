import java.util.Scanner;

public class mainClass {
    public static void main(String args[]){
        double inp;

        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        inp=sc.nextDouble();
        sqrtFun sF=new sqrtFun();
        double res=sF.sqrt(inp);
        System.out.println("Square root of "+inp+": "+res);

    }
}
