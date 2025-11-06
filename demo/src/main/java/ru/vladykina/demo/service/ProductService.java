package ru.vladykina.demo.service;

import org.springframework.stereotype.Service;
import ru.vladykina.demo.domain.Product;
import ru.vladykina.demo.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    public Product getProduct(String productNumber){
        Optional<Product> productOpt = repository.findById(productNumber);
        return productOpt
                .orElseThrow(()-> new RuntimeException("Продукт не найден" + productNumber));
    }

    public Product saveProduct(Product product){
        return repository.save(product);
    }
}
