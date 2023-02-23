fun main() {
    cityNames("Nairobi", "Manila", "Brasilia", "Tokyo")
    nameCity()
    numerics()
  println(animalNames("Lion","Rhino","Zebra"))

}



fun cityNames (city1: String, city2: String,city3: String,city4: String){
val city = arrayOf(city1,city2,city3,city4)
println(city.contentToString())
}
fun nameCity (){
   val cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    val locations = (cities.map {it.capitalize()})
    println(locations)
}


fun numerics (){
        val numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
        println(numbers[1] + numbers[4])
        println(numbers.indexOf(158))
    println(numbers.sorted())

}
fun animalNames(name1: String, name2: String, name3: String): String{
    val name = arrayOf(name1,name2,name3)
    return(name.contentToString())

}


