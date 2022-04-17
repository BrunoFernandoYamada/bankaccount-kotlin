package br.com.byamada.bankaccount.controller.handler

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import javax.servlet.http.HttpServletRequest

@ControllerAdvice
class ControllerExceptionHandler {

    @ExceptionHandler(RuntimeException::class)
    fun runTimeExceptionHandler(ex: RuntimeException, request: HttpServletRequest) :ResponseEntity<ErrorDetails> {
        val errorDetails = ErrorDetails(System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value(),"Parametros inválidos", ex.message, request.requestURI)
        return ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST)
    }

}