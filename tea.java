package pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Favorites\\OneDrive\\Desktop\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver w= new ChromeDriver();
		w.get("http://www.practiceselenium.com/welcome.html");
		
	  w.findElement(By.linkText("Welcome")).click();
	  // Herbal Tea
	 w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[27]/div[1]/div[1]/a[1]/img[1]")).click();
// check out
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[27]/div[1]/a[1]/span[1]")).click();
	  
	 
	  w.findElement(By.id("email")).sendKeys("Sam123@gmail.com");
	  w.findElement(By.id("name")).sendKeys("samiksha");
	  w.findElement(By.id("address")).sendKeys("korhale ");
	  Select s=new Select(w.findElement(By.id("card_type")));
	  s.selectByVisibleText("Visa");
	  w.findElement(By.id("card_number")).sendKeys("98655452");
	  w.findElement(By.id("cardholder_name")).sendKeys("samiksha");
	  w.findElement(By.id("verification_code")).sendKeys("4565");
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();


	 w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[16]/div[1]/a[1]/span[1]")).click();
	  w.findElement(By.id("email")).sendKeys("shu123@gmail.com");
	  w.findElement(By.id("name")).sendKeys("shubham");
	  w.findElement(By.id("address")).sendKeys("Baramati ");
	  Select s1=new Select(w.findElement(By.id("card_type")));
	  s1.selectByVisibleText("Visa");
	  w.findElement(By.id("card_number")).sendKeys("98655452");
	  w.findElement(By.id("cardholder_name")).sendKeys("shubham");
	  w.findElement(By.id("verification_code")).sendKeys("4566");
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();
	 
	  
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[15]/div[1]/a[1]/span[1]")).click();
	  w.findElement(By.id("email")).sendKeys("Sam123@gmail.com");
	  w.findElement(By.id("name")).sendKeys("shradhaa");
	  w.findElement(By.id("address")).sendKeys("korhale ");
	  Select s2=new Select(w.findElement(By.id("card_type")));
	  s2.selectByVisibleText("Visa");
	  w.findElement(By.id("card_number")).sendKeys("98655452");
	  w.findElement(By.id("cardholder_name")).sendKeys("shradhha");
	  w.findElement(By.id("verification_code")).sendKeys("4565");
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();
	    
	  // loose tea
	  w.findElement(By.linkText("Welcome")).click();
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[21]/div[1]/div[1]/a[1]/img[1]")).click();
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[27]/div[1]/a[1]/span[1]")).click();
	  
		 
	  w.findElement(By.id("email")).sendKeys("Sambhagat@gmail.com");
	  w.findElement(By.id("name")).sendKeys("gauri");
	  w.findElement(By.id("address")).sendKeys("korhale ");
	  Select s6=new Select(w.findElement(By.id("card_type")));
	  s6.selectByVisibleText("Visa");
	  w.findElement(By.id("card_number")).sendKeys("98655452");
	  w.findElement(By.id("cardholder_name")).sendKeys("gauri");
	  w.findElement(By.id("verification_code")).sendKeys("4565");
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();


	 w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[16]/div[1]/a[1]/span[1]")).click();
	  w.findElement(By.id("email")).sendKeys("Sam123@gmail.com");
	  w.findElement(By.id("name")).sendKeys("mayur");
	  w.findElement(By.id("address")).sendKeys("korhale ");
	  Select s4=new Select(w.findElement(By.id("card_type")));
	  s4.selectByVisibleText("Visa");
	  w.findElement(By.id("card_number")).sendKeys("98655452");
	  w.findElement(By.id("cardholder_name")).sendKeys("mayur");
	  w.findElement(By.id("verification_code")).sendKeys("4575");
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();
	 
	  
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[15]/div[1]/a[1]/span[1]")).click();
	  w.findElement(By.id("email")).sendKeys("Sam123@gmail.com");
	  w.findElement(By.id("name")).sendKeys("samiksha");
	  w.findElement(By.id("address")).sendKeys("korhale ");
	  Select s5=new Select(w.findElement(By.id("card_type")));
	  s5.selectByVisibleText("Visa");
	  w.findElement(By.id("card_number")).sendKeys("98655452");
	  w.findElement(By.id("cardholder_name")).sendKeys("samiksha");
	  w.findElement(By.id("verification_code")).sendKeys("4565");
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();
	    
	  
	  //Flavored Tea
	  w.findElement(By.linkText("Welcome")).click();
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[21]/div[1]/div[1]/a[1]/img[1]")).click();
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[27]/div[1]/a[1]/span[1]")).click();
	  
		 
	  w.findElement(By.id("email")).sendKeys("Sam123@gmail.com");
	  w.findElement(By.id("name")).sendKeys("samiksha");
	  w.findElement(By.id("address")).sendKeys("korhale ");
	  Select s7=new Select(w.findElement(By.id("card_type")));
	  s7.selectByVisibleText("Visa");
	  w.findElement(By.id("card_number")).sendKeys("98655452");
	  w.findElement(By.id("cardholder_name")).sendKeys("samiksha");
	  w.findElement(By.id("verification_code")).sendKeys("4565");
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();


	 w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[16]/div[1]/a[1]/span[1]")).click();
	  w.findElement(By.id("email")).sendKeys("mayuri123@gmail.com");
	  w.findElement(By.id("name")).sendKeys("mayuri");
	  w.findElement(By.id("address")).sendKeys("korhale ");
	  Select s8=new Select(w.findElement(By.id("card_type")));
	  s8.selectByVisibleText("Visa");
	  w.findElement(By.id("card_number")).sendKeys("98655452");
	  w.findElement(By.id("cardholder_name")).sendKeys("samiksha");
	  w.findElement(By.id("verification_code")).sendKeys("4995");
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();
	 
	  
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[15]/div[1]/a[1]/span[1]")).click();
	  w.findElement(By.id("email")).sendKeys("Sam123@gmail.com");
	  w.findElement(By.id("name")).sendKeys("apeksha");
	  w.findElement(By.id("address")).sendKeys("korhale ");
	  Select s9=new Select(w.findElement(By.id("card_type")));
	  s9.selectByVisibleText("Visa");
	  w.findElement(By.id("card_number")).sendKeys("98655452");
	  w.findElement(By.id("cardholder_name")).sendKeys("apekshaa");
	  w.findElement(By.id("verification_code")).sendKeys("4565");
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();
	    
	  // our passion button
	  
	    w.findElement(By.linkText("Our Passion")).click();
	     w.findElement(By.linkText("Let's Talk Tea")).click();
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[18]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Samiksha");
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[18]/div[1]/div[1]/div[2]/input[1]")).sendKeys("sam234@gmail.com");
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[18]/div[1]/div[1]/div[3]/input[1]")).sendKeys("want to learn more about passion tea");
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[18]/div[1]/div[1]/div[4]/textarea[1]")).sendKeys("want to give more information about oolong tea");
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[18]/div[1]/div[1]/div[5]/input[1]")).click();
	 //submit button is not workable
	  //w.findElement(By.xpath("/html[1]/body[1]")).click();
	  
	// check out
	  w.findElement(By.linkText("Check Out")).click();
	  w.findElement(By.id("email")).sendKeys("Sam123@gmail.com");
	  w.findElement(By.id("name")).sendKeys("samiksha");
	  w.findElement(By.id("address")).sendKeys("korhale ");
	  Select ss1=new Select(w.findElement(By.id("card_type")));
	  ss1.selectByVisibleText("Visa");
	  w.findElement(By.id("card_number")).sendKeys("98655452");
	  w.findElement(By.id("cardholder_name")).sendKeys("samiksha");
	  w.findElement(By.id("verification_code")).sendKeys("4565");
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();
	 
	  // more button
	  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[18]/div[1]/p[1]/a[1]/span[1]")).click();
	}

}
