package br.com.byamada.bankaccount.service

import br.com.byamada.bankaccount.model.Account
import br.com.byamada.bankaccount.repository.AccountRepository
import org.springframework.stereotype.Service

@Service
class AccountService(val repository: AccountRepository) {

    fun saveAccount(account: Account) = repository.save(account)

    fun getAccounts() = repository.findAll()

    fun getByDocument(document: String) = repository.findByDocument(document)

    fun updateAccount(document: String, account: Account) : Account {
        val accountDB = getByDocument(document).orElseThrow {
            RuntimeException("Account doesn't exists")
        }
        val accountToSave = accountDB.copy(document = account.document, balance = account.balance)
        return repository.save(accountToSave)
    }

    fun delete(document: String) {
        val accountDB = getByDocument(document).orElseThrow {
            RuntimeException("Account doesn't exists")
        }
        repository.delete(accountDB)
    }

}