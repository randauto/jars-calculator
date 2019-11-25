package com.bip.jars.model

import kotlin.math.roundToInt

data class JarsModel(private var currentMoney: Double?) {
    private var nec: Int = 55

    private var play: Int = 10

    private var ffa: Int = 10

    private var edu: Int = 10

    private var lts: Int = 10

    private var giv: Int = 5

    fun getNec(): Int {
        return ((currentMoney?.div(100)!! * nec).roundToInt())
    }

    fun getPlay(): Int {
        return (currentMoney?.div(100)!! * play).roundToInt()
    }

    fun getFfa(): Int {
        return (currentMoney?.div(100)!! * ffa).roundToInt()
    }

    fun getLts(): Int {
        return (currentMoney?.div(100)!! * lts).roundToInt()
    }

    fun getEdu(): Int {
        return (currentMoney?.div(100)!! * edu).roundToInt()
    }

    fun getGive(): Int {
        return (currentMoney?.div(100)!! * giv).roundToInt()
    }
}