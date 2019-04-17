/*
 */
package bitcamp.project.test;

import bitcamp.project.test.service.BoardService;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
      System.out.println("gg");
      BoardService boardService = new BoardService();
      boardService.list();
    }
}
