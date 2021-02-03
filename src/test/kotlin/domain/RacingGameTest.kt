package domain

import domain.car.CarEngine
import domain.result.RacingHistory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.util.*

class RacingGameTest {

    @Test
    @DisplayName("게임을 수행하면 결과가 리턴된다")
    fun name() {
        //given
        val engine: Queue<Int> = LinkedList(listOf(1, 2, 2, 2))

        val game = RacingGame(listOf("cys", "test")) { engine.poll() }

        //when
        val result = game.startGame(2)

        //then
        assertThat(result.roundResults.size).isEqualTo(2)
        assertThat(result.roundResults[0].runCount).isEqualTo(1)
        assertThat(result.roundResults[0].racingHistories).contains(RacingHistory("cys", 1))
        assertThat(result.roundResults[0].racingHistories).contains(RacingHistory("test", 2))

        assertThat(result.roundResults[1].runCount).isEqualTo(2)
        assertThat(result.roundResults[1].racingHistories).contains(RacingHistory("cys", 3))
        assertThat(result.roundResults[1].racingHistories).contains(RacingHistory("test", 4))
    }
}
