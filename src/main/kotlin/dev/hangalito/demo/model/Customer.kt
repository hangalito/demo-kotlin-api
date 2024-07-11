package dev.hangalito.demo.model

import jakarta.persistence.*
import jakarta.persistence.GenerationType.IDENTITY

@Entity
@Table(name = "customers")
open class Customer {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    open var id: Int = 0

    @Column(name = "first_name")
    open var firstName: String = ""

    @Column(name = "last_name")
    open var lastName: String = ""

    @Column(name = "email")
    open var email: String = ""

    @Column(name = "gender")
    open var gender: String = ""

}
