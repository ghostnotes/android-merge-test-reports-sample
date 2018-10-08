package co.ghostnotes.sample.mergereports.util

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private lateinit var calculator: Calculator

    @Before
    @Throws(Exception::class)
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun toDouble() {
        // Call
        val actual = calculator.toDouble(3)

        // Test
        assertThat(actual, `is`(6))
    }

}