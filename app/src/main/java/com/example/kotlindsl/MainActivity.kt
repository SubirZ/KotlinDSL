package com.example.kotlindsl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlindsl.dsl.address
import com.example.kotlindsl.dsl.person
import com.example.kotlindsl.model.Address
import com.example.kotlindsl.model.Person

/**
 * This class demonstrates the use of Kotlin DSl to make your code more easily readable.
 * DSL make the code easily readable not only for developers but for any non technical person.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Person Without DSl:", createPersonWithoutDsl().toString())
        Log.d("Person With DSl:", createPersonWithDsl().toString())
    }

    //creating a person in conventional way
    private fun createPersonWithoutDsl(): Person {
        val address = Address(city = "Hyderabad", state = "telangana", country = "India")
        return Person(name = "John Doe", age = 24, address = address)
    }

    //can be useful when creating data for mocks or sending POST requests
    private fun createPersonWithDsl(): Person {
        return person {
            name = "John Doe"
            age = 24
            address {
                city = "Bhilai"
                state = "Chattisgarh"
                country = "India"
            }
        }
    }
}
