package homework6.data.attachmentable

data class AudioAttachment(
    override val type: String = "Audio",
    val audio: Audio = Audio {
        val idOwner: Int = 1
        val artist: String = ""
        val title: String = ""
        val duration: Int = 125
        val url: String = ""
        val lyriksId: Int = 1
        val albumId: Int = 1
        val genreId: Int = 1
        val date: Int = 1
        val noSearch: Boolean = true
        val isHQ: Boolean = true
    }
) : Attachment

class Audio(function: () -> Unit) {
}
