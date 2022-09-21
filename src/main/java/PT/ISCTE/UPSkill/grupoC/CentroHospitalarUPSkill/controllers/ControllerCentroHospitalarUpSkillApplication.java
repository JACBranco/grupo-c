package PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerCentroHospitalarUpSkillApplication {

    @GetMapping(value = "/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/user")
    public String userPage() {
        return "user";
    }

}
