package ma.ensa.flottproject1.service;


import ma.ensa.flottproject1.entities.conducteur.Conducteur;
import ma.ensa.flottproject1.entities.conducteur.Permis;

import java.util.List;

public interface PermisService {
    Permis createPermis(Permis permis);

    public Permis updatePermis(Long id, Permis newPermis);
    public void deletePermis(Long id);
    public Permis getPermisById(Long id);
    public List<Permis> getAllPermis();
}
