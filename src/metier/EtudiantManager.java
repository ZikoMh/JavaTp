package metier;

import dao.Etudiant;
import dao.EtudiantDao;

import java.util.List;

public class EtudiantManager {
    public EtudiantDao etudiantDao;
    public EtudiantManager(EtudiantDao  e){
        this.etudiantDao=e;
    }
    public Etudiant addEtudiant(Etudiant e){
        if(etudiantDao.getEtudiants().isEmpty()){
            etudiantDao.addEudiabt(e);
        }
        else{
           int c=0;
           for(Etudiant et :etudiantDao.getEtudiants() ) {
               if(et.email.equals(e.email)){
                   c=1;
               }
           }
           if(c==0){
               etudiantDao.addEudiabt(e);
           }
        }
        return e;
    }
    public List<Etudiant> getEtudiant(){
        return etudiantDao.getEtudiants();
    }
}
