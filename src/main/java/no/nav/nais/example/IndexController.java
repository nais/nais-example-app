package no.nav.nais.example;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

  @RequestMapping(method = {RequestMethod.GET}, value = "/")
  public ResponseEntity<String> index() {
    return new ResponseEntity<String>("Hi, there, how is life ?", HttpStatus.OK);
  }

}
