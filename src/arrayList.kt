fun main(args: Array<String>) {
    var arraylist=ArrayList<String>()
    arraylist.add("khoirul")
    arraylist.add("fahmi")
    arraylist.add("senenan")
    arraylist.add("Jepara")

    println("First name: "+arraylist.get(0))

    println("All element by object")
    for (item in arraylist)
        println(item)
}