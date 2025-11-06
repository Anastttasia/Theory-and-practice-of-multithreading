package ru.vladykina.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vladykina.demo.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}
