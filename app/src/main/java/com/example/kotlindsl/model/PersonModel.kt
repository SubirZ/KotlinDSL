package com.example.kotlindsl.model

data class Person(var name: String? = null, var age: Int? = null, var address: Address? = null)

data class Address(var city: String? = null, var state: String? = null, var country: String? = null)