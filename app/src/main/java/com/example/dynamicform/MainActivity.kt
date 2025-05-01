package com.example.dynamicform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.example.dynamicform.ui.theme.DynamicFormTheme
import com.example.dynamicform.ui.theme.utils.ComponentObject

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DynamicFormTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    val resOfComponent = ComponentObject.resOfComposable
    Box(
        modifier = modifier.fillMaxSize().background(color = Color.Green),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn {
            items(resOfComponent.size) { index->
                ComponentObject.resOfComposable[index]().apply {
                }
            }
        }
    }
}


abstract class BaseAnimal{
    abstract fun makeSound() // will happened sub abstract class.
}

sealed class Screen(val route: String) {
   // will going return sub classes
}
sealed interface Composable {
     // Implementation class
}

open class Animal : BaseAnimal() {
    override fun makeSound() {
        TODO("Not yet implemented")
    }
}
open  class People{

}


open class Vehicle(brand:String, model: String) {
    open fun start(){}
    open fun stop(){}
}
class Car(brand:String, model:String): Vehicle(brand =  brand, model = model){
    override fun start() {
        super.start()
    }

    override fun stop() {
        super.stop()
    }
    fun drive(){}
    fun madeIn(){}
    fun openTheDoor(){}
}

data class Person(val firstName: String, val age: Int, val lastName: String){
    fun getFullNameUser(): String{
        return firstName + lastName
    }
}

class Person1(private val firstName: String, private val lastName:String){
    fun getFullNameUser(): String{
        return firstName + lastName
    }
}

class OtherClass{
    var person1 = Person1("John", "Doe")
    val person = Person("John", 30, "Doe")

}
