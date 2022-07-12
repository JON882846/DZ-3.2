package ru.netologt.Main

import ru.netology.`class`.Comment
import ru.netology.`class`.Message

val comment1 =  Comment(
    "1",
    1,
    6,
    "Q"

)
val comment2 = Comment(
    "09",
    2,
    78,
    "3435"
)
val comment3 = Comment(
    "49",
    2,
    63,
    "Котлин4"
)
val comment4 = Comment(
    "09",
    2,
    78,
    "3435"
)

var List1 = mutableListOf(comment1, comment2)
var List2 = mutableListOf(comment3, comment4)

val note1 = Message(
    98,
    21,
    "HELLO",
    List1
)
val note2 = Message(
    32,
    78,
    "GOOD",
    List2
)

val note3 = Message(
    87,
    13,
    "ONE",
     List1
)
var nList = mutableListOf(note1, note2)


fun main() {
    val added = note1.add(nList, note3)
    val newCommentIndex = note1.createComment("Комментарий")
    val deleted = note1.delete(2,nList)
    val editNote2 = note2.edit("Запись")
    val listOfNotes = note1.get(1, nList)
    val noteById = note2.getById(1, nList)
    val commentsList = note3.getComments()

    println(newCommentIndex)
    println(note1.getComments())



}

