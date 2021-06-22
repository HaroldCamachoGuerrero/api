package com.carcenter.api.Controladores;

import com.carcenter.api.entities.Mecanicos;
import com.carcenter.api.entities.MecanicosView;
import com.carcenter.api.entities.ViewFacturacion;
import com.carcenter.api.entities.ViewRepuestos;
import com.carcenter.api.entities.ViewServicios;
import com.carcenter.api.repository.MecanicosRepository;
import com.carcenter.api.repository.ViewFacturacionRepository;
import com.carcenter.api.repository.ViewMecanicoRepository;
import com.carcenter.api.repository.ViewRepuestosRepository;
import com.carcenter.api.repository.ViewServiciosRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/mecanicos")

public class MecanicosController {

    @Autowired
    private MecanicosRepository mecanicosRepository;

    @Autowired
    private ViewMecanicoRepository viewMecanicoRepository;

    @Autowired
    private ViewFacturacionRepository viewFacturacionRepository;
    @Autowired
    private ViewRepuestosRepository viewRepuestosRepository;
        @Autowired
    private ViewServiciosRepository viewServiciosRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Mecanicos> buscarMecanicos() {
        List<Mecanicos> listMec = new ArrayList<>();
        listMec = mecanicosRepository.findAll();

        return listMec;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/view")
    public List<MecanicosView> buscarMecanicosView() {
        List<MecanicosView> listMec = new ArrayList<>();
        listMec = viewMecanicoRepository.findAll();

        return listMec;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Mecanicos crearMecanicos(@RequestBody Mecanicos mec) {
        Mecanicos mecBsq = mecanicosRepository.getBuscaMecanico(mec.getTipo_documento(), String.valueOf(mec.getDocumento()));
        if (mecBsq == null) {
            mec = mecanicosRepository.save(mec);
            return mec;
        } else {

            return null;
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/id/{id}")
    public ViewFacturacion buscarFactura(@PathVariable("id") String id) {
        ViewFacturacion fac = new ViewFacturacion();
        fac = viewFacturacionRepository.getBuscarFac( id);

        return fac;
    }
    
        @RequestMapping(method = RequestMethod.GET, path = "/repuestos/{id}")
    public List<ViewRepuestos> buscarRepuestos(@PathVariable("id") String id) {
        List<ViewRepuestos> replist = new ArrayList<>();
        replist = viewRepuestosRepository.getBuscarSer(id);

        return replist;
    }
    
            @RequestMapping(method = RequestMethod.GET, path = "/servicios/{id}")
    public  List<ViewServicios>  buscarServicios(@PathVariable("id") String id) {
      List<ViewServicios> serList = new ArrayList<>();
        serList = viewServiciosRepository.getBuscarRep(id);

        return serList;
    }

}
