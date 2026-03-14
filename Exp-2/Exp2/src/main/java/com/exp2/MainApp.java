package com.exp2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        // Load Hibernate config and build session factory
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); // config file in resources folder
        SessionFactory factory = cfg.buildSessionFactory();

        // Open session and start transaction
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        // Create and save products
        Product p1 = new Product("Laptop", "Gaming Laptop", 1200, 5);
        Product p2 = new Product("Mouse", "Wireless Mouse", 25, 20);

        session.persist(p1);
        session.persist(p2);

        tx.commit();

        // Retrieve a product by ID
        Product prod = session.get(Product.class, p1.getId());
        System.out.println("Retrieved: " + prod);

        // Update product price and quantity
        tx = session.beginTransaction();
        prod.setPrice(1300);
        prod.setQuantity(4);
        session.update(prod);
        tx.commit();

        // Delete a product by ID
        tx = session.beginTransaction();
        Product toDelete = session.get(Product.class, p2.getId());
        if (toDelete != null) {
            session.delete(toDelete);
            System.out.println("Deleted product: " + toDelete.getName());
        }
        tx.commit();

        // Close session and factory
        session.close();
        factory.close();
    }
}