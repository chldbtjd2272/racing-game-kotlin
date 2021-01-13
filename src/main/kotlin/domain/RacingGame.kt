package domain

import java.util.stream.IntStream

class RacingGame(users: List<String>, engine: CarEngine) {
    private val racingCars: RacingGroup = RacingGroup(users, engine)

    fun startGame(runCount: Int): RacingResult {
        return (1..runCount).map { round -> racingCars.race(round) }
            .toResult()
    }
}