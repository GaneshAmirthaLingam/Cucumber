package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Page_Object {

	@FindBy(id="location")
	public static WebElement locat;
	@FindBy(id="hotels")
	public static WebElement hotels;
	@FindBy(id="room_type")
	public static WebElement room;
	@FindBy(id="room_nos")
	public static WebElement roomnos;
	@FindBy(id="datepick_in")
	public static WebElement datepick;
	@FindBy(id="datepick_out")
	public static WebElement datepickout;
	@FindBy(id="adult_room")
	public static WebElement adult;
	@FindBy(id="child_room")
	public static WebElement child;
	@FindBy(id="Submit")
	public static WebElement submit;
	@FindBy(id="radiobutton_0")
	public static WebElement radio;
	@FindBy(id="continue")
	public static WebElement Continue;
	@FindBy(id="first_name")
	public static WebElement firstname;
	@FindBy(id="last_name")
	public static WebElement lastname;
	@FindBy(id="address")
	public static WebElement address;
	@FindBy(id="cc_num")
	public static WebElement ccnum;
	@FindBy(id="cc_type")
	public static WebElement cctype;
	@FindBy(id="cc_exp_month")
	public static WebElement ccexpmonth;
	@FindBy(id="cc_exp_year")
	public static WebElement ccexpyear;
	@FindBy(id="cc_cvv")
	public static WebElement cvv;
	@FindBy(id="book_now")
	public static WebElement booknow;
	@FindBy(id="my_itinerary")
	public static WebElement myitinerary;
	@FindBy(id="order_no")
	public static WebElement orderno;
	@FindBy(id="logout")
	public static WebElement logout;
	@FindBy(id="logout")
	public static WebElement logoutmessage;
	
}
