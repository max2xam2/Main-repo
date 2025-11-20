package HW.HW3.Task5;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    FileLogger fileLogger = new FileLogger("M001AX|61");
    Logger.printLogHeader();
    String str = input.nextLine();
    fileLogger.log(str);
    fileLogger.log("X777XX|777");
  }
}
