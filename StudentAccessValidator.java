// 10. Part H
public class StudentAccessValidator {
    public static boolean isValidStudentId(String id){
        // rule 1
        char c = id.charAt(0);
        if (id.length()!= 7)
            return false;
        // rule 2
        if (c != 'V')
            return false;
        // rule 3
        for (int i = 1; i < id.length(); i++){
            if (!Character.isDigit(id.charAt(i)))
                return false;
        }
            return true;
    }

    public static boolean isValidPassword(String password){
       return Lab.isValidPassword(password);
    }

    public static String generateAccessCode(){
        String AccessCode = Lab.generateCode();
        return AccessCode;
    }

    public static boolean isValidAccess(String id, String password, String generatedCode, String enteredCode){
        return isValidStudentId(id) && isValidPassword(password) && verifyAccessCode(generatedCode, enteredCode);
    }

    public static boolean verifyAccessCode(String generatedCode, String enteredCode){
        generatedCode = generateAccessCode();
        return generatedCode.equals(enteredCode);
    }
}
