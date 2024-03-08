import dao.Etudiant;
import dao.EtudiantDao;
import metier.EtudiantManager;

public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("ahmed","alhaj","zzzz");
        Etudiant e2 = new Etudiant("ahmed","akilhaj","zzzolz");
        Etudiant e3 = new Etudiant("ziko","alhaj","zzzz");
        Etudiant e4 = new Etudiant("ahmed","alhjaj","zzzz");
        EtudiantDao et= new EtudiantDao();
        EtudiantManager e = new EtudiantManager(et);
        e.addEtudiant(e1);
        e.addEtudiant(e2);
        e.addEtudiant(e3);
        e.addEtudiant(e4);
        for(Etudiant a : e.getEtudiant()){
            System.out.println(a);
        }
    }
}