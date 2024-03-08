package dao;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDao {
    public List<Etudiant> etudiants = new ArrayList<>();

    public Etudiant addEudiabt(Etudiant et)
    {etudiants.add(et);
     return et;
    }
    public List<Etudiant> getEtudiants(){
        return etudiants;
    }
}
