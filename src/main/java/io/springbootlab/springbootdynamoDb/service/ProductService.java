package io.springbootlab.springbootdynamoDb.service;

import io.springbootlab.springbootdynamoDb.entity.Product;
import io.springbootlab.springbootdynamoDb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        productRepository.saveProduct(product);
        return product;
    }

}
