package domain.car

import kotlin.random.Random

class RandomPowerEngine : CarEngine {
    override fun getPower(): Int {
        return Random.nextInt(5)
    }
}
