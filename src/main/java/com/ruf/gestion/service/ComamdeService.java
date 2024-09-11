package com.ruf.gestion.service;

import com.ruf.gestion.entity.Commande;
import com.ruf.gestion.reposiory.CommandeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ComamdeService {
    private CommandeRepository CommandeReposiory;

    public void createCommande(Commande commande){}
    public void getCommandeById(Long id){}
    public void getAllCommandeById(){}
    public void deleteCommandeById(Long id){}
    public void deleteAllCommandeById(){}
}
