package ru.softwerke.practice.app2019.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
    private String id;
    private String name;

    public Customer() {
    }

    public Customer(String id) {
        this.id = id;
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
}
