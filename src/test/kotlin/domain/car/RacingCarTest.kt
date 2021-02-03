package domain.car

import domain.result.RacingHistory
import org.junit.jupiter.api.Test

import org.assertj.core.api.Assertions.*

internal class RacingCarTest {

    @Test
    fun run() {
        //given
        val racingCar = RacingCar("a") { 1 }

        //when
        val history = racingCar.run()

        //then
        assertThat(history).isEqualTo(RacingHistory("a",1))
    }

}
