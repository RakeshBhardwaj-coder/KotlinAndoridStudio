import kotlin.math.PI
fun main(){
    val squareCabin = SquareCabin(6, 50.0)
    val roundHut = RoundHut(2,10.0)
    val roundTower = RoundTower(4,15.5)
    
    with(squareCabin){
        
    println("\nSquare Cabin\n============")
    println("Capacity: ${capacity}")
    println("Material: ${buildingMaterial}")
    println("Has room? ${hasRoom()}")
    println("Floor area: ${floorArea()}")
    }
    with(roundHut){
    println("\nRound Hut\n============")
    println("Capacity: ${capacity}")
    println("Material: ${buildingMaterial}")
    println("Has room? ${hasRoom()}")
    println("Floor Radius: ${radius()}")
    
    }
     with(roundTower){
    println("\nRound Tower\n============")
    println("Capacity: ${capacity}")
    println("Material: ${buildingMaterial}")
    println("Has room? ${hasRoom()}")
    println("Floor Radius: ${radius()}")
    
    }
}

abstract class Drwelling(private var residence: Int){
    abstract val buildingMaterial: String
	abstract val capacity: Int

fun hasRoom(): Boolean{
    return residence<capacity
}

// abstract fuction you must need to implement in subclasses
abstract fun floorArea(): Double
}

class SquareCabin(residence: Int, val lenght: Double): Drwelling(residence){
    override val buildingMaterial = "Wood"
    override val capacity = 8
    override fun floorArea(): Double{
        return lenght * lenght
    }
}

// open is used because the RoundHut is 'final' by default and used it in RoundTower

open class RoundHut(residence: Int, val radius: Double): Drwelling(residence){
    override val buildingMaterial = "Straw"
    override val capacity = 4
    override fun floorArea(): Double {
        return PI * radius * radius
    }
}
 class RoundTower(residents: Int, floor: Int = 2, radius: Double) : RoundHut(residents, radius) {
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floor
     override fun floorArea(): Double {
        return super.floorArea() * floor
    }
}
