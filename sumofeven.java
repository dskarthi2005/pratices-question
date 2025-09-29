import java.util.Scanner;
public class sumofeven {
     public static void main(String[]args){
        Scanner val=new Scanner(System.in);
        System.out.print("Enter the Inital Value:");
        int inital=val.nextInt();
        System.out.print("Enter the Final Value:");
        int finalvalue=val.nextInt();
        int ans=0;
        for(int i=inital;i<finalvalue;i++){
            if(i%2==0){
              ans+=i;
                          

            }
        } System.out.println(ans);
     }
}
