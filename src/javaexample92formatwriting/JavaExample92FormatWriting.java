
package javaexample92formatwriting;

import java.io.PrintWriter;
import java.util.Locale;


public class JavaExample92FormatWriting {

    
    public static void main(String[] args) {
        
        /*
        Prints formatted representations of objects to a text-output stream. 
        This class implements all of the print methods found in PrintStream. 
        It does not contain methods for writing raw bytes, for which a program 
        should use unencoded byte streams.
        
        Unlike the PrintStream class, if automatic flushing is enabled it will
        be done only when one of the println, printf, or format methods is
        invoked, rather than whenever a newline character happens to be output. 
        These methods use the platform's own notion of line separator rather 
        than the newline character.

        Methods in this class never throw I/O exceptions, although some of 
        its constructors may. The client may inquire as to whether any errors 
        have occurred by invoking checkError().
        */
        
        /*
        public PrintWriter(Writer out, boolean autoFlush);
        out - A character-output stream
        autoFlush - A boolean; if true, the println, printf, 
        or format methods will flush the output buffer
        */
        
        PrintWriter pw = new PrintWriter(System.out, true);
        
        String str = "abcdefgh";
        int n = 35;
        double d = 5.85;
        
        
        // Look at ->
        // https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
        
        // Formats the argument as a decimal integer. The localization algorithm
        // is applied.
        pw.printf("%d", n);
        pw.println();
        
        // Requires the output to be formatted using decimal format. 
        // The localization algorithm is applied.
        // The result is a string that represents the sign and magnitude 
        // (absolute value) of the argument. The formatting of the sign is 
        // described in the localization algorithm. The formatting of the 
        // magnitude m depends upon its value.
        pw.printf("%f", d);
        pw.println();
        
        // Requires the output to be formatted using computerized scientific 
        // notation. The localization algorithm is applied.
        // The formatting of the magnitude m depends upon its value.
        pw.printf("%e", d);
        pw.println();
        
        // The result is formatted using computerized scientific notation or
        //decimal format, depending on the precision and the value after rounding.
        pw.printf("%g", d);
        pw.println();
        
        // Produces a string.
        pw.printf("%s", str);
        pw.println();
        
        // The upper-case variant of 's'.
        pw.printf("%S", str);
        pw.println();
        
        // Produces a string representing the hash code value of the object.
        pw.printf("%h", str);
        pw.println();
        
        pw.println();
        pw.println();
        
        pw.printf("%+d", n);
        pw.println();
        
        pw.printf("%d", -n);
        pw.println();
        
        pw.println();
        pw.println();
        
        double p = 1000 * 10.0 / 3;
        pw.printf("%.7f", p);
        pw.println();
        
        pw.printf(Locale.US, "%.7f", p);
        pw.println();
        
        pw.printf(Locale.US, "%,.7f", p);
        pw.println();
        
        pw.printf("%.7e", p);
        pw.println();
        
        pw.println();
        pw.println();
        
        double d1=1.2;
        double d2=12.5;
        double d3=125.7;
        
        // %[argument_index$][flags][width][.precision]conversion
        
        pw.printf("%7d", n);
        pw.println();
        
        pw.printf("%-7d", n);
        pw.println();
        
        pw.printf("%7.1f", d1);
        pw.println();
        
        pw.printf("%7.1f", d2);
        pw.println();
        
        pw.printf("%7.1f", d3);
        pw.println();
        
        pw.println();        
        pw.println();
        
        String s1 = "n1 = ";
        int n1 = 64;
        String s2 = "n2:";
        int n2 = 1124;
        
        pw.printf("%s%d", s1, n1);
        pw.println();
        
        pw.printf("%-5s%6d", s2, n2);
        pw.println();
        
        pw.println();
        pw.println();
        
        pw.printf("n1 = %d", n1);
        pw.println();
        
        pw.printf("n1 = %d, n2 = %d\n", n1, n2);
        
        pw.printf("Amount: %d\n", n1);
        
        pw.printf("Price: %d\n", n2);
        
        pw.printf("%-10s:%5d\n", "Amount", n1);
        
        pw.printf("%-10s:%5d\n", "Price", n2);

    }
    
}
