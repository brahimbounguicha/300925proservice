package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.BoutiquePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BoutiquePageStepDef {
	@Given("utilisateur est sur la page boutique")
	public void utilisateur_est_sur_la_page_boutique() {
		Config.driver = new ChromeDriver();
		Config.maximizeWindow();
		String url = "https://www.xiaomistore.tn/shop/";
		Config.driver.get(url);
	 
	}
	@When("utilsateur effectue le tri1 {string} lle tri2 {string} et le tri3 {string}")
	public void utilsateur_effectue_le_tri1_lle_tri2_et_le_tri3(String tri1, String tri2, String tri3) throws Exception {
	    BoutiquePage p = new BoutiquePage();
	    p.effectuerTri(tri1, tri2, tri3);
	}
	@When("clique sur le produit {string}")
	public void clique_sur_le_produit(String productName) {
		BoutiquePage p = new BoutiquePage();
		p.clcickOnProduct(productName);

	}
	@Then("utilisateur est derige vers la page du produit {string}")
	public void utilisateur_est_derige_vers_la_page_du_produit(String productName) {
	    Config.fermerNavigateur();
	}




}
