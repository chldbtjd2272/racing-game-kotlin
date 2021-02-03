package presentation

import domain.result.RacingResult
import domain.result.RacingRoundResult

fun printResult(result: RacingResult) {
    result.roundResults.forEach { printRoundResult(it) }
}

private fun printRoundResult(roundResult: RacingRoundResult) {
    roundResult.racingHistories.forEach { racingHistory -> printPosition(racingHistory.position)}
    println()
}

private fun printPosition(a: Int) = with(StringBuilder()) {
    (1..a).forEach { _ -> append("-") }
    println(toString())
}



