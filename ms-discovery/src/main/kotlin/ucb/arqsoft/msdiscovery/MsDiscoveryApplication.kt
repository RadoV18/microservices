package ucb.arqsoft.msdiscovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class MsDiscoveryApplication

fun main(args: Array<String>) {
	runApplication<MsDiscoveryApplication>(*args)
}
