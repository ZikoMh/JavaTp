package dao;

public class Etudiant {
    public static int id=1;
    public String nom;
    public String prenom;
    public String email;

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Etudiant( String nom, String prenom, String email) {
        id++;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }
}
