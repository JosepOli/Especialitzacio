package cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n02.model.services;

import java.util.List;
import cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n02.model.dto.FlorDTO;

public interface FlorServiceInterface {
    FlorDTO addFlor(FlorDTO florDTO);
    FlorDTO updateFlor(FlorDTO florDTO);
    void deleteFlor(Integer id);
    FlorDTO getOneFlor(Integer id);
    List<FlorDTO> getAllFlor();
}
