package domain

class RacingGroup(users: List<String>, private val engine: CarEngine) {
    private val racingCars: List<RacingCar>

    init {
        racingCars = users.map { user -> RacingCar(user, engine) }
    }

    fun race(runCount: Int): RacingRoundResult {
        val histories = racingCars.map { racingCar -> racingCar.run() }
        return RacingRoundResult(runCount, histories)
    }
}