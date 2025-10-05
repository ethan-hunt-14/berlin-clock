package com.srm.berlinclockdemo

import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun getFormattedCurrentTime(): String {
    return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))
}
