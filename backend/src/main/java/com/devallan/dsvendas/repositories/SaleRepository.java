package com.devallan.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devallan.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
