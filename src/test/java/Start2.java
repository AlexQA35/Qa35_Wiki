
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

    public class Start2 {
        WebDriver wd;

        @Test
        public void goToWiki(){
            wd=new ChromeDriver();
            wd.navigate().to("https://ru.wikipedia.org/wiki/");
            wd.navigate().back();
            wd.navigate().forward();
            wd.navigate().refresh();

            wd.close();
            wd.quit();

        }
    }

