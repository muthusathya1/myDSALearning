import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        reversePrintString(string);
            }
        
            private static void reversePrintString(String string) {
                if (string.length()==0) {
                    return;
                }
                reversePrintString(string.substring(1));
                System.out.print(string.charAt(0));
            }
    
}