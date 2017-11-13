fun main(args: Array<String>) {
    var map=HashMap<Int, String>()
    map.put(1,"khoirul")
    map.put(2,"fahmi")
    map.put(33,"senenan")
    println(map.get(33))

    map.put(33,"Unisnu Jepara")
    for (i in map.keys){
        println(map.get(i))
    }
}