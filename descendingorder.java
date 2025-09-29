import java.util.Arrays;
import java.util.Scanner;
public class descendingorder{
    public static void main(String[] args) {
     Scanner val=new Scanner(System.in);
     System.out.print("Enter the size:");
     int size=val.nextInt();
     int arr[]=new int[size];
     for(int i=0;i<size;i++){
        arr[i]=val.nextInt();
     }  
     Arrays.sort(arr);
     for(int i=size-1;i>=0;i--){
        System.out.print(arr[i]+" ");
     }

 }   

    }
