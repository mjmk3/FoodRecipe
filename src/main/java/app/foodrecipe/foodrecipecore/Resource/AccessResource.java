package app.foodrecipe.foodrecipecore.Resource;

import app.foodrecipe.foodrecipecore.Service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/access")
@CrossOrigin(origins = "*")
@Tag(name = "Access")
public class AccessResource {

    private final UserService userService;

    @Autowired
    public AccessResource(UserService userService) {
        this.userService = userService;
    }
}
