package homework6.data.attachmentable


data class PostSource(
    override val type: String = "Doc",
    val source: Source = Source {
        val idOwner: Int = 1
        val type: String = ""
        val platform: String = ""
        val date: Int = 1
        val url: String = ""
    }
) : Attachment

class Source(function: () -> Unit) {
}
