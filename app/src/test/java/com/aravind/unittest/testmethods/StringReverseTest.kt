package com.aravind.unittest.testmethods

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class StringReverseTest{
    lateinit var obj : StringReverse

    @Before
    fun setUp(){
        obj = StringReverse()
    }

    @Test
    fun reverseString_check(){
        val result = obj.reverseString("abc cab")
        assertEquals(result,"bac cba")
    }
}