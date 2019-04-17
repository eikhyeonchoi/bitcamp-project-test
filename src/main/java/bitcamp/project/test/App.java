package bitcamp.project.test;

import bitcamp.project.test.service.ManagerService;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    System.out.println("--------------------");
    ManagerService s = new ManagerService();
    s.list();
    System.out.println("--------------------");
  }
}
