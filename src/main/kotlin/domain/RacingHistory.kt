package domain

class RacingHistory(val user: String, val enginePower: Int) {



    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RacingHistory

        if (user != other.user) return false
        if (enginePower != other.enginePower) return false

        return true
    }

    override fun hashCode(): Int {
        var result = user.hashCode()
        result = 31 * result + enginePower
        return result
    }
}