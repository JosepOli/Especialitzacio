package Dice.Game.Dice.Game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Dice.Game.Dice.Game.model.services.PlayerServiceInterface;

@Controller
public class HomeController {
	@Autowired
	private PlayerServiceInterface playerService;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("players", playerService.getAllPlayers());
		return "index";
	}
}
