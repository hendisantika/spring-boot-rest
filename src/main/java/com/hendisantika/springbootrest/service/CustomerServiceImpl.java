package com.hendisantika.springbootrest.service;

import com.hendisantika.springbootrest.domain.Customer;
import com.hendisantika.springbootrest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer findById(final Long customerId) {
        return customerRepository.findById(customerId).get();
    }

    @Override
    public List<Customer> findAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(final Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Boolean isCustomerExist(final Customer customer) {
        if (customer.getId() != null) {
            final Customer existingCustomer = customerRepository.findById(customer.getId()).get();
            return existingCustomer != null;
        } else {
            return false;
        }
    }

    @Override
    public Customer updateCustomer(final Long id, final Customer customer) {

        final Customer fetchedCustomer = customerRepository.findById(id).get();
        if (fetchedCustomer == null) {
            return null;
        }
        fetchedCustomer.setFirstname(customer.getFirstname());
        fetchedCustomer.setLastname(customer.getLastname());

        customerRepository.save(fetchedCustomer);

        return fetchedCustomer;
    }

    @Override
    public Customer patchCustomer(Long id, Customer customer) {

        final Customer fetchedCustomer = customerRepository.findById(id).get();
        if (fetchedCustomer == null) {
            return null;
        }

        if (customer.getFirstname() != null) {
            fetchedCustomer.setFirstname(customer.getFirstname());
        }

        if (customer.getLastname() != null) {
            fetchedCustomer.setLastname(customer.getLastname());
        }

        customerRepository.save(fetchedCustomer);

        return fetchedCustomer;
    }

    @Override
    public Boolean deleteCustomer(final Long id) {
        final Customer fetchedCustomer = customerRepository.findById(id).get();
        if (fetchedCustomer == null) {
            return false;
        } else {
            customerRepository.delete(fetchedCustomer);
            return true;
        }
    }

}

