package com.clientui.clientui.web.controller;

import com.clientui.clientui.beans.AbbonnementBean;
import com.clientui.clientui.beans.PassagerBean;
import com.clientui.clientui.proxies.MicroserviceAbbonnementProxy;
import com.clientui.clientui.proxies.MicroservicePassagerProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    MicroservicePassagerProxy passagerProxy;

    @Autowired
    MicroserviceAbbonnementProxy abbonnementProxy;

    @GetMapping("/profil")
    public String landing(Model model){
        PassagerBean passager = passagerProxy.show(1);
        AbbonnementBean abbonnement = abbonnementProxy.get();

        model.addAttribute("passager", passager);
        model.addAttribute("abonnement", abbonnement);

        return "passagers/show";
    }
}
