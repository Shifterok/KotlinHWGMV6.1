package homework6.data.attachmentable

data class PhotoAttachment(
    override val type: String = "Photo",
    val photo: Photo = Photo {
        val albumId: Int = -1
        val idOwner: Int = -1
        val useId: Int = -1
        val text: String = ""
        val date: Int = 0
        val width: Int = 0
        val height: Int = 0
    }
) : Attachment

class Photo(function: () -> Unit) {
}
