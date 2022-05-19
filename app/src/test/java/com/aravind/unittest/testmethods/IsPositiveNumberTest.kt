package com.aravind.unittest.testmethods

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class IsPositiveNumberTest{

    lateinit var obj : IsPositiveNumber

    @Before
    fun setUp(){
        obj = IsPositiveNumber()
    }

    @Test
    fun positive_number_zero_false(){
        val result = obj.isPositiveNumber(0)
        assertEquals(result,false)
    }

    @Test
    fun positive_number_negative_false(){
        val result = obj.isPositiveNumber(-1)
        assertEquals(result,false)
    }

    @Test
    fun positiveNumber_negative_true(){
        val result = obj.isPositiveNumber(12)
        assertEquals(result,true)
    }
}