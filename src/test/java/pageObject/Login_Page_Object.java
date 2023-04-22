package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page_Object {

@FindBy(id="username")
public static WebElement username;

@FindBy(id="password")
public static WebElement password;

@FindBy(name="btnLogin")
public static WebElement submitButton;

}
