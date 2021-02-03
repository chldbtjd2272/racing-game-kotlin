package domain.car

import domain.result.RacingRoundResult

class RacingGroup(
    users: List<String>,
    engine: CarEngine
) {
    private val racingCars: List<RacingCar> = users.map { user -> RacingCar(user, engine) }

    fun race(runCount: Int): RacingRoundResult {
        val histories = racingCars.map { racingCar -> racingCar.run() }
        return RacingRoundResult(runCount, histories)
    }
}
