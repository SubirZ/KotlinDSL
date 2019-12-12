package com.example.kotlindsl.dsl

import com.example.kotlindsl.model.Address
import com.example.kotlindsl.model.Person

fun person(block: Person.() -> Unit): Person = Person().apply(block)

//extension function for person data class
fun Person.address(block: Address.() -> Unit){
    address = Address().apply(block)
}