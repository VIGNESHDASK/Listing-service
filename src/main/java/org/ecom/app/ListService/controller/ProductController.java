package org.ecom.app.ListService.controller;


import org.ecom.app.ListService.model.Product;
import org.ecom.app.ListService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getAllQualifications() {

        return productRepository.findAll();
    }

    @PostMapping("/products")
    public Product getAllQualifications(@RequestBody Product product) {
        Product result = productRepository.save(product);

        return result;
    }
}
