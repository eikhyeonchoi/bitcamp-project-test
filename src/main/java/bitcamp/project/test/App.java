package bitcamp.project.test;

<<<<<<< HEAD
import bitcamp.project.test.service.ManagerService;
import bitcamp.project.test.service.MemberService;
=======
import bitcamp.project.test.service.LessonService;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }
>>>>>>> refs/heads/jisungwork

<<<<<<< HEAD
public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    System.out.println("--------------------");
    ManagerService s = new ManagerService();
    s.list();
    System.out.println("--------------------");
    
    MemberService m = new MemberService();
    
    for (int i=0; i < 10; i++) {
      m.list();
=======
    public static void main(String[] args) {
      System.out.println("//////////////////////////");
      LessonService lesson = new LessonService();
      lesson.list();
      System.out.println("//////////////////////////");
>>>>>>> refs/heads/jisungwork
    }
  }
  
  
}
