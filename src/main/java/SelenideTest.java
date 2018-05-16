import com.codeborne.selenide.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {


    @Test
    public void userCanLoginByUsername() {
        System.setProperty("webdriver.firefox.bin","D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        Configuration.baseUrl="https://www.baidu.com";
        open("/");
        $("#kw").setValue("selenide");
        $("#su").click();
        sleep(3000);
        // 断言
        $$("h3 > a").shouldHave(size(10));
    }

}

