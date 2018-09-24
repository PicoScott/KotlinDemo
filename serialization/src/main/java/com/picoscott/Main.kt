package com.picoscott

import kotlinx.serialization.json.JSON
import java.io.*

fun readFromFile(): String {
    val br = BufferedReader(InputStreamReader(FileInputStream(File("serialization/src/main/resources/response.json"))))
    val resultSb = StringBuilder()
    var line: String? = br.readLine()
    while (line != null) {
        resultSb.append(line)
        line = br.readLine()
        resultSb.append('\n')
    }
    br.close()
    return resultSb.toString()
}

fun parse(input: String): Result {
    val json = JSON.nonstrict
    return json.parse(input)
}

fun main(args: Array<String>) {
    println(parse(readFromFile()))
}