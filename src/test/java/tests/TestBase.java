package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.AttachmentsHelper.*;

public class TestBase {

  @BeforeAll
  static void setup() {
    addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("enableVNC", true);
    capabilities.setCapability("enableVideo", true);

    Configuration.browserCapabilities = capabilities;
//    Configuration.remote = "https://user1:1234@" + System.getProperty("remote.browser.url") + ":4444/wd/hub/";
    Configuration.remote = "https://user1:1234@selenoid.autotests.cloud:4444/wd/hub/";
    Configuration.startMaximized = true;

    Selenide.clearBrowserCookies();

  }

  @AfterEach
  @Step("Attachments")
  public void afterEach() {
    attachScreenshot("Last screenshot");
    attachPageSource();
    attachAsText("Browser console logs", getConsoleLogs());
    attachVideo();

    Selenide.closeWebDriver();
  }

  public String URL = "https://nurocor.com/";
}