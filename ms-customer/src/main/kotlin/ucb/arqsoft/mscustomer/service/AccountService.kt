package ucb.arqsoft.mscustomer.service

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "ms-account")
interface AccountService {

    @GetMapping("/api/v1/accounts/port")
    fun getPort() : String

    @GetMapping("/api/v1/accounts")
    fun getAccounts() : List<String>

}