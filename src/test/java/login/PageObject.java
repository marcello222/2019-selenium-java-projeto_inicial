package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObject {

    protected WebDriver browser;

    public PageObject(WebDriver browser) {
        System.setProperty("webdriver.chrome.driver", "drives/chromedriver.exe");
        if (browser != null) {
            this.browser = browser;
        } else {
            this.browser = new ChromeDriver();
        }
    }

    public void fechar() {
        this.browser.quit();
    }

}