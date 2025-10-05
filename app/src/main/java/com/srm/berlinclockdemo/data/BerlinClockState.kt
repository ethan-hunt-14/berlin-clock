package com.srm.berlinclockdemo.data

data class BerlinClockState(
    val secondsRow: String = "O", // 1 light
    val oneMinutesRow: String = "OOOO", // 4 lights
    val fiveMinutesRow: String = "OOOOOOOOOOO", // 11 lights
    val oneHoursRow: String = "OOOO", // 4 lights
    val fiveHoursRow: String = "OOOO", // 4 lights
)