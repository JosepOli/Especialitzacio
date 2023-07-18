package cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n01.controllers;

import cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n01.model.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/sucursal")
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    @PostMapping("/add")
    public @ResponseBody Sucursal addSucursal(@RequestBody Sucursal sucursal) {
        return sucursalService.addSucursal(sucursal);
    }

    @PutMapping("/update")
    public @ResponseBody Sucursal updateSucursal(@RequestBody Sucursal sucursal) {
        return sucursalService.updateSucursal(sucursal);
    }

    @DeleteMapping("/delete/{id}")
    public @ResponseBody void deleteSucursal(@PathVariable Integer id) {
        sucursalService.deleteSucursal(id);
    }

    @GetMapping("/getOne/{id}")
    public @ResponseBody Sucursal getSucursal(@PathVariable Integer id) {
        return sucursalService.getSucursal(id);
    }

    @GetMapping("/getAll")
    public @ResponseBody List<Sucursal> getAllSucursals() {
        return sucursalService.getAllSucursals();
    }

    @GetMapping("/all")
    public String showAllSucursals(Model model) {
        List<Sucursal> sucursals = sucursalService.getAllSucursals();
        model.addAttribute("sucursals", sucursals);
        return "allSucursals";
    }
}
