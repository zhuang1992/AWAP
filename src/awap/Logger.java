package awap;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
  private static File log;

  private static BufferedWriter bw;

  Logger() {

    System.out.println("abc");

  }

  public static void log(String message) {
    log = new File("/home/micz/LogLog");
    try {
      bw = new BufferedWriter(new FileWriter(log, true));
    } catch (IOException e) {
      e.printStackTrace();
    }
    try {
      bw.write(message);
      bw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
