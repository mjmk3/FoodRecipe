package app.foodrecipe.foodrecipecore.Resource;

import io.swagger.v3.oas.annotations.tags.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
@Tag(name = "Users")
public class UserResource {
}
