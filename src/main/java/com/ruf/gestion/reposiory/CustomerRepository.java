package com.ruf.gestion.reposiory;

import com.ruf.gestion.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository < Long , Client> {
}
