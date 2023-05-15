package com.microservices.ProductmicroServices.service;

import com.microservices.ProductmicroServices.entity.ProductEntity;
import com.microservices.ProductmicroServices.model.ProductRequest;
import com.microservices.ProductmicroServices.model.ProductResponse;

import java.util.List;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    List<ProductEntity> getAll();
}
