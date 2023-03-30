package ucb.arqsoft.mscustomer.service

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import ucb.arqsoft.mscustomer.dto.FormDto
import ucb.arqsoft.mscustomer.dto.TokenDto
import javax.ws.rs.core.MediaType

@FeignClient(name = "ms-keycloak", url = "http://localhost:8081/realms/software")
interface KeycloakService {
    @PostMapping("/protocol/openid-connect/token", consumes = arrayOf(MediaType.APPLICATION_FORM_URLENCODED))
    fun getToken(
        form : FormDto
    ) : TokenDto
}