package macbookpro.devakim.macbook_page_clone.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/macbook")
    public String getMacbook() {
        return "Got an endpoint";
    }

}
