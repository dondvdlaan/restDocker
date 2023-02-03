package dev.manyroads.restDocker;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Controller for RESTfull communication
 */
@RestController
@CrossOrigin
public class RESTController {

    @GetMapping("allCustomers")
    public String getCustomers(){

        return "No customers recorded yet";
    }
}
