package com.group.libraryapp.calculator

import java.lang.IllegalArgumentException

data class Calculator(
    var _number: Int,
) {

    fun add(operand: Int) {
        this._number += operand
    }

    fun minus(operand: Int) {
        this._number -= operand
    }

    fun multiply(operand: Int) {
        this._number *= operand
    }

    fun division(operand: Int) {
        if (operand == 0) throw IllegalArgumentException("0으로 나눌 수 없습니다.")
        this._number /= operand
    }
}