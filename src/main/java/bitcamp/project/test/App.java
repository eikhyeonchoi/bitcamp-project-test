package bitcamp.project.test;

import bitcamp.project.test.service.FileService;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    System.out.println("*************************************");
    FileService fs = new FileService();
    fs.list();
    System.out.println("*************************************");
  }
}
