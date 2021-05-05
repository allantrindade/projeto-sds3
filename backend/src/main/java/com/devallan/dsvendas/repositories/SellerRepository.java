package com.devallan.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devallan.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
