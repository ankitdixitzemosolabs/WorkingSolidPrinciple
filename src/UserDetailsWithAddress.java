import java.util.Scanner;

public class UserDetailsWithAddress extends UserDetails{

    String address;
    Scanner keyboardInput=new Scanner(System.in);

    void setUserAdress(){
        System.out.println("enter adress");
        address=keyboardInput.nextLine();
    }

    void getUserAdress(){
        System.out.println("your adress :- " + address);
    }
}
