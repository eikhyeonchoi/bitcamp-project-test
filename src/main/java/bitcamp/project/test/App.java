package bitcamp.project.test;

import bitcamp.project.test.service.FileService;
import bitcamp.project.test.service.MemberService;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    System.out.println("*************************************");
    FileService fs = new FileService();
    fs.list();
    System.out.println("*************************************");
    MemberService m = new MemberService();
    
    for (int i=0; i < 10; i++) {
      m.list();
    }
  }  
}
