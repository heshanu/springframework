package com.microservices.ProductmicroServices.respository;

import com.microservices.ProductmicroServices.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
}
