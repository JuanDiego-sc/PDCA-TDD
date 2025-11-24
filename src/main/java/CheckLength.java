public class CheckLength {

private static final int MIN_LENGTH = 8;

public static boolean validateLength(String password){
  if (password == null){

  
    return false;
    }

    return password.length() >= MIN_LENGTH;
}

}
