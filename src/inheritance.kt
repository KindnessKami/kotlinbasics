open class Parents{
    var dad= "He likes watching football"
    var mom= "She likes cooking"
    var momcolor= "light skin"
    var dadcolor= "dark skin"
}
class Boy:Parents(){
    fun color(){
        println("The boy is $dadcolor and $dad")
    }
}
class Girl:Parents(){
    fun colour2(){
        println("The girl is $momcolor and $mom")
    }
    fun main(args:Array<String>){
        val obj=Boy()
            obj.color()
        val obj1=Girl()
            obj1.colour2()
    }
}