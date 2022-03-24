fun main(){
    var y =numbers(arrayOf(20,2,5,))
    println(y)
    var z=mixedArray(arrayOf("Faith",20,25.8,4.6,5.8,true,20,10))
    print(z)
    var m = count(arrayOf('a','b','c','d','e','f','g'))
    println(m)

}
fun numbers(product:Array<Int>):Int{
    var multiple=1
    product.forEach { num->
        if (num is Int)
            multiple*=num

    }
    return multiple
}
fun mixedArray(mixedtype:Array<Any>):Double{
    var sum = 0.0
    mixedtype.forEach { number->
        if(number is Double)
            sum+=number

    }

    return sum
}
fun count(vowel:Array<Char>):Int{
    var u =0
    vowel.forEach { c->
        if(c=='a'||c=='e'||c=='o'||c=='u')
            u++
    }
    return u

}