package dev.hangalito.demo.service

import dev.hangalito.demo.model.Customer
import dev.hangalito.demo.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(private val repository: CustomerRepository) {

    fun findAll(): MutableIterable<Customer> = repository.findAll()

    fun findById(id: Int) = repository.findById(id)

    fun findByFirstName(firstName: String) = repository.findByFirstName(firstName)

    fun findByLastName(lastName: String) = repository.findByLastName(lastName)

    fun findByGender(gender: String) = repository.findByGender(gender)

}
