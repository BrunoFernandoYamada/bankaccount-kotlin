package br.com.byamada.bankaccount.controller.handler

import java.util.Date

class ErrorDetails(val timeStamp: Long, val status: Int, val error: String, val message: String?, val path: String) {
}
