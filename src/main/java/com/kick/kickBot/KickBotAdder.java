package com.kick.kickBot;

import java.io.IOException;

public class KickBotAdder {

    public void AddBots(String kickAdress, int botAmount) {
        System.out.println("Adding " + botAmount + " bots to " + kickAdress);

        try {
            String url = "https://www.kick.com/" + kickAdress;
            for (int i = 0; i < botAmount; i++) {
                openBrowser(url);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openBrowser(String url) throws IOException {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
        } else if (os.contains("mac")) {
            Runtime.getRuntime().exec("open " + url);
        } else if (os.contains("nix") || os.contains("nux")) {
            Runtime.getRuntime().exec("xdg-open " + url);
        } else {
            System.out.println("Unsupported operating system: " + os);
        }
    }
}
