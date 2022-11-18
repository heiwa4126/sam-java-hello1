package helloworld;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MessageTest {
  @Test
  public void dummy() {
    // かなり雑なテストですんません
    try {
      var m0 = new Message();
      System.out.println(m0);
      var m1 = new Message("hello world", "here");
      System.out.println(m1);
      System.out.println(m0.toJsonString());
      System.out.println(m1.toJsonString());
    } catch (Exception e) {
      e.printStackTrace();
      assertTrue(false);
      return;
    }
    assertTrue(true);
  }
}
