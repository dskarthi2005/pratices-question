import java.util.Scanner;

public class posornev {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int value=val.nextInt();
        if(value<0){
            System.out.print("Negative");
        }
        else if(value==0){
            System.out.print("Zero");
        }
            else{
            System.out.print("Positive");
        }
    }
    
}
