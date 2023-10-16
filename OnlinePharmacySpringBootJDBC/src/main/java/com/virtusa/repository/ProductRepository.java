package com.virtusa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
