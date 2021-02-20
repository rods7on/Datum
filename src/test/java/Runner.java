import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = {"@hist01"})
// Tags:
// @hist01 = Executa os 2 cenários
// @CN01 = Executa apenas o cenário 1
// @CBonus = Executa apenas o cenário bônus

public class Runner {

}
