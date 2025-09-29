import java.util.*;
public class evenrange {
    public static void main(String[]args){
        Scanner val=new Scanner(System.in);
        System.out.print("Enter the Inital Value:");
        int value1=val.nextInt();
        System.out.print("Enter the Final Value:");
        int value2=val.nextInt();
        for(int i=value1;i<=value2;i++){
            if(i%2==0){
                     System.out.print(i+" ");
            }
            
        }
    }
    
}
