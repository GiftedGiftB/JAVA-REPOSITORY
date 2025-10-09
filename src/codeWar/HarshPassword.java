package codeWar;

public class HarshPassword {
    public static void main(String[] args){
        String result = harshPassword("34567987654");
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
