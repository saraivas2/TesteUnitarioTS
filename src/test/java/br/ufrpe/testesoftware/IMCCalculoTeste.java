package br.ufrpe.testesoftware;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IMCCalculoTeste {

	@Test
	void test() {
		float altura = 1.80f; 
		
		float peso = 120f; 
		
		IMCCalculo imc1 = new IMCCalculo();
		
		assertEquals("Obesidade", imc1.Resultado(imc1.TesteImc(altura, peso)));
		
		//fail("Not yet implemented");
	}

}
