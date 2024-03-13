fun main(args:Array<String>){
    var myarr= arrayOf("bananas","oranges","mangoes",76, 46, 98)
    myarr[1]="pineapples"
    println("I love eating ${myarr[1]}")
    var myarr2= arrayOf<Int>(5,7,6,8,2,9,0)
    println(myarr2.sorted())
    var myarr3= arrayOf<String>("")
}