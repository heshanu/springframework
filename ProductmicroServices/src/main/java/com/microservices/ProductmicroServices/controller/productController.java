package com.microservices.ProductmicroServices.controller;

import com.microservices.ProductmicroServices.model.ProductRequest;
import com.microservices.ProductmicroServices.model.ProductResponse;
import com.microservices.ProductmicroServices.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class productController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public void hello(){
        System.out.println("hello");
    }

    @PostMapping()
    public ResponseEntity<Long> addProduct(@RequestBody ProductRequest productRequest){
        long productId=productService.addProduct(productRequest);
        return new ResponseEntity<>(productId, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable("id") long productId){
        ProductResponse productResponse=productService.getProductById(productId);
        return new ResponseEntity<>(productResponse,HttpStatus.OK);
    }

}
