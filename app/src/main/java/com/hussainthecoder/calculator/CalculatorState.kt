package com.hussainthecoder.calculator

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null,
    val operation1: CalculatorOperation? = null
)
