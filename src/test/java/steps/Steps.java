package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import func.PrtSrc;

public class Steps {

	WebDriver driver;
	Scenario cenario;
	Actions act;

	@Before
	public void prepara(Scenario c) {
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/filipe.jesus/Documents/Testes/scripts/jars/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		this.cenario = c;
	}

	@Dado("^que estou na pagina \"([^\"]*)\"$")
	public void queEstouNaPagina(String site) throws Throwable {
		driver.get(site);
		cenario.embed(PrtSrc.capturar(driver), "image/png");
		act = new Actions(driver);
	}

	@Quando("^clicar no comboBox \"([^\"]*)\"$")
	public void clicarNoComboBox(String name) throws Throwable {
		WebElement cmbFilial = driver.findElement(By.name(name));
		cmbFilial.click();
		cenario.embed(PrtSrc.capturar(driver), "image/png");
	}

	@Quando("^selecionar a opção \"([^\"]*)\" no comboBox \"([^\"]*)\"$")
	public void selecionarAOpçãoNoComboBox(String item, String name) throws Throwable {
		WebElement cmbItem = driver.findElement(By.xpath(item));
		cmbItem.click();
		cenario.embed(PrtSrc.capturar(driver), "image/png");
	}

	@Quando("^eu informar \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void euInformarNoCampo(String login, String id) throws Throwable {
		Thread.sleep(1000);
		WebElement efLogin = driver.findElement(By.id(id));
		efLogin.sendKeys(login + Keys.TAB);
		cenario.embed(PrtSrc.capturar(driver), "image/png");
	}

	@Quando("^clicar no no comboBox \"([^\"]*)\"$")
	public void clicarNoNoComboBox(String name) throws Throwable {
		WebDriverWait espera = new WebDriverWait(driver, 20);
		WebElement cmbCage = espera.until(ExpectedConditions.elementToBeClickable(By.name(name)));
		cmbCage.click();
		cenario.embed(PrtSrc.capturar(driver), "image/png");
	}

	@Quando("^selecionar \"([^\"]*)\" no combobox \"([^\"]*)\"$")
	public void selecionarNoCombobox(String item, String arg2) throws Throwable {
		WebElement cmbItem = driver.findElement(By.xpath(item));
		cmbItem.click();
		cenario.embed(PrtSrc.capturar(driver), "image/png");
	}

	@Quando("^informar \"([^\"]*)\" no campo \"([^\"]*)\"$")
	public void informarNoCampo(String senha, String name) throws Throwable {
		WebElement efSenha = driver.findElement(By.name(name));
		efSenha.sendKeys(senha);
		cenario.embed(PrtSrc.capturar(driver), "image/png");
	}

	@Quando("^cliar no botão \"([^\"]*)\"$")
	public void cliarNoBotão(String id) throws Throwable {
		WebElement btnLogar = driver.findElement(By.id(id));
		btnLogar.click();
		cenario.embed(PrtSrc.capturar(driver), "image/png");
	}

	@Então("^deve logar exibindo texto \"([^\"]*)\" no \"([^\"]*)\"$")
	public void deveLogarExibindoTextoNo(String texto, String id) throws Throwable {
		WebDriverWait espera = new WebDriverWait(driver, 40);
		WebElement lblCabecalho = espera.until(ExpectedConditions.elementToBeClickable(By.id(id)));
		cenario.embed(PrtSrc.capturar(driver), "image/png");
		Assert.assertEquals(texto, lblCabecalho.getText());
		driver.quit();
	}

	@Então("^deve exibir texto \"([^\"]*)\" no \"([^\"]*)\"$")
	public void deveExibirTextoNo(String texto, String id) throws Throwable {
		WebDriverWait espera = new WebDriverWait(driver, 20);
		cenario.embed(PrtSrc.capturar(driver), "image/png");
		Assert.assertTrue(
				espera.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id(id)), texto)));
		driver.quit();
	}

	@Quando("^eu clicar no menu \"([^\"]*)\"$")
	public void euClicarNoMenu(String xpath) throws Throwable {
		WebDriverWait espera = new WebDriverWait(driver, 40);
		WebElement lblEstseg = espera.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		act.moveToElement(lblEstseg).perform();
		cenario.embed(PrtSrc.capturar(driver), "image/png");
	}

	@Quando("^no menu \"([^\"]*)\"$")
	public void noMenu(String xpath) throws Throwable {
		WebDriverWait espera = new WebDriverWait(driver, 40);
		WebElement lblEnt = espera.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		act.moveToElement(lblEnt).perform();
		cenario.embed(PrtSrc.capturar(driver), "image/png");
	}

	@Quando("^clicar no item \"([^\"]*)\"$")
	public void clicarNoItem(String xpath) throws Throwable {
		WebDriverWait espera = new WebDriverWait(driver, 40);
		WebElement lblEmissao = espera.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		act.moveToElement(lblEmissao).perform();
		act.click().perform();
		cenario.embed(PrtSrc.capturar(driver), "image/png");
	}

	@Então("^deve entrar na tela de \"([^\"]*)\"$")
	public void deveEntrarNaTelaDe(String arg1) throws Throwable {

	}

	@Então("^exibir o titulo \"([^\"]*)\"$")
	public void exibirOTitulo(String res) throws Throwable {
		WebDriverWait espera = new WebDriverWait(driver, 40);
		WebElement lblEmissaoDeSSI = espera.until(ExpectedConditions.elementToBeClickable(By.id("TEXTBLOCK1")));
		Assert.assertEquals(res, lblEmissaoDeSSI.getText());
		cenario.embed(PrtSrc.capturar(driver), "image/png");
		driver.quit();
	}

	@After
	public void fechar() {
		driver.quit();
	}

}
