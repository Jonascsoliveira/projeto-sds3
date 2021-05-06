package com.jonasoliveira.appdsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonasoliveira.appdsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
