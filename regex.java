import java.util.regex.*;
import java.lang.*;
import java.io.*;
import java.util.*;
class Reg{
    
    public static void main(String[] args){
        
        String pattern = "^[a-zA-Z0-9_+&*-]+(?:\\." + 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$";
        Scanner sc= new Scanner(System.in);        
        
        String ch= sc.nextLine();
        
        Pattern p= Pattern.compile(pattern);
        Matcher m= p.matcher(ch);
        
        if (m.matches())
        {
            System.out.println("Yes");
            
        }
        
        else{ System.out.println("No");  }
        
        
    }
    
    
    
}
