import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        int b=a;
        int reverse=0;
        while(a!=0){
            int digit= a%10;
            reverse= reverse*10+digit;
            a/=10;        }
            if(reverse==b){
                System.out.println("Palindrome Number");
            }else{
                System.out.println("Not Plaindrome Number");
            }
    }
    
}
