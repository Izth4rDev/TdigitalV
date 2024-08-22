package cl.praxis.veterinariatd.restcontroller;
import cl.praxis.veterinariatd.entity.Atencion;
import cl.praxis.veterinariatd.service.serviceImpl.AtencionServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/vet")
public class VetControllerRest {

    private AtencionServiceImpl atencionService;

    public VetControllerRest(AtencionServiceImpl atencionService) {
        this.atencionService = atencionService;
    }

    @GetMapping
    public ResponseEntity<List<Atencion>> getAllAtencion(){
        List<Atencion> atenciones = atencionService.getAllAtenciones();
        return ResponseEntity.ok(atenciones);
    }

    @PostMapping
    public ResponseEntity<Atencion> createAtencion(@RequestBody Atencion atencion){
        Atencion atencionCreada = atencionService.createAtencion(atencion);
        return ResponseEntity.ok(atencionCreada);
    }

    @PostMapping("/test")
    public String test(){
        return "funciona";
    }

    @PutMapping
    public ResponseEntity<Atencion> updateAtencion(@RequestBody Atencion atencion){
        Atencion atencionUpdated = atencionService.updateAtencion(atencion);
        return  ResponseEntity.ok(atencionUpdated);
    }
}
