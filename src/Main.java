import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      int a,temp,c=0;
      int n=0;
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(n>0){
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c){
            System.out.println("given number is a armstrong number");
        }
        else{
            System.out.println("given number is not a armstrong number");
        }
    }
}