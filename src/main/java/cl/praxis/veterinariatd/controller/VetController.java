package cl.praxis.veterinariatd.controller;
import cl.praxis.veterinariatd.service.serviceImpl.AtencionServiceImpl;
import cl.praxis.veterinariatd.service.serviceImpl.SucursalServiceImpl;
import cl.praxis.veterinariatd.service.serviceImpl.TipoAtencionServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class VetController {

    private AtencionServiceImpl atencionService;
    private TipoAtencionServiceImpl tipoAtencionService;
    private SucursalServiceImpl sucursalService;

    public VetController(AtencionServiceImpl atencionService,TipoAtencionServiceImpl tipoAtencionService,
                         SucursalServiceImpl sucursalService) {
        this.atencionService = atencionService;
        this.tipoAtencionService = tipoAtencionService;
        this.sucursalService = sucursalService;
    }

    @GetMapping
    public String getALlAtenciones(Model model){
        //System.out.println(atencionService.getAllAtenciones());
        model.addAttribute("atenciones", atencionService.getAllAtenciones());
        model.addAttribute("sucursales", sucursalService.getAllSucursal());
        model.addAttribute("tipoAtenciones", tipoAtencionService.getAllTipoAtencion());
        return "index";
    }

    @GetMapping("/search")
    public String searchAtenciones(@RequestParam(value = "sucursal") int sucursalId,
                                    @RequestParam(value = "tipoAtencion") int tipoAtencionId, Model model){
        System.out.println("Estos son los IDS!!!!!!!!!!!!!" +sucursalId + " " + tipoAtencionId);

        model.addAttribute("atenciones", atencionService.searchAtenciones(sucursalId, tipoAtencionId));
        model.addAttribute("sucursales", sucursalService.getAllSucursal());
        model.addAttribute("tipoAtenciones", tipoAtencionService.getAllTipoAtencion());
       return "index";
    }

}
