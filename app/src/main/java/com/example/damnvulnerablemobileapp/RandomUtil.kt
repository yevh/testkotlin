import java.security.SecureRandom
import org.apache.commons.lang3.RandomStringUtils

private const val DEF_COUNT = 20

object RandomUtil {
    private val secureRandom: SecureRandom = SecureRandom()

    init {
        secureRandom.nextBytes(byteArrayOf(64.toByte()))
    }

    private fun generateRandomAlphanumericString(): String {
        return RandomStringUtils.random(DEF_COUNT, 0, 0, true, true, null, secureRandom)
    }

    /**
    * Generate a password.
    *
    * @return the generated password.
    */
    fun generatePassword(): String = generateRandomAlphanumericString()
}
