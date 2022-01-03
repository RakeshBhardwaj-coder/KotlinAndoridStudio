fun main(){
    val squareCabin = SquareCabin(6)
    val roundHut = RoundHut(2)
    val roundTower = RoundTower(4)
    
    with(squareCabin){
        
    println("\nSquare Cabin\n============")
    println("Capacity: ${capacity}")
    println("Material: ${buildingMaterial}")
    println("Has room? ${hasRoom()}")
    }
    with(roundHut){
    println("\nRound Hut\n============")
    println("Capacity: ${capacity}")
    println("Material: ${buildingMaterial}")
    println("Has room? ${hasRoom()}")
    }
     with(roundTower){
    println("\nRound Tower\n============")
    println("Capacity: ${capacity}")
    println("Material: ${buildingMaterial}")
    println("Has room? ${hasRoom()}")
    }
}

abstract class Drwelling(private var residence: Int){
    abstract val buildingMaterial: String
	abstract val capacity: Int

fun hasRoom(): Boolean{
    return residence<capacity
}
}
class SquareCabin(residence: Int): Drwelling(residence){
    override val buildingMaterial = "Wood"
    override val capacity = 8
}

// open is used because the RoundHut is 'final' by default and used it in RoundTower

open class RoundHut(residence: Int): Drwelling(residence){
    override val buildingMaterial = "Straw"
    override val capacity = 4
}
 class RoundTower(residents: Int, floor: Int = 2) : RoundHut(residents) {
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floor
}
 
//  Outputs:-

//  Square Cabin
// ============
// Capacity: 8
// Material: Wood
// Has room? true

// Round Hut
// ============
// Capacity: 4
// Material: Straw
// Has room? true

// Round Tower
// ============
// Capacity: 8
// Material: Stone
// Has room? true
