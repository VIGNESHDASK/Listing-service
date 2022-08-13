package org.ecom.app.ListService.repository;

import org.ecom.app.ListService.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends MongoRepository<Product,Long> {
}
