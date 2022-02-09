package testNGFrameWork;

import org.testng.annotations.Test;

public class Priority {
	
	
	@Test(priority=-77, invocationCount=5)
	public void create() {
		System.out.println("Create Account");
	}
@Test(priority=77)
public void delete() {
	System.out.println("Delete Account");
}

@Test(priority=1)
public void update() {
	System.out.println("Update Account");
}
@Test(priority=0, enabled=true)
public void forgot() {
	System.out.println("forgot password");
}
@Test(priority=10, invocationCount=2, enabled=false)
public void Login() {
	System.out.println("Login page");
}

@Test
public void fb() {
	System.out.println("FB");
}

@Test
public void insta() {
	System.out.println("Insta");
}
@Test
public void Whatsapp() {
	System.out.println("whatsApp");
}
@Test
public void Telegram() {
	System.out.println("Telegram");
}

@Test
public void tWitter() {
	System.out.println("Twitter");
}
}
