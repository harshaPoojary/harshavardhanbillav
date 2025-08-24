//java code to find the string is palindrome;
import java.util.*;
class Main{
    public static boolean pali(String name){
        StringBuilder rev=new StringBuilder();
        for(int c=name.length()-1;c>=0;c--){
            rev.append(name.charAt(c));
        }
        if(rev.toString().equals(name)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String name="madam";
        System.out.println("the given string is palindrom is:"+pali(name));
    }
}
output
  the given string is palindrom is:true
