package com.hendisantika.springbootrest.repository;

import com.hendisantika.springbootrest.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-rest
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/01/18
 * Time: 05.31
 * To change this template use File | Settings | File Templates.
 */

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
