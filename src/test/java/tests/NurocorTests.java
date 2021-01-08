package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class NurocorTests extends TestBase{

  @Test
  @DisplayName("Verify That it is possible to open the page")
  @Description("Verify That it is possible to open the page")
  @Owner("Sergei P")
  @Severity(SeverityLevel.CRITICAL)
  void mainPageTest() {
    open(URL);
    $(".et_section_regular").shouldHave(text("Digitized Clinical Development"));
  }

  @Test
  @DisplayName("Verify That all products im menu page are visible")
  @Description("Verify That all products im menu page are visible")
  @Owner("Sergei P")
  @Severity(SeverityLevel.NORMAL)
  void productListTest() {
    open(URL);
    $("#et-top-navigation").click();
    $(".et_mobile_menu").shouldHave(text("Product"));
    $(".et_mobile_menu_arrow").shouldBe(visible).click();
    $(".et_pb_slide_dropdown_opened").shouldHave(text("Nurocor Clinical Platform"));
    $(".et_pb_slide_dropdown_opened").shouldHave(text("Lean Protocol"));
    $(".et_pb_slide_dropdown_opened").shouldHave(text("Solutions Delivery"));
  }

  @Test
  @DisplayName("Verify That Services Page can be opened.")
  @Description("Verify That Services Page can be opened.")
  @Owner("Sergei P")
  @Severity(SeverityLevel.NORMAL)
  void sercicesPageTest() {
    open(URL);
    $("#et-top-navigation").click();
    $(byText("Services")).shouldBe(visible).click();
    $("#et-main-area").shouldHave(text("SERVICES"));
  }

  @Test
  @DisplayName("Verify That About Us Page can be opened.")
  @Description("Verify That Services Page can be opened.")
  @Owner("Sergei P")
  @Severity(SeverityLevel.NORMAL)
  void aboutUsPageTest() {
    open(URL);
    $("#et-top-navigation").click();
    $(byText("About Us")).shouldBe(visible).click();
    $("#et-main-area").shouldHave(text("About Us"));
  }

  @Test
  @DisplayName("Verify That New Page can be opened.")
  @Description("Verify That New Page can be opened.")
  @Owner("Sergei P")
  @Severity(SeverityLevel.NORMAL)
  void newsPageTest() {
    open(URL);
    $("#et-top-navigation").click();
    $(byText("News")).shouldBe(visible).click();
    $("#et-main-area").shouldHave(text("News"));
  }

  @Test
  @DisplayName("Verify That Resources Page can be opened.")
  @Description("Verify That Resources Page can be opened.")
  @Owner("Sergei P")
  @Severity(SeverityLevel.NORMAL)
  void resourcesPageTest() {
    open(URL);
    $("#et-top-navigation").click();
    $(byText("Resources")).shouldBe(visible).click();
    $("#et-main-area").shouldHave(text("Resources"));
  }

  @Test
  @DisplayName("Verify That Blog Page can be opened.")
  @Description("Verify That Blog Page can be opened.")
  @Owner("Sergei P")
  @Severity(SeverityLevel.NORMAL)
  void blogPageTest() {
    open(URL);
    $("#et-top-navigation").click();
    $(byText("Blog")).shouldBe(visible).click();
    $("#et-main-area").shouldHave(text("Blog"));
  }

  @Test
  @DisplayName("Verify That Careers Page can be opened.")
  @Description("Verify That Careers Page can be opened.")
  @Owner("Sergei P")
  @Severity(SeverityLevel.NORMAL)
  void careerPageTest() {
    open(URL);
    $("#et-top-navigation").click();
    $(byText("Careers")).shouldBe(visible).click();
    $("#et-main-area").shouldHave(text("Careers"));
  }

  @Test
  @DisplayName("Verify That Contact Us Page can be opened.")
  @Description("Verify That Contact Us Page can be opened.")
  @Owner("Sergei P")
  @Severity(SeverityLevel.NORMAL)
  void contactUsPageTest() {
    open(URL);
    $("#et-top-navigation").click();
    $(byText("Contact Us")).shouldBe(visible).click();
    $("#et-main-area").shouldHave(text("Contact Us"));
  }

  @Test
  @DisplayName("Verify That Brent present on the About Us page.")
  @Description("Verify That Brent present on the About Us page.")
  @Owner("Sergei P")
  @Severity(SeverityLevel.CRITICAL)
  void verifyThatBrentPresentAtMeetTheTeamArea() {
    open(URL);
    $("#et-top-navigation").click();
    $(byText("About Us")).shouldBe(visible).click();
    $("[alt='Brent Carlson']").scrollIntoView(true);
    $("#et-main-area").shouldHave(text("Brent Carlson"));
  }

  @Test
  @DisplayName("Verify That Address present on Contact Us page.")
  @Description("Verify That Address present on Contact Us page.")
  @Owner("Sergei P")
  @Severity(SeverityLevel.MINOR)
  void verifyTheAdress() {
    open(URL);
    $("#et-top-navigation").click();
    $(byText("Contact Us")).shouldBe(visible).click();
    $(".et_pb_blurb_content").shouldHave(text("100 Congress Avenue,\n" +
        "Suite 2000\n" +
        "Austin, TX 78701"));
  }


}
