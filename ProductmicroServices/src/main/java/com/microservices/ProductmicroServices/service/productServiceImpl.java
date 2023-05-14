package com.microservices.ProductmicroServices.service;

import com.microservices.ProductmicroServices.entity.ProductEntity;
import com.microservices.ProductmicroServices.exception.ProductServiceCustomException;
import com.microservices.ProductmicroServices.model.ProductRequest;
import com.microservices.ProductmicroServices.model.ProductResponse;
import com.microservices.ProductmicroServices.respository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log4j2
public class productServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public long addProduct(ProductRequest productRequest) {
        log.info("Adding products");

        ProductEntity product=ProductEntity.builder()
                .productName(productRequest.getName())
                .quantity(productRequest.getQuantity())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);

        log.info("product created");
        return product.getProductId();

    }

    @Override
    public ProductResponse getProductById(long productId) {
        log.info("get the product for productId {}"+productId);

       ProductEntity product=productRepository.findById(productId)
               .orElseThrow(()->new ProductServiceCustomException("Product with given couldnt find","Product not found"));

        ProductResponse productResponse=new ProductResponse();
        BeanUtils.copyProperties(product,productResponse);

        return productResponse;
    }
}
