import domain.RacingGame
import domain.car.RandomPowerEngine
import presentation.inputCarCount
import presentation.inputRunCount
import presentation.printResult

fun main(args: Array<String>) {
    val carCount = inputCarCount()
    val runCount = inputRunCount()
    val racingResult = RacingGame.createGame(carCount, RandomPowerEngine())
        .startGame(runCount)
    printResult(racingResult)
}
