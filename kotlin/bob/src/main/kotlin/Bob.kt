object Bob {

    fun String.isQuestion(): Boolean = endsWith("?")
    fun String.isYelling(): Boolean = all { !it.isLetter() || it.isUpperCase() } && any { it.isLetter() }
    fun String.isYellingQuestion(): Boolean = isYelling() && isQuestion()
    fun String.isSilence(): Boolean = isBlank()

    fun hey(input: String): String {
        val cleanPeopleSay = input.trim()
        return when {
            cleanPeopleSay.isSilence() -> "Fine. Be that way!"
            cleanPeopleSay.isYellingQuestion() -> "Calm down, I know what I'm doing!"
            cleanPeopleSay.isYelling() -> "Whoa, chill out!"
            cleanPeopleSay.isQuestion() -> "Sure."
            else -> "Whatever."
        }
    }
}
