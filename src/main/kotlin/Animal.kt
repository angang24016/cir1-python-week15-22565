open class Animal{
    open val count: Int = 0
    open fun gotoSleep(){
        println("Zzzzzzzz")
    }
    open fun makeNoise(){
        println("Durrrrrrr")
    }
}

class Cat:Animal(){
    override val count:Int = 100
    override fun makeNoise(){
        println("Meowwww,$count")
    }
}

class Dog:Animal(){
    override val count:Int = 100
    override fun makeNoise() {
        println("Wooooof,$count");
    }
}