package page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import metodos.Metodos;

public class PagePreencher extends Metodos {

	Metodos metodo = new Metodos();

	By elements = By.xpath("//div[@class='card-up']");
	By textBox = By.id("item-0");
	By fullName = By.id("userName");
	By email = By.id("userEmail");
	By currentAdress = By.id("currentAddress");
	By permanentAdress = By.id("permanentAddress");
	By submit = By.xpath("//button[@id='submit']");
	By responseBox = By.id("output");
	By msgEsperada = By.id("output");
	
	public void preencherTextBox() {
		metodo.clicar(textBox);
		metodo.clicar(fullName);
		metodo.escrever(fullName, "Julia Lima");
		metodo.escrever(email, "juliacontatolima@gmail.com");
		metodo.escrever(currentAdress, "rua Andradina, 505");
		metodo.escrever(permanentAdress, "rua Andradina, 505");
		metodo.scrollToPixel(500);// nao estava aqui ali vc pode usar o tamanho que quiser seja 100 200 ertc
		metodo.clicar(submit);

	}

	public void clicarElements() {
		metodo.clicar(elements);
	}

	public void clicarTextbox() {
		metodo.clicar(textBox);
	}

	public void preencherdados() {
		metodo.clicar(fullName);
		metodo.escrever(fullName, "Julia Lima");
		metodo.escrever(email, "juliacontatolima@gmail.com");
		metodo.escrever(currentAdress, "rua Andradina, 505");
		metodo.escrever(permanentAdress, "rua Andradina, 505");

	}

	
	//Email:juliacontatolima@gmail.com
	//Current Address :rua Andradina, 505
	
	public void conferir(By elemento) {
	  
	    WebElement elementoEncontrado = driver.findElement(elemento);

	    String textoCapturado = elementoEncontrado.getText();

	    
	    String msgEsperada = "Name:Julia Lima" + "\r\n" + "Email:juliacontatolima@gmail.com" + "\r\n"
	            + "Current Address :rua Andradina, 505" + "\r\n" + "Permananet Address :rua Andradina, 505";

	    assertEquals(msgEsperada, textoCapturado);

	    if (textoCapturado.equals(msgEsperada)) {
	        System.out.println("O texto confere com o esperado. Teste passou!");
	    } else {
	        System.out.println("O texto não confere com o esperado. Teste falhou.");
	    }
	}

}
