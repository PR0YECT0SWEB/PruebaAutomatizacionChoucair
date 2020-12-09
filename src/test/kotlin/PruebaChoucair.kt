import net.serenitybdd.core.Serenity
import net.serenitybdd.junit.runners.SerenityRunner
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.abilities.BrowseTheWeb
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.actions.Enter
import net.serenitybdd.screenplay.actions.Open
import net.serenitybdd.screenplay.targets.Target
import net.thucydides.core.annotations.Managed
import org.junit.Test
import org.junit.runner.RunWith
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver


@RunWith(SerenityRunner::class)
class PruebaChoucair {

    @Managed
    var webDriver: WebDriver? = null

    @Test
    fun navegarPaginaChoucair(){

      /*  val buscarGlobal = Target.the("Buscador Global")
            .located(By.cssSelector("input#is-search-input-0"))*/

        val buscarEmpleo = Target.the("Buscador Empleo")
            .located(By.cssSelector("input#search_keywords"))

        val buscarUbicacion = Target.the("Buscador Ubicacion")
            .located(By.cssSelector("input#search_location"))

        //System.setProperty("webdriver.chrome.driver", "\\Users\\D3RL3\\Downloads\\chromedriver_win32\\chromedriver.exe")

        //webDriver = ChromeDriver()

        var derlevin = Actor.named( "Derlevin")
        derlevin.can(
            BrowseTheWeb.with(webDriver))

        derlevin.attemptsTo(
            Open.url("https://www.choucairtesting.com/empleos-testing"),
            Enter.theValue("Analista de pruebas").into(buscarEmpleo),
            Enter.theValue("Medellin").into(buscarUbicacion),
            Click.on(send)
        )

/*        derlevin.attemptsTo(
            Enter.theValue("Analista de pruebas").into(buscarEmpleo))

        derlevin.attemptsTo(
            Enter.theValue("Medellin").into(buscarUbicacion))*/



    }

}