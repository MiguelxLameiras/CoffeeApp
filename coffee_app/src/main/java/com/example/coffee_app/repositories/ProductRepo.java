
package com.example.coffee_app.repositories;

import com.example.coffee_app.classes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    // Métodos customizados podem ser adicionados aqui
}