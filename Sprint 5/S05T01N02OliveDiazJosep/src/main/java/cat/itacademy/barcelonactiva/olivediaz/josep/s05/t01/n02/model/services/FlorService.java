package cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n02.model.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n02.model.domain.FlorEntity;
import cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n02.model.dto.FlorDTO;
import cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n02.model.repository.FlorRepository;

@Service
public class FlorService implements FlorServiceInterface{

	@Autowired
	private FlorRepository florRepository;

	// Convert entity to DTO
	private FlorDTO convertToDTO(FlorEntity entity) {
		FlorDTO dto = new FlorDTO();
		dto.setPk_FlorID(entity.getPk_FlorID());
		dto.setNomFlor(entity.getNomFlor());
		dto.setPaisFlor(entity.getPaisFlor());
		return dto;
	}

	// Convert DTO to entity
	private FlorEntity convertToEntity(FlorDTO dto) {
		FlorEntity entity = new FlorEntity();
		entity.setPk_FlorID(dto.getPk_FlorID());
		entity.setNomFlor(dto.getNomFlor());
		entity.setPaisFlor(dto.getPaisFlor());
		return entity;
	}

	public FlorDTO addFlor(FlorDTO florDTO) {
		FlorEntity entity = convertToEntity(florDTO);
		entity = florRepository.save(entity);
		return convertToDTO(entity);
	}

	public FlorDTO updateFlor(FlorDTO florDTO) {
		FlorEntity entity = convertToEntity(florDTO);
		entity = florRepository.save(entity);
		return convertToDTO(entity);
	}

	public void deleteFlor(Integer id) {
		florRepository.deleteById(id);
	}

	public FlorDTO getOneFlor(Integer id) {
		Optional<FlorEntity> entity = florRepository.findById(id);
		return entity.map(this::convertToDTO).orElse(null);
	}

	public List<FlorDTO> getAllFlor() {
		List<FlorEntity> entities = florRepository.findAll();
		return entities.stream().map(this::convertToDTO).collect(Collectors.toList());
	}
}
