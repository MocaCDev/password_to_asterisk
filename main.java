import set_it_up.set_it_up.set_it_up;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws StringIndexOutOfBoundsException, Exception {
    Scanner get_password = new Scanner(System.in);
    set_it_up setup = new set_it_up() {
      @Override 
      public void get_setup(String pas) {
        password(pas);
      }
    };
    System.out.print("PASSWORD: ");
    String password = get_password.nextLine();
    if(password.length() > 21) {
      throw new StringIndexOutOfBoundsException("Password is too long");
    } else {
      System.out.println("\n\n\n");
      setup.get_setup(password);
    }
  }
}
