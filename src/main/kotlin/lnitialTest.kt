open class Base{
    open val name:String = "Mama"
    open val pri
    init {
        println("I am in Base Class, $name")
    }
    open fun displayName(){
        println("I am " + this.name)
    }
}

class Child:Base(){
    override fun displayName(){
        super.displayName()
        println("I am Child class")
    }

}

//class GrandChild:Child(){
//    init {
//        println("I am in Grand Child class")
//    }
//}
