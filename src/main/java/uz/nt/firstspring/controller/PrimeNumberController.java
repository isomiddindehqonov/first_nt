package uz.nt.firstspring.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
@RestController

public class PrimeNumberController {
    @GetMapping(value = "/printPrimeNumbers")
    public List<Integer> printPrimeNumbers(@RequestParam Integer n){
        List<Integer> list = new ArrayList<>();

        int count = 0;

        for (int i = 2; i < n; i++){
            count = 0;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    count = 1;
                }
            }
            if (count == 0){
                list.add(i);
            }
        }

        return list;
    }
}
