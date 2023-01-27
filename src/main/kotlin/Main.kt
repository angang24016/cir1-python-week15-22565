fun main() {
//      var grand = GrandChild()
    var base = Animal()
    base.displayName()
    base.displayPrice()

    println("Animal Make noise and goto Sleep")
    var animal = Animal()
    animal.makeNoise()
    animal.gotoSleep()

    println("Cat Make noise and goto Sleep")
    animal = Cat()
    animal.makeNoise()
    animal.gotoSleep()

    println("Dog Make noise and goto Sleep")
    animal = Dog()
    animal.makeNoise()
    animal.gotoSleep()
}