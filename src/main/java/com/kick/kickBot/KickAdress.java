package com.kick.kickBot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KickAdress {

    @PostMapping("/api/test/submit")
    public String handleSubmit(@RequestParam("adress") String adress, @RequestParam("bot amount") int botAmount) {
        System.out.println("Entered Kick Address: " + adress);
        System.out.println("Entered Bot Amount: " + botAmount);
        KickBotAdder botAdder = new KickBotAdder();
        botAdder.AddBots(adress, botAmount);
        return "form";
    }
}
