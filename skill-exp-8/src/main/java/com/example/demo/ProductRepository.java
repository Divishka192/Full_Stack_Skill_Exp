package com.klu;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("FROM Product p ORDER BY p.price ASC")
    List<Product> sortPriceAsc();

    @Query("FROM Product p ORDER BY p.price DESC")
    List<Product> sortPriceDesc();

    @Query("FROM Product p ORDER BY p.quantity DESC")
    List<Product> sortQuantityDesc();

    @Query("SELECT COUNT(p) FROM Product p")
    Long countTotal();
}