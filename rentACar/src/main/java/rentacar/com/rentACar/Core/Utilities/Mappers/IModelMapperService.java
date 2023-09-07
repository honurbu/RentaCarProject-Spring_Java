package rentacar.com.rentACar.Core.Utilities.Mappers;

import org.modelmapper.ModelMapper;

public interface IModelMapperService {

	ModelMapper forReponse();
	ModelMapper forRequest();
}
