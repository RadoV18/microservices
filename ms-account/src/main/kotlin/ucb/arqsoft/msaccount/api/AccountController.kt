package ucb.arqsoft.msaccount.api

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/accounts")
class AccountController {
    @Value("\${server.port}")
    lateinit var port: String;

    @GetMapping("/port")
    fun port(): String {
        return  "Account service on port -> $port";
    }

    @GetMapping
    fun accounts(): List<String> {
        return listOf("12345", "12346", "12347");
    }
}