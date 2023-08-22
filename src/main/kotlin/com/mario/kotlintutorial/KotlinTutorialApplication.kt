package com.mario.kotlintutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class KotlinTutorialApplication

fun main(args: Array<String>) {
	runApplication<KotlinTutorialApplication>(*args)
}
