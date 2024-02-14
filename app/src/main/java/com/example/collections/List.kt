package com.example.collections

class List {
}

fun main() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    println(solarSystem[2])
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))

//Itérer des éléments de liste à l'aide d'une boucle for
    for (planet in solarSystem) {
        println(planet)
    }
}