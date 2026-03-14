package com.klu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RepoImple implements CommandLineRunner {

    @Autowired
    private ProductRepository repo;

    @Override
    public void run(String... args) {

        repo.save(new Product(null,"Laptop","Electronics",65000,5));
        repo.save(new Product(null,"Mouse","Electronics",500,20));
        repo.save(new Product(null,"Keyboard","Electronics",1500,15));
        repo.save(new Product(null,"Chair","Furniture",3000,7));
        repo.save(new Product(null,"Pen","Stationery",20,100));

        System.out.println(repo.sortPriceAsc());
        
    }
}