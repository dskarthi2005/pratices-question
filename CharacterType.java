import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char  value = sc.next().charAt(0); 
        
        if ((value >= 'A' && value <= 'Z') || (value >= 'a' && value <= 'z')) {
            System.out.println("alphabet");
        } else if (value>= '0' && value<= '9') {
            System.out.println("digit");
        } else {
            System.out.println("special");
        }
    }
}
