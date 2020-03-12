package Service;

import model.Cupom;
import model.CupomItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import repository.CupomRepository;

@Service("CupomService")
public class CupomService {

    @Autowired
    CupomRepository repository;

    public ResponseEntity salvar(Cupom cupom){
    
    }

}