package com.jonasoliveira.appdsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonasoliveira.appdsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
