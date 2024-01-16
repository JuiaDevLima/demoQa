package metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			System.out.println("erro ao escrever");
			System.out.println("causa do erro" + e.getCause());

		}

	}

	// metodo responsavel por clicar no elementio usando a class by do selenium
	public void clicar(By elemento) {

		driver.findElement(elemento).click();

	}

	public void validarTexto(By elemento, String textoEsperado) {

		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoCapturado);
	}

	public void validarAlert(String msgEsperada) {
		String msgAlert = driver.switchTo().alert().getText();
		assertTrue(msgAlert.contains(msgEsperada));
	}

	public void scrollToPixel(int pixel) {// o valor que a tela ira descer sera informado no momento que chamar o método
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + pixel + ");");
	}


}
