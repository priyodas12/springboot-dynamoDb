package io.springbootlab.springbootdynamoDb.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@DynamoDBDocument //this will be an embedded object
public class ProductOrigin {

    @DynamoDBAttribute
    private String productOriginCountry;
    @DynamoDBAttribute
    private String mnfDate;

}
