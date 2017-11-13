fun main(args: Array<String>) {
    var map=HashMap<String, String>()
    map.put("nama_depan","khoirul")
    map.put("nama_belakang","fahmi")
    map.put("alamat","senenan")
    println(map.get("nama_depan"))

    map.put("nama_belakang","Unisnu Jepara")
    for (i in map.keys){
        println(i+" "+map.get(i))
    }
}