package com.example.retos345.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.retos345.entities.Client;

public interface ClientRepository  extends JpaRepository<Client, Integer>{

    @Query(value = "Select * From client", nativeQuery = true)
    public String getAllClientsAndTotal();

}
