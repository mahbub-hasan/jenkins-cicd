package jenkins.demo.cicd;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EndPoint {

    @GetMapping(value = "/listOfStudents")
    public ResponseEntity<List<String>> getListOfStudents(){
        List<String> students = Arrays.asList("Jon","Dau","Robin");

        return new ResponseEntity<>(students, HttpStatus.OK);
    }
}
