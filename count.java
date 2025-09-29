import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.print("Enter the Value:");
        int num=val.nextInt();
        int count=1;
        while(num>0){
            int digit=num%10;
            
            num/=10;
            count++;
            
        }System.out.println(count);

    }
    
}
