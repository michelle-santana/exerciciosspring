package controller;

import model.Cupom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repository.CupomRepository;

import java.util.List;

@RestController
public class CupomController {

    @Autowired
    private CupomRepository repository;

    @PostMapping("/cupom")
    public Cupom save(@RequestBody Cupom cupom) {
        return repository.save(cupom);
    }

    @GetMapping("/cupom")
    public List<Cupom>find(){
        return repository.findAll();

    }

}
