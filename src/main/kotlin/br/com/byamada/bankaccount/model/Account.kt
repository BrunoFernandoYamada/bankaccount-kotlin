package br.com.byamada.bankaccount.model

data class Account(
        val id: String?,
        val name:String,
        val document: String,
        val balance: Long? = 0
    ) {
}