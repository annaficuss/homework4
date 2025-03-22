package guru.qa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionsEnterprizeTests {

    @BeforeAll
    static void setupConfig() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void enterprizeLoadingTest() {
        open("/");
        $(byTagAndText("button", "Solutions")).hover();
        $("[href='https://github.com/enterprise']").click();
        assertEquals("The AI Powered Developer Platform. · GitHub", WebDriverRunner.getWebDriver().getTitle());
    }

}
