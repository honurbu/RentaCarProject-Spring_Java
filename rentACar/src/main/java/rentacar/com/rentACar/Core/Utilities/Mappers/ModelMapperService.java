package rentacar.com.rentACar.Core.Utilities.Mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelMapperService implements IModelMapperService {

	private ModelMapper _modelMapper;
		
	@Override
	public ModelMapper forReponse() {				
		this._modelMapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.LOOSE);
		return this._modelMapper;
	}

	@Override
	public ModelMapper forRequest() {		//-> her şeyi mapple
		// TODO Auto-generated method stub
		this._modelMapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.STANDARD);
		return this._modelMapper;
	}

}
