import java.util.Scanner;
import java.util.ArrayList;

public class or_do {
  public static void main(String[] args) {
    Scanner get_pass = new Scanner(System.in);
    String password = get_pass.nextLine();
    
    char[] repl = new char[password.Length];
    
    for(int i = 0; i < repl.Length; i++) {
      repl[i] = '*';
    }
    
    System.out.println(repl);
  }
}
