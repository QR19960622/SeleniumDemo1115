package SeleniumGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GridTestDemo1 {

    @Test
    public void testFireFox() throws MalformedURLException, InterruptedException {
//        创建一个 DesiredCapabilities 对象
        DesiredCapabilities dc = DesiredCapabilities.chrome();

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.43.31:6666/wd/hub"), dc);

        driver.get("https://www.baidu.com/");
        Thread.sleep(10000);
        driver.quit();
    }

    @DataProvider(name = "data1")
    public Object[][] dataType(){
        return new Object[][]{
                {"http://192.168.43.31:6666/", "chrome"},
                {"http://192.168.43.31:6667/", "firefox"}
        };
    }

    @Test(dataProvider = "data1")
    public void testProvider(String url, String browser) throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities;
        if (browser.equals("chrome")){
            desiredCapabilities = DesiredCapabilities.chrome();
        }else if (browser.equals("firefox")){
            desiredCapabilities = DesiredCapabilities.firefox();
        }else {
            desiredCapabilities = DesiredCapabilities.internetExplorer();
        }
        String uri = url + "wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(uri),desiredCapabilities);
        Thread.sleep(3000);
        driver.quit();
    }
}
