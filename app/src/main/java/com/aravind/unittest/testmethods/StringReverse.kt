package com.aravind.unittest.testmethods

class StringReverse {


    fun reverseString(string: String): String{
        val builder = StringBuilder()

        for (i in string.length-1 downTo 0){
            builder.append(string[i])
        }
        return builder.toString()
    }


}