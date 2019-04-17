package bitcamp.project.test;

import bitcamp.project.test.service.FileService;
import bitcamp.project.test.service.BoardService;
import bitcamp.project.test.service.ManagerService;
>>>>>>> branch 'master' of https://github.com/eikhyeonchoi/bitcamp-project-test.git
import bitcamp.project.test.service.MemberService;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }
    

<<<<<<< HEAD
  public static void main(String[] args) {
    System.out.println("*************************************");
    FileService fs = new FileService();
    fs.list();
    System.out.println("*************************************");
=======
    public static void main(String[] args) {
      System.out.println("gg");
      BoardService boardService = new BoardService();
      boardService.list();
    System.out.println("--------------------");
    ManagerService s = new ManagerService();
    s.list();
    System.out.println("--------------------");
    
>>>>>>> branch 'master' of https://github.com/eikhyeonchoi/bitcamp-project-test.git
    MemberService m = new MemberService();
    
    for (int i=0; i < 10; i++) {
      m.list();
    }
  }  
  }
  
  
