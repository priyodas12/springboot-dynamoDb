package io.springbootlab.springbootdynamoDb.controller;


import io.springbootlab.springbootdynamoDb.entity.Product;
import io.springbootlab.springbootdynamoDb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/api/dynamoDb/products")
    public Product saveEmployee(@RequestBody Product product){
        System.out.println("controller layer:: "+product.toString());
        return productService.saveProduct(product);
    }
}
