package com.hendisantika.springbootrest.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-rest
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/01/18
 * Time: 05.30
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;

    /**
     * Default protected constructor
     */
    protected Customer() {
    }

    /**
     * Customer constructor with first and last name
     *
     * @param firstname first name
     * @param lastname  last name
     */
    public Customer(final String firstname, final String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Customer [id=" + id + ", firstname=" + firstname
                + ", lastname=" + lastname + "]";
    }
}
