package com.bip.jars.model

data class JarsModel(private var currentMoney: Double?) {
    private var nec: Int = 55

    private var play: Int = 10

    private var ffa: Int = 10

    private var edu: Int = 10

    private var lts: Int = 10

    private var giv: Int = 5

    fun getNec(): Double {
        return currentMoney?.div(100)!! * nec
    }

    fun getPlay(): Double {
        return currentMoney?.div(100)!! * play
    }

    fun getFfa(): Double {
        return currentMoney?.div(100)!! * ffa
    }

    fun getLts(): Double {
        return currentMoney?.div(100)!! * lts
    }

    fun getEdu(): Double {
        return currentMoney?.div(100)!! * edu
    }

    fun getGive(): Double {
        return currentMoney?.div(100)!! * giv
    }
}