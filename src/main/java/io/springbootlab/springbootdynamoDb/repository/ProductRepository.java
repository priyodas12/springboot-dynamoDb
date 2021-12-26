package io.springbootlab.springbootdynamoDb.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import io.springbootlab.springbootdynamoDb.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Product saveProduct(Product product){
        dynamoDBMapper.save(product);
        return product;
    }
}
