public class CheckSpecialChar {

    public static boolean validateSpecialChar(String password) {
        if (password == null || password.isEmpty()) return false;

        String specialChars = "@#!$%^&*()_+-=[]{}|;:',.<>?/~`";

        for (char c: password.toCharArray()) {
            if (specialChars.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }
}







//"@#!$%^&*()_+-=[]{}|;:',.<>?/~`"