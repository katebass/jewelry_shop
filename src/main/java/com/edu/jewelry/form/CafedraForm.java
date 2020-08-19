package com.edu.jewelry.form;

/*
 * @author Kateryna Basova
 * @version 11.08.2020
 */

public class CafedraForm {
    private String id;
    private String name;
    private String chief;
    private String description;

    public CafedraForm() {
    }

    public CafedraForm(String id, String name, String chief, String description) {
        this.id = id;
        this.name = name;
        this.chief = chief;
        this.description = description;
    }

    public CafedraForm(String name, String chief, String description) {
        this.name = name;
        this.chief = chief;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CafedraForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", chief='" + chief + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
