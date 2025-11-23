public class CheckUpperChar {

   public static boolean validateUpperCase(String password){
        if(password == null || password.isEmpty()) return false;

        for (char c : password.toCharArray()){
            if (Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
   }
}