package codeWar;

public class HarshPassword {
    public static void main(String[] args){

        String number = "34567987664";
        String result = harshPassword(number);
        System.out.println(result);
    }

    public static String harshPassword(String password) {
        if (password.length() <= 4) {
            return password;
        }
        String masked = "";
        for (int count = 0; count < password.length() - 4; count++) {
            masked = masked + "#";
        }
        String lastFourCharacters = password.substring(password.length() - 4);
        return masked + lastFourCharacters;
    }
}
