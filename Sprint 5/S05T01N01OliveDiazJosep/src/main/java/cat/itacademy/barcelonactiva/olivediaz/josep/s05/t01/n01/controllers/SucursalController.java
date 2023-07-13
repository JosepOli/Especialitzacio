package cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n01.controllers;

import cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n01.model.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sucursal")
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    @PostMapping("/add")
    public Sucursal addSucursal(@RequestBody Sucursal sucursal) {
        return sucursalService.addSucursal(sucursal);
    }

    @PutMapping("/update")
    public Sucursal updateSucursal(@RequestBody Sucursal sucursal) {
        return sucursalService.updateSucursal(sucursal);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSucursal(@PathVariable Integer id) {
        sucursalService.deleteSucursal(id);
    }

    @GetMapping("/getOne/{id}")
    public Sucursal getSucursal(@PathVariable Integer id) {
        return sucursalService.getSucursal(id);
    }

    @GetMapping("/getAll")
    public List<Sucursal> getAllSucursals() {
        return sucursalService.getAllSucursals();
    }
}

