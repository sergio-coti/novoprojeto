package br.com.cotiinformatica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

	@GetMapping
	public String hello() {
		return "Hello World Novo teste!";
	}
}
