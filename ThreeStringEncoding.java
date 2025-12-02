import java.util.*;
public class ThreeStringEncoding {
    public static String[] splitString(String s){
        int n=s.length();
        int rem=n%3;
        int front,middle,end;
        if(rem==0){
            front=middle=end=n/3;
        }else if(rem==1){
            front=end=n/3;
            middle=n/3+1;
        }else{
            front=end=n/3+1;
            middle=n/3;
        }
        String frontPart=s.substring(0,front);
        String middlePart=s.substring(front,front+middle);
        String endPart=s.substring(end+middle);

        return new  String[]{frontPart,middlePart,endPart};

    }

    public static String toggleCase(String s){
        StringBuilder b=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch))
                b.append(Character.toLowerCase(ch));
            else
                b.append(Character.toUpperCase(ch));

        }
        return b.toString();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();

        String []aParts=splitString(a);
        String []bParts=splitString(b);
        String []cParts=splitString(c);

        String op1=aParts[0]+bParts[0]+cParts[0];
        String op2=aParts[1]+bParts[1]+cParts[1];
        String op3=aParts[2]+bParts[2]+cParts[2];

        op3=toggleCase(op3);
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);

        sc.close();







 
    }

    
}
