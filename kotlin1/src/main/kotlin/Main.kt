fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    var fish: Int = 12
    var lakes: Double = 2.5
    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish" + " and $numberOfPlants plants")
    println("I have ${numberOfFish + numberOfPlants} fish and plants")

    val mangSoNguyen = listOf(1, 2, 3, 4, 5)

// Sử dụng lambda để lọc các số chẵn từ danh sách
    val soChan = mangSoNguyen.filter { it % 2 == 0 }
// In ra các số chẵn đã lọc
    soChan.forEach { println(it) }


    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }

    when (numberOfFish) {
        0 -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }


    //   var rocks: Int = null
    /*
    * ⇒ error: null can not be a value of a non-null type Int
    */
    /*
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }
*/
    var fishFoodTreats = 6
    fishFoodTreats = fishFoodTreats?.dec() ?: 0

//     val len = s!!.length
// throws NullPointerException if s is null
// danh sách không thay đổi
    val school = listOf("mackerel", "trout", "halibut")
    println(school)
// để tạo danh sách thay đổi được dùng mutableListOf thay cho ListOf*
    /*
    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])

     */

    println("\n list va array:")
    val numbers = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)

    val array = Array (5) { it * 1 }
    println(java.util.Arrays.toString(array))


    /*
    for (i in 1..5) print(i)
⇒ 12345

for (i in 5 downTo 1) print(i)
⇒ 54321

for (i in 3..6 step 2) print(i)
⇒ 35

for (i in 'd'..'g') print (i)
⇒ defg
    * */


    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // eager, creates a new list
    println("\n filter:")
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")
// force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")


    println("\n phan lazy map: ")
    val danhSachSoNguyen = listOf(1, 2, 3, 4, 5)

// Sử dụng lazy map để tạo một danh sách mới chứa bình phương của các số
    val danhSachBinhPhuong = danhSachSoNguyen.asSequence().map { it * it }

// Chỉ khi cần lấy giá trị, biến đổi mới được thực hiện
    val phanTuDauTien = danhSachBinhPhuong.first()
    println(phanTuDauTien) // In ra màn hình: 1


// new commit

    println("commitw")
    println("learn gitHUb")


}
// Kotlin focuses on clarity, conciseness, and code safety.
// It has lambdas, coroutines, and properties, which allow you to write less code with fewer bugs.

/*
Kotlin đã xuất hiện từ năm 2011 và được phát hành dưới dạng nguồn mở vào năm 2012.
Nó đã đạt đến phiên bản 1.0 vào năm 2016 và kể từ năm 2017, Kotlin đã trở thành ngôn ngữ được hỗ trợ chính thức
để xây dựng ứng dụng Android. Nó được bao gồm trong IntelliJ IDEA cũng như Android Studio 3.0 trở lên.
*/