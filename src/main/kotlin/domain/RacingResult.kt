package domain

class RacingResult(val roundResults:List<RacingRoundResult>) {
}

fun Iterable<RacingRoundResult>.toResult(): RacingResult {
    return RacingResult(this.toList())
}