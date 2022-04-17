package br.com.byamada.bankaccount.repository

import br.com.byamada.bankaccount.model.Account
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface AccountRepository: MongoRepository<Account, String>  {

    fun findByDocument(docment: String) : Optional<Account>
}