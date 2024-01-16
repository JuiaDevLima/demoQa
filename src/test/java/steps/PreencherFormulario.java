package steps;

import org.junit.Test;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import page.PagePreencher;
import runner.Executa;

public class PreencherFormulario {

	PagePreencher page = new PagePreencher();
	Metodos metodo = new Metodos();

	@Test
	@Given("que eu esteja na tela principal")
	public void queEuEstejaNaTelaPrincipal() {
		Executa.abrirNavegador();
	}

	@Test
	@When("clicar em elements")
	public void clicarEmElements() {
		page.clicarElements();

	}

	@Test
	@And("clicar em text box e preencher o formulario")
	public void clicarEmTextBox() {
		page.clicarTextbox();
		page.preencherTextBox();
		
	

	}

	@Test
	@Then("validar as informações")
	public void validarAsInformações() {
	page.conferir(By.id("output"));
	}

}


