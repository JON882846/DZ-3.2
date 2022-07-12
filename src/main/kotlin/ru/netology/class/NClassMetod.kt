package ru.netology.`class`

class Message(
    val ownerId: Int,
    val noteId: Int,
    var text: String,
    val commentsList: MutableList<Comment>
) {
    fun add(noteList: MutableList<Message>, note: Message): Boolean {
        return noteList.add(note)
    }

    fun createComment(text: String): Int {
        var comment = Comment(
            text,
            this.noteId,
            this.commentsList.lastIndex + 1,
            text,
        )
        this.commentsList.add(comment)
        return this.commentsList.indexOf(comment) + 1
    }

    fun delete(id: Int, noteList: MutableList<Message>): Boolean {
        try {
            noteList.removeAt(id)
        } catch (e: Exception) {
            return false
        }
        return true

    }


    fun edit(text: String): Boolean {
        var temp = true
        try {
            this.text = text
        } catch (e: Exception) {
            temp = false
        }
        return temp
    }


    fun get(ownerId: Int, noteList: MutableList<Message>): List<Message> {
        var noteListUser: MutableList<Message> = mutableListOf()
        for (noteLoop in noteList) {
            if (ownerId == noteLoop.ownerId) {
                noteListUser.add(noteListUser.lastIndex + 1, noteLoop)
            }
        }
        return noteListUser
    }

    fun getById(noteId: Int, noteList: MutableList<Message>): Message? {
        var note: Message? = null
        for (noteLoop in noteList) {
            if (noteLoop.noteId == noteId) {
                note = noteLoop
            }
        }
        return note
    }

    fun getComments(): MutableList<Comment> {
        return this.commentsList
    }
}
