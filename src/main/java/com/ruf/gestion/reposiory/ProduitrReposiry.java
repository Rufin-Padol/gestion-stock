package com.ruf.gestion.reposiory;

import com.ruf.gestion.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitrReposiry extends JpaRepository <Long , Produit> {
}
