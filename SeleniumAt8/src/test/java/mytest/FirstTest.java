package mytest;

import org.testng.annotations.Test;

public class FirstTest {
  @Test(priority = 1,groups = {"regression"})
  public void register() {
	  System.out.println("test method register");
  }
  @Test(priority = 2,groups = {"regression","smoke"})
  public void login() {
	  System.out.println("test method login");
  }
  @Test(priority = 3,groups = {"regression","smoke"})
  public void add() {
	  System.out.println("test method add");
  }
  @Test(priority = 4,groups = {"regression"})
  public void cancel() {
	  System.out.println("test method cancel");
  }
}
