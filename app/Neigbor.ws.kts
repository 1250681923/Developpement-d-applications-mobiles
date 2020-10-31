data class Neighbor(
    val id: Long,
    val name: String,
    val avatarUrl: String,
    val address: String,
    val phoneNumber: String,
    val aboutMe: String,
    val favorite: Boolean,
    val webSite: String
)

fun Sting.concat(text:String){
    println("$this $text")
}
val maString = "Ma string"
maString.concat("sss")