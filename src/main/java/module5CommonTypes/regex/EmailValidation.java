package module5CommonTypes.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z]+\\.[a-zA-Z]+$";
            //dhivyadarsshni16 @ gmail . com

        Pattern pattern = Pattern.compile(emailRegex);

        System.out.print("Enter your email ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Matcher matcher = pattern.matcher(input);

        if(!matcher.matches()){
            throw new IllegalArgumentException("Error, Invalid email");
        }else {
            System.out.println("Valid email");
        }
        sc.close();

    }
}
/**
 * 🔹 Common real-world Regex patterns
 * 📧 Email
 * ^[a-zA-Z0-9._]+@[a-z]+\\.com$
 *
 * 📱 Phone number (India – 10 digits)
 * ^[6-9]\\d{9}$
 *
 * 🔐 Password (min 8 chars, letters + digits)
 * ^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$
 */
