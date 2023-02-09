import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) {
        System.out.println("Select an option\n1- Music Player\n2- Call App\n3- Internet Browser");
        Scanner scanner = new Scanner(System.in);
        int userChoose = scanner.nextInt();

        if (userChoose > 0 && userChoose < 4) {
            switch (userChoose) {
                case 1:
                    MusicPlayer();
                    break;
                case 2:
                    CallApp();
                    break;
                case 3:
                    InternetBrowser();
                    break;
            }
        }
    }
    static void MusicPlayer(){
        System.out.println("What's your choose next\n1- Play\n2- Pause\n3- Change Music");
        Scanner scanner = new Scanner(System.in);
        int userChoose = scanner.nextInt();
        if (userChoose > 0 && userChoose < 4){
            switch (userChoose){
                case 1:
                    System.out.println("Playing music");
                    break;
                case 2:
                    System.out.println("Music paused");
                    break;
                case 3:
                    System.out.println("Changing music");
                    break;
            }
        }
    }
    static void CallApp(){
        System.out.println("What's your choose next\n1- Call\n2- Answer call\n3- Voice Mail");
        Scanner scanner = new Scanner(System.in);
        int userChoose = scanner.nextInt();
        if (userChoose > 0 && userChoose < 4){
            switch (userChoose) {
                case 1:
                    System.out.println("Calling to +55012345678");
                    break;
                case 2:
                    System.out.println("On call now");
                    break;
                case 3:
                    System.out.println("You have no voice mail");
                    break;
            }
        }
    }
    static void InternetBrowser(){
        System.out.println("What's your choose next\n1-Show Page\n2- New tab\n3- Refresh page");
        Scanner scanner = new Scanner(System.in);
        int userChoose = scanner.nextInt();
        if (userChoose > 0 && userChoose < 4){
            switch (userChoose) {
                case 1:
                    System.out.println("Showing tab");
                    break;
                case 2:
                    System.out.println("New tab opened");
                    break;
                case 3:
                    System.out.println("Refreshing page now");
                    break;
            }
        }
    }
}

