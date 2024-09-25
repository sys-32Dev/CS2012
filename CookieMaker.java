package cookies;
public class CookieMaker {
    public static void main(String[] args) {
        FortuneCookie[] cookies = new FortuneCookie[5];

        cookies[0] = new FortuneCookie("You will find happiness with a new love.");
        cookies[1] = new FortuneCookie("You will not have a great day.");
        cookies[2] = new FortuneCookie("You will find a new friend.");
        cookies[3] = new FortuneCookie("You will loose all of your possessions.");
        cookies[4] = new FortuneCookie("You will find a new friend.");

        for (FortuneCookie cookie : cookies) {
            System.out.println(cookie.getMessage());
        }
    }
}
