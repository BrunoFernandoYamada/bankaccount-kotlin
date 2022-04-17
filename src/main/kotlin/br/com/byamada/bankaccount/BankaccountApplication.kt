package br.com.byamada.bankaccount

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class BankaccountApplication

fun main(args: Array<String>) {
	runApplication<BankaccountApplication>(*args)
}
