package domain

import domain.car.CarEngine
import domain.car.RacingGroup
import domain.result.RacingResult
import domain.result.toResult

class RacingGame(users: List<String>, engine: CarEngine) {
    private val racingCars: RacingGroup = RacingGroup(users, engine)

    fun startGame(runCount: Int): RacingResult {
        return (1..runCount)
            .map { round -> racingCars.race(round) }
            .toResult()
    }

    companion object {
        fun createGame(carCount: Int, engine: CarEngine): RacingGame {
            return RacingGame(createGuests(carCount), engine)
        }
    }

}

private fun createGuests(count: Int): List<String> {
    return (1..count).map { "guest" }
}
