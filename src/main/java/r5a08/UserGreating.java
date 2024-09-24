package r5a08;

import java.util.regex.Pattern;

public class UserGreating {
    public static String formatGreating(String nom) throws UserGreatingFailureException{

        if(!nom.isEmpty() && nom.length()<10){
            if(Pattern.matches("^[a-zA-Z ]*$",nom)){
                return "Bonjour, " + nom;
            }
        }
        throw new UserGreatingFailureException("Nom incorrect");
    }

    public static class UserGreatingFailureException extends Exception {
        public UserGreatingFailureException(String s){
            super(s);
        }
    }
}
