package com.ruf.gestion.reposiory;

import com.ruf.gestion.entity.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository  extends JpaRepository<Long, Fournisseur> {
}
