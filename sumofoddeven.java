import java.util.Scanner;
public class sumofoddeven{
     public static void main(String[]args){
        Scanner val=new Scanner(System.in);
        System.out.print("Enter the Inital Value:");
        int inital=val.nextInt();
        System.out.print("Enter the Final Value:");
        int finalvalue=val.nextInt();
        int ans=0;
        int odd=0;
        for(int i=inital;i<finalvalue;i++){
            if(i%2==0){
              ans+=i;
            }if (i%2==1){
              odd+=i;
            }
        }System.out.println(odd); 
        System.out.println(ans);
     }
}
