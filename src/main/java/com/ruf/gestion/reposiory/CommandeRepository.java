package com.ruf.gestion.reposiory;

import com.ruf.gestion.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Long, Commande> {


}
