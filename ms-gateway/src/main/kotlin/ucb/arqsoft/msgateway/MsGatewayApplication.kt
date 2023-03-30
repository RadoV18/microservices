package ucb.arqsoft.msgateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class MsGatewayApplication

fun main(args: Array<String>) {
	runApplication<MsGatewayApplication>(*args)
}
