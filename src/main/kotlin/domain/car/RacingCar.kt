package domain.car

import domain.result.RacingHistory

class RacingCar(
    private val user: String,
    private val engine: CarEngine,
    private var position: Int = 0
) {

    fun run(): RacingHistory {
        position += engine.getPower()
        return RacingHistory(user, position)
    }
}