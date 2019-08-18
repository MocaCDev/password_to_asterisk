package set_it_up.set_it_up;
import setup_pass.setup_pass.setup_pass;
import java.util.ArrayList;

public abstract class set_it_up implements setup_pass {
    
  protected StringBuilder pass_word;
    
  @Override
  public void password(String password_) {
        
    StringBuilder pass = new StringBuilder(password_);
    ArrayList<StringBuilder> password_data = new ArrayList<StringBuilder>();
        
    try {
      for (int i = 0; i < password_.length(); i++) {
        pass.setCharAt(i,'*');
        this.pass_word = pass; 
      }
    } catch (Exception e) {
      System.out.println(e);
    }
        
    password_data.add(this.pass_word);
        
    System.out.println("Password: "+this.pass_word);
    System.out.println("Data: " + password_data);
  }
    
  abstract public void get_setup(String pas);
}
