import java.util.*;
public class p6{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        int reverse=0;
        while(a!=0){
            int digit= a%10;
            reverse= reverse*10+digit;
            a/=10;        }
            System.out.println(reverse);
    }
}