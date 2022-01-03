fun main(){
    val squareCabin = SquareCabin(6)
    
    with(squareCabin){
        
    println("\nSquare Cabin\n============")
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

// Output
//      Square Cabin
//      ============
//      Capacity: 8
//      Material: Wood
//      Has room? true
