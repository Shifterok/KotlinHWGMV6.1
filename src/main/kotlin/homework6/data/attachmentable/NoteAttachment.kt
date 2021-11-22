package homework6.data.attachmentable

data class NoteAttachmentAttachment(
    override val type: String = "важная заметка",
    val note: Note = Note {
        val idOwner: Int = 1
        val title: String = ""
        val text: String = ""
        val date: Int = 1
        val comments: Int = 100500
        val readComments: Int = 1
        val viewUrl: String = ""
    }
) : Attachment

class Note(function: () -> Unit) {
}

