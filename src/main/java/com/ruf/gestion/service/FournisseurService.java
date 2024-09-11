package com.ruf.gestion.service;

import com.ruf.gestion.entity.Fournisseur;
import com.ruf.gestion.reposiory.FournisseurRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class FournisseurService {
    private FournisseurRepository fournisseurRepository;


    public  void createFournisseur(){}
    public  void getAllFournisseur(){}
    public  void getFournisseur(){}
    public  void getByIdFournisseur(Long id){}
    public  void updateByIdFournisseur(Fournisseur fournisseur){}
    public  void deleteAllFournisseur(){}
}
