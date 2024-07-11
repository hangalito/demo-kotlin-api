package dev.hangalito.demo.repository

import dev.hangalito.demo.model.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Int> {

    fun findByFirstName(firstName: String): List<Customer>

    fun findByLastName(lastName: String): List<Customer>

    fun findByGender(gender: String): List<Customer>

}
