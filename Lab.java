import java.util.Random;
/*
3. Part A
A1: It will print "true" 4 times.
A2: In order to assign a value to a variable, in this case it's "c", that keeps track of the character in
the password during the loop.
A3: simply because the password is length is 9 and not 10 since it counts the first character as the "0". by having
"<= password.length()", it would keep counting to 10 and add an undesired loop.
A4: the loop would not run since there are no characters to count. the lines will also print false 4 times.
A5: No, lower will be false.
A6: No, upper will be false.

4. Part B
Before coding part
1. the accumulator should be 0 initially.
2. an if statement that checks if it's a digit.
3. when the loop is over.

5. Part C
Think first question: boolean flags are better since they keep track of which character is upper/lower/digit .

6. Part D
Answer found in the code below.

7. Part E
Answer found in the code below.

8. Part F
JUnit testing in Testing.java

9. Part G
G1. Because whether the first character is a digit or not, it will either return false if it's not a digit and return true
if it is immediately after the first loop.
G2. the method will return true.
G3. the method will return false.
G4. It's simply because the method will return immediately, so no need to have a variable tracking any values.
G5. The loop won't even run if the text is "" and will go to return false right away. It will return false.

10. Part H
Answer in StudentAccessValidator.java

11.
Answer is in StudentAccessValidator.java

12. Part J
Method chosen: countDigits(String text)
    1. its input is a chosen String.
    2. its output will be an integer, meant to count the amount of digits in the input, the String.
    3. the method assumes String text is not null, because if it is, it will cause an error due to the loop checking if
    the length of the object, but it being null will crash it.
    4. an edge case for this method would be if the text length was 0.
    5. a possible future modification would be to add additional lines to ensure the method doesn't crash when the text
    is null. for example:
    if (text == null)
        return 0;
    6. testing if the text is null will catch a bug

13. Responsible AI Activity
The AI I used was claude (Sonnet 5 medium version) to verify my countUppercase() method.
    4. The suggestion I actually thought was useful was adding extra lines of code to make sure that having a null input
    would not crash the code, just like the countDigits method I was reviewing on the previous question.
    5. one suggestion I did not blindly accept was replacing the for loop with a for-each loop. It's simply not "better"
    and the for loop I have in place is solid and functional.

14. Submission checklist
Everything done.
 */
public class Lab {
// check testgeneratecode_boundary in testing.java

    void main() {

        //6. Part D result test & recordings.
        System.out.println(countUppercase("Vanier"));
        System.out.println(countUppercase("VANIER"));
        System.out.println(countUppercase("vanier"));
        System.out.println(countUppercase("V1A2"));
        System.out.println(countUppercase(""));

        String password = "Vanier2026";

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c))
                upper = true;
            else if (Character.isLowerCase(c))
                lower = true;
            else if (Character.isDigit(c))
                digit = true;
        }

        System.out.println(upper);
        System.out.println(lower);
        System.out.println(digit);
        System.out.println(upper && lower && digit);
    }

    public static int countDigits(String text) {
        int digits = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c))
                digits++;
        }
        return digits;
    }

    public static boolean isValidPassword(String password) {
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean correct = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c))
                upper = true;
            else if (Character.isLowerCase(c))
                lower = true;
            else if (Character.isDigit(c))
                digit = true;
        }
        if (upper && lower && digit && password.length() >= 8)
            correct = true;
        return correct;
    }

    public static int countUppercase(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i)))
                count++;
        }

        return count;
    }

    // 7. Part E Answer
    public static String generateCode() {
        String allowed = "ABCDE";
        Random random = new Random();
        String code = "";

        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(5);
            char c = allowed.charAt(index);
            code += c;
        }
        return code;
    }
}
