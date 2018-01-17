package com.hendisantika.springbootrest.service;

import com.hendisantika.springbootrest.domain.Customer;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-rest
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/01/18
 * Time: 05.32
 * To change this template use File | Settings | File Templates.
 */
public interface CustomerService {
    /**
     * To return a customer object fetched by ID
     *
     * @param customerId customer ID
     * @return Customer object
     */
    Customer findById(Long customerId);

    /**
     * @return the list of all customers
     */
    List<Customer> findAllCustomers();

    /**
     * @param customer Customer entity to be saved
     */
    Customer saveCustomer(Customer customer);

    /**
     * @param customer Customer entity to check existence
     * @return true if exist; otherwise, return false
     */
    Boolean isCustomerExist(Customer customer);

    /**
     * @param id       customer ID to be updated
     * @param customer updated customer entity
     * @return updated customer entity
     */
    Customer updateCustomer(Long id, Customer customer);

    /**
     * @param id       customer ID to be updated
     * @param customer updated customer entity
     * @return patched customer entity
     */
    Customer patchCustomer(Long id, Customer customer);

    /**
     * @param id customer ID to be deleted
     * @return true, if deleted; otherwise, return false
     */
    Boolean deleteCustomer(Long id);
}
