package dev.hangalito.demo.controller

import dev.hangalito.demo.model.Customer
import dev.hangalito.demo.service.CustomerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["/api/customers"], produces = ["application/json"])
@CrossOrigin
class CustomerController(private val service: CustomerService) {

    @GetMapping
    fun findAll() = service.findAll();

    @GetMapping(params = ["id"])
    fun findById(@RequestParam id: Int): ResponseEntity<Customer> {
        val result = service.findById(id).map {
            ResponseEntity.ok(it)
        }
        return result.orElse(ResponseEntity.notFound().build())
    }

    @GetMapping(params = ["firstName"])
    fun findByFirstName(@RequestParam firstName: String) = service.findByFirstName(firstName)

    @GetMapping(params = ["lastName"])
    fun findByLastName(@RequestParam lastName: String) = service.findByLastName(lastName)

    @GetMapping(params = ["gender"])
    fun findByGender(@RequestParam gender: String) = service.findByGender(gender)

}
