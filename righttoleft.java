import java.util.Scanner;
public class righttoleft {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.print("Enter the Value:");
        int num=val.nextInt();
        int ans=0;
        while(num>0){
            int digit=num%10;
            System.out.print(" "+digit);
            num/=10;
        }

    }
    
}
