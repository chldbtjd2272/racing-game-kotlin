package domain.result

class RacingHistory(val user: String, val position: Int) {


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RacingHistory

        if (user != other.user) return false
        if (position != other.position) return false

        return true
    }

    override fun hashCode(): Int {
        var result = user.hashCode()
        result = 31 * result + position
        return result
    }
}