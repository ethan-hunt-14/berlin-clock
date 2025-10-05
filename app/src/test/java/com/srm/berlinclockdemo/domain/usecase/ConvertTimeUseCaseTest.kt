package com.srm.berlinclockdemo.domain.usecase

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class ConvertTimeUseCaseTest {

    private lateinit var useCase: ConvertTimeUseCase

    @Before
    fun setup() {
        useCase = ConvertTimeUseCase()
    }

    // Test the Seconds Row - Red
    @Test
    fun testSecondsRow_shouldBeYellowForEvenSeconds() {
        val evenTime = "10:00:00"
        val state = useCase.execute(evenTime)
        // ASSERT: Yellow for even
        assertEquals("Y", state.secondsRow)
    }

    @Test
    fun testSecondsRow_shouldBeOffForOddSeconds() {
        val oddTime = "09:00:01"
        val state = useCase.execute(oddTime)
        assertEquals("O", state.secondsRow) // Off for odd seconds
    }
}