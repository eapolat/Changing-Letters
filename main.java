import java.util.Scanner;


public class deneme {
    
    static final String KEY = "a@bpdqi!l1mwnuo0s5t+z2A4B8E3G6WM";

    public static char convertChar( char c) {
        
        int index_of_char = KEY.indexOf(c);

        if (index_of_char != -1) {

            if (index_of_char % 2 != 0) {

                return c;
            }
            else {
            
                return KEY.charAt(index_of_char + 1);
            }

        }
        return c;

    }

    public static String convertText(String original_text) {

        String converted_text = "";
        
        for (int i = 0; i < original_text.length(); i++ ) {

            converted_text = converted_text + convertChar(original_text.charAt(i));
        }

        return converted_text;
    }

    public static int countNumbers(String converted_text) {

        int count = 0;
        for ( int i = 0; i < converted_text.length(); i++ ) {

            char test_char = converted_text.charAt(i);

            if (Character.isDigit(test_char)){

                count++;

            }

        }
        return count;

    }

    public static void main (String [] args) {

        Scanner myscan = new Scanner (System.in);

        System.out.print("Enter a phrase for conversion: ");
        String original_text = myscan.nextLine();

        boolean blank_test = false;

        if (original_text == "" || original_text == " " ) {

            System.out.println("No phrase entered.");
            blank_test = true; 
        }
        else {
            System.out.println("Text you entered: " + original_text);
            System.out.println("After conversion: " + convertText(original_text));

        }
        if (countNumbers(convertText(original_text)) == 0 && !blank_test) {

            System.out.println("!! Attention !! There is no number in this text");

        }
        if (original_text.equals(convertText(original_text)) && !blank_test) {

            System.out.println("No conversion happened.");

        }

        myscan.close();

    }

}
