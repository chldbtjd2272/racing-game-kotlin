package domain.car

import domain.result.RacingHistory
import org.junit.jupiter.api.Test

import org.assertj.core.api.Assertions.*

internal class RacingGroupTest {

    @Test
    fun race() {
        //given
        val racingGroup = RacingGroup(listOf("a", "b")) { 1 }

        //when
        val roundResult = racingGroup.race(2)

        //then
        assertThat(roundResult.runCount).isEqualTo(2)
        assertThat(roundResult.racingHistories).containsAll(
            listOf(
                RacingHistory("a", 1),
                RacingHistory("b", 1)
            )
        )
    }
}
