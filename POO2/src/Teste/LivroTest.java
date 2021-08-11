package Teste;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Models.Livro;

public class LivroTest {

	@Test
	void test() throws Exception {
		Livro livro = new Livro("Harry Potter", "J. K. Rowling", "2001");
		assertTrue(livro.GetTitulo() == "Harry Potter");
		assertTrue(livro.GetAutor() == "J. K. Rowling");
		assertTrue(livro.GetAno() == "2001");
		
	}
}
