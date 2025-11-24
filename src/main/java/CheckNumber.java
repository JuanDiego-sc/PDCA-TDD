public class CheckNumber {
    public static boolean validateContainsNumber(String password) {
        
        if (password == null || password.isEmpty()) {
            return false;
        }

        String digits = "0123456789";

        for (char c : password.toCharArray()) {
            if (digits.indexOf(c) != -1) {
                return true; 
            }
        }
        
        return false;
    }
}