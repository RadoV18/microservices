package ucb.arqsoft.msaccount

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class MsAccountApplication

fun main(args: Array<String>) {
	runApplication<MsAccountApplication>(*args)
}
