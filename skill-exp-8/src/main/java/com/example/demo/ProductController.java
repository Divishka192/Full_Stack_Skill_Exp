package com.klu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @PostMapping("/add")
    public String addProducts() {

        repo.save(new Product(null,"Laptop","Electronics",65000,5));
        repo.save(new Product(null,"Mouse","Electronics",500,20));
        repo.save(new Product(null,"Keyboard","Electronics",1500,15));
        repo.save(new Product(null,"Chair","Furniture",3000,7));
        repo.save(new Product(null,"Pen","Stationery",20,100));

        return "Products Added Successfully";
    }

    @GetMapping("/sort")
    public List<Product> sortByPrice() {
        return repo.sortPriceAsc();
    }
}