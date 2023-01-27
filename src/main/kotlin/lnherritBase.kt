open class Baseclass{
    var baseValue = 50
    fun printcar(){
        println("I am function in base class");
    }
}
class DerivedClass:Baseclass(){
    fun baseFunction(){
        printcar()
        println(baseValue)
    }
}