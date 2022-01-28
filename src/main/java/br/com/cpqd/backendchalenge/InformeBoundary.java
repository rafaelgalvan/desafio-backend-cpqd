package br.com.cpqd.backendchalenge;

import java.util.List;
import java.util.Map;

import br.com.cpqd.backendchalenge.core.domain.InformeDiario;



public interface InformeBoundary {
	List<InformeDiario> getAll();


	Map<String, InformeDiario> getAllPorCNPJ();
}
