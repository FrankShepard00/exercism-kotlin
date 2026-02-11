object Bob {

    private fun String.isSilence() = isEmpty()
    private fun String.isQuestion() = endsWith("?")
    private fun String.hasLetters() = any { it.isLetter() }
    private fun String.isAllCaps() = hasLetters() && uppercase() == this
    private fun String.isYelling() = isAllCaps()
    private fun String.isYellingQuestion() = isYelling() && isQuestion()

    fun hey(input: String): String {
        val cleaned = input.trim()

        return when {
            cleaned.isSilence() -> "Fine. Be that way!"
            cleaned.isYellingQuestion() -> "Calm down, I know what I'm doing!"
            cleaned.isYelling() -> "Whoa, chill out!"
            cleaned.isQuestion() -> "Sure."
            else -> "Whatever."
        }
    }
}
