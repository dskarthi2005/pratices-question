import java.util.Scanner;

public class maxmin {
    public static void main(String[]args){
        Scanner val=new Scanner(System.in);
        System.out.println("Enter the Value:");
        int value1=val.nextInt();
        int value2=val.nextInt();
        if(value1>value2){
            System.out.println("max="+value1);
        }else{
            System.out.println("min="+value1);
        }
            if(value2<value1){
            System.out.println("min="+value2);
        }else{
            System.out.println("max="+value2);
        }
    }
    
}
