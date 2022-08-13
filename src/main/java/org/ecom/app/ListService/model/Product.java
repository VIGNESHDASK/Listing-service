package org.ecom.app.ListService.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document(collection = "product")
public class Product {
    @Id
    private BigInteger id;
    private String name;

    private Long price;

    private Long offerPrize;



    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
