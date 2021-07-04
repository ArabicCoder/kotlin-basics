import java.util.*

fun main() {
    var array1= intArrayOf(1,2,3,4,5)

    println("size")

    println(array1.size)

    println("indices")

    println(array1.indices)

    println("Get")

    println(array1.get(0))

    println("component")
    println(array1.component5())

    println("set")

    array1.set(0,0)

    println(Arrays.toString(array1))


//    [0, 2, 3, 4, 5]

    println("drop")
    println(array1.drop(2))
   println("dropLast")
    println(array1.dropLast(2))


    println("Filter")
    println(array1.filter { x -> x > 2 })

     println("FilterNot")
    println(array1.filterNot { x -> x > 2 })

    var list=array1.toList()
    println("List")
    println(list)

    println("Map")

    println(array1.groupBy { x -> x })

}