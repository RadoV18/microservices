package ucb.arqsoft.mscustomer.api

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ucb.arqsoft.mscustomer.dto.FormDto
import ucb.arqsoft.mscustomer.dto.TokenDto
import ucb.arqsoft.mscustomer.service.AccountService
import ucb.arqsoft.mscustomer.service.KeycloakService

@RestController
@RequestMapping("/api/v1/customers")
class CustomerController @Autowired constructor(
    private val accountService: AccountService,
    private val keycloakService: KeycloakService
) {
    @Value("\${server.port}")
    lateinit var port: String;

    @GetMapping("/account-port")
    fun port() : String {
        val accountPort = accountService.getPort();
        return "customer controller on port -> $port. $accountPort";
    }

    @GetMapping("/customers")
    fun getCustomers() : List<String> {
        return listOf("Customer 1", "Customer2", "Customer3");
    }

    @GetMapping("/accounts")
    fun getCustomerAccounts() : List<String> {
        val accountList : List<String> = accountService.getAccounts();
        val list = mutableListOf("Customer 1", "Customer2", "Customer3");
        for (account in accountList) {
            list.add(account);
        }
        return list;
    }

    @GetMapping("/token")
    fun getToken() : TokenDto {
        return keycloakService.getToken(
            FormDto(
            "client_credentials",
            "backend",
            "4R4pdQ2gf28nh9ZFDUCNjFh9jSd8aUVQ")
        );
    }
}