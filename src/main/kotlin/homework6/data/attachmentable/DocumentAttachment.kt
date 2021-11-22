package homework6.data.attachmentable

data class DocumentAttachment(
    override val type: String = "Doc",
    val doc: Doc = Doc {
        val idOwner: Int
        val ownerId: Int = -1
        val title: String = ""
        val size: Int = -1
        val ext: String = ""
        val url: String = ""
        val date: Int = -1
        val typeOfDoc: Int = 8
        val preview: DocPreview
    }
) : Attachment

class Doc(function: () -> Unit) {
}
