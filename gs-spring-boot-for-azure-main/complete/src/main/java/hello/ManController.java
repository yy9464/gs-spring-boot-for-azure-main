package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h3>gs-spring-boot-for-azure-main</h3>
 *
 * @author : bitso
 * @date : 2023-10-25 15:36
 **/
@RestController
@RequestMapping
public class ManController {

    @GetMapping("/{a}/{b}")
    public String get(@PathVariable String a, @PathVariable String b) {
        return a + b;
    }

}
