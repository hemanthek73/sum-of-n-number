import java.util.Scanner;
public class sumofN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Number=sc.nextInt();
         int sum=0;
        System.out.println("enter the total numbers:"+Number);
        
       while(Number!=0){
        int temp=Number%10;
        Number=Number/10;
        sum=sum+temp;
       }
       System.out.println("the sum of all numbers is :"+sum);
       return;
    }
}
