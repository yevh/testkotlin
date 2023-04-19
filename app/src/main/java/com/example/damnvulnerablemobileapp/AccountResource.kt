import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class PasswordResetRequest(val email: String)

@RestController
@RequestMapping("/api/account")
class AccountResource(private val userService: UserService) {

    private val log = LoggerFactory.getLogger(AccountResource::class.java)

    @PostMapping("/reset-password")
    fun resetPassword(@RequestBody request: PasswordResetRequest): ResponseEntity<Void> {
        val mail = request.email
        return if (userService.userExistsByEmail(mail)) {
            userService.resetPassword(mail)
            ResponseEntity.ok().build()
        } else {
            log.warn("Password reset requested for non-existing mail '$mail'")
            ResponseEntity.notFound().build()
        }
    }
}
