package com.greenleaf.fingreen

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FinGreenApplication

fun main(args: Array<String>) {
	runApplication<FinGreenApplication>(*args)
}
