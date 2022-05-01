package br.com.abcosta.aws.sns;

import java.time.LocalDate;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import services.SNSService;

@SpringBootApplication
public class SnsApplication {

	public static void main(String[] args) {

		SNSService.sendMessage("MENSAGEM TESTE - " + LocalDate.now());
	}
}
