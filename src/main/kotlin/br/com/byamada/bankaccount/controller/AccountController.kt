package br.com.byamada.bankaccount.controller

import br.com.byamada.bankaccount.model.Account
import br.com.byamada.bankaccount.service.AccountService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/accounts")
class AccountController(val service: AccountService) {

    @PostMapping
    fun create(@RequestBody account: Account) = ResponseEntity.ok(service.saveAccount(account))

    @GetMapping
    fun read() = ResponseEntity.ok(service.getAccounts())

    @GetMapping("/{document}")
    fun getByDocument(@PathVariable document: String) = ResponseEntity.ok(service.getByDocument(document))

    @PutMapping("/{document}")
    fun update(@PathVariable document: String, @RequestBody account: Account) = ResponseEntity.ok(service.updateAccount(document, account))

    @DeleteMapping("/{document}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable document: String) = service.delete(document)
}