package ru.softwerke.practice.app2019.service;

import ru.softwerke.practice.app2019.model.Customer;

import java.util.List;

public interface CustomerDataService {
    String addCustomer(Customer customer);

    List<Customer> getCustomerList();

    Customer getCustomerById(String id);
}
