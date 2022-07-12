package ru.netology

import org.junit.Test

import org.junit.Assert.*
import ru.netologt.Main.nList
import ru.netologt.Main.note1
import ru.netologt.Main.note2
import ru.netologt.Main.note3
import ru.netology.`class`.Comment

class MessageTest {

    @Test
    fun add() {
        val note = note1
        val noteList1 = nList
        val realValue = note1.add(noteList1, note)
        val expectedValue = noteList1.add(note)
        assertEquals(expectedValue, realValue)
    }

    @Test
    fun createComment() {
        val realValue = note1.createComment("Тестовый коммент")
        val expectedValue = 3
        assertEquals(expectedValue, realValue)
    }

    @Test(expected = Throwable::class)
    fun delete() {
        val realValue = note2.delete(2, nList)
        val expectedValue = true
        assertEquals(expectedValue, realValue)
    }
    @Test
    fun deleteTest() {
        val realValue = note2.delete(2, nList)
        val expectedValue = false
        assertEquals(expectedValue, realValue)
    }

    @Test
    fun getById() {
        val realValue = note2.getById(78, nList)
        val expectedValue = note2
        assertEquals(expectedValue, realValue)
    }

    @Test
    fun getComments() {
        val realValue = note3.getComments()
        val expectedValue = note3.commentsList
        assertEquals(expectedValue, realValue)
    }

}