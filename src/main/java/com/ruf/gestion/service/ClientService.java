package com.ruf.gestion.service;


import com.ruf.gestion.entity.Client;
import com.ruf.gestion.reposiory.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ClientService {
    private CustomerRepository customerRepository;

    private void creatClient(){}
    private void getAllClient(){}
    private  void getClientById(Long id){}
    private void getClientByEmail(String Email){ }
    private void updateClient(Long Id , Client client){ }

    private void deleteALLClient(){ }
    private void deleteClientById(Long Id){ }
}
