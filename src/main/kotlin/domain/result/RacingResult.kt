package domain.result

class RacingResult(val roundResults: List<RacingRoundResult>) {
}

fun List<RacingRoundResult>.toResult(): RacingResult {
    return RacingResult(this)
}