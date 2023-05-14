package com.microservices.ProductmicroServices.service;

import com.microservices.ProductmicroServices.model.ProductRequest;
import com.microservices.ProductmicroServices.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);
}
