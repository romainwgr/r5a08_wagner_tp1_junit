package r5a08.tp1;

public class UserGreating {

    private String nom ;

    public String getNom() {
        return  this.nom ;
    }
    public UserGreating(String nom){
        this.nom=nom;
    }
    public  void setNom(String nom) {
        this.nom = nom ;
    }
    public String formatGreating(String nom){
        return "Bonjour," + nom;
    }
}
