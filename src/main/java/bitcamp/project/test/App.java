/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitcamp.project.test;

import bitcamp.project.test.service.LessonService;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
      System.out.println("//////////////////////////");
      LessonService lesson = new LessonService();
      lesson.list();
      System.out.println("//////////////////////////");
    }
}
