package cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n01.model.services;

import cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n01.model.repository.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SucursalService {

	@Autowired
	private SucursalRepository sucursalRepository;

	public Sucursal addSucursal(Sucursal sucursal) {
		return sucursalRepository.save(sucursal);
	}

	public Sucursal updateSucursal(Sucursal sucursal) {
		return sucursalRepository.save(sucursal);
	}

	public void deleteSucursal(Integer id) {
		sucursalRepository.deleteById(id);
	}

	public Sucursal getSucursal(Integer id) {
		Optional<Sucursal> optionalSucursal = sucursalRepository.findById(id);
		return optionalSucursal.orElse(null);
	}

	public List<Sucursal> getAllSucursals() {
		return sucursalRepository.findAll();
	}
}
