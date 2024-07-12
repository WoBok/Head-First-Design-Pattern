package CommandPattern.Code;

import java.io.IOException;
import java.util.Scanner;

public class CustomRemoteTest {
    public static void main(String[] args) throws IOException {
        var customRemote = new CustomRemote();
        var scanner = new Scanner(System.in);
        while (true) {
            var id = scanner.nextInt();
            switch (id) {
                case 1:
                case 2:
                case 3:
                    customRemote.PressButton(id);
                    break;
                default:
                    System.out.println("Id is invalid...");
            }
        }
    }
}