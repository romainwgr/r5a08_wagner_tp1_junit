
package r5a08.tp1;

import java.util.regex.Pattern;

public class UserGreating {
    public String formatGreating(String nom){
        if (!nom.isEmpty() && nom.length()<10){
            if (Pattern.matches("[a-zA-Z]", nom)){
                return "Bonjour, " + nom;
            }
        }

    }
}
