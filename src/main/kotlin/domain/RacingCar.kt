package domain

class RacingCar(val user: String, val engine: CarEngine) {

    fun run(): RacingHistory {
        return RacingHistory(user, engine.getPower())
    }
}