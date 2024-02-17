package com.example.collections

class Ensemble {
}
fun main(){
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    solarSystem.add("Pluto")
    println(solarSystem.size)
    //La fonction contains() utilise un seul paramètre et vérifie si l'élément spécifié fait partie de l'ensemble.
    println(solarSystem.contains("Pluto"))
}