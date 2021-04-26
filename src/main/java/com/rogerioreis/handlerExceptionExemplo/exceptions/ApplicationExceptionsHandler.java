package com.rogerioreis.handlerExceptionExemplo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.rogerioreis.handlerExceptionExemplo.dto.DefaultError;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class ApplicationExceptionsHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<DefaultError> handlerException(Exception e) {
		log.info("Caiu no handler");

		DefaultError erro = new DefaultError(HttpStatus.BAD_GATEWAY.value(), "Erro ao processar sua solicitação");

		return new ResponseEntity<DefaultError>(erro, HttpStatus.BAD_GATEWAY);

	}

}
