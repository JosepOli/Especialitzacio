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

    @GetMapping("/all")
    public String showAllSucursals(Model model) {
        List<Sucursal> sucursals = sucursalService.getAllSucursals();
        model.addAttribute("sucursals", sucursals);
        return "allSucursals";
    }

    @GetMapping("/new") // Form for new Sucursal
    public String createForm(Model model) {
        model.addAttribute("sucursal", new Sucursal());
        return "createForm";
    }

    @PostMapping("/add") // Submit form for new Sucursal
    public String createSucursal(@ModelAttribute Sucursal sucursal) {
        sucursalService.addSucursal(sucursal);
        return "redirect:/sucursal/all";
    }

    @GetMapping("/update/{id}") // Form for updating Sucursal
    public String updateForm(@PathVariable Integer id, Model model) {
        Sucursal sucursal = sucursalService.getSucursal(id);
        model.addAttribute("sucursal", sucursal);
        return "updateForm";
    }

    @PostMapping("/update") // Submit form for updating Sucursal
    public String updateSucursal(@ModelAttribute Sucursal sucursal) {
        sucursalService.updateSucursal(sucursal);
        return "redirect:/sucursal/all";
    }

    @GetMapping("/delete/{id}") // Delete a Sucursal and redirect to allSucursals
    public String deleteSucursal(@PathVariable Integer id) {
        sucursalService.deleteSucursal(id);
        return "redirect:/sucursal/all";
    }
}

