package com.group.libraryapp.calculator

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
    calculatorTest.divisionTest( )
    calculatorTest.divisionErrorTest()
}

class CalculatorTest {
    fun addTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.add(3)

        //then
        val expectedCalculator = Calculator(8)
        if (calculator != expectedCalculator) {
            throw IllegalStateException()
        }
    }


    fun minusTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.minus(3)

        //then
        val expectedCalculator = Calculator(2)
        if (calculator != expectedCalculator) {
            throw IllegalStateException()
        }
    }

    fun multiplyTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.multiply(3)

        //then
        val expectedCalculator = Calculator(15)
        if (calculator != expectedCalculator) {
            throw IllegalStateException()
        }
    }
    fun divisionTest() {
        //given
        val calculator = Calculator(10)

        //when
        calculator.division(2)

        //then
        val expectedCalculator = Calculator(5)
        if (calculator != expectedCalculator) {
            throw IllegalStateException()
        }
    }

    fun divisionErrorTest() {
        //given
        val calculator = Calculator(10)

        //when then
        try {
            calculator.division(0)
        } catch (e: IllegalArgumentException) {
            if (e.message != "0으로 나눌 수 없습니다.") throw IllegalStateException()
            return
        } catch (e: Exception) {
            throw IllegalStateException()
        }
    }

}