package Business;

import jakarta.annotation.PostConstruct;

public class GestionDatos {
	@PostConstruct
	public void init() {
		System.out.println("Iniciando.........");
	}
}
