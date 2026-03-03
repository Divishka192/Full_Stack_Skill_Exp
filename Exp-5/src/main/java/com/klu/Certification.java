package com.klu;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id;
    private String name;
    private String dateOfCompletion;

    // Default Constructor
    public Certification() {
        this.id = 101;
        this.name = "Java Programming";
        this.dateOfCompletion = "10-02-2026";
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfCompletion() {
        return dateOfCompletion;
    }

    @Override
    public String toString() {
        return "Certification [id=" + id + 
               ", name=" + name + 
               ", dateOfCompletion=" + dateOfCompletion + "]";
    }
}
