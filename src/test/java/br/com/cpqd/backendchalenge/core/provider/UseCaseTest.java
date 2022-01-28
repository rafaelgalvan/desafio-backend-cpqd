package br.com.cpqd.backendchalenge.core.provider;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cpqd.backendchalenge.InformeBoundary;
import br.com.cpqd.backendchalenge.core.domain.InformeDiario;
import br.com.cpqd.backendchalenge.dataprovider.InformeProvider;


public class UseCaseTest {


	private InformeBoundary pinheiroBoundary;

	@Before
	public void setup() {	
		pinheiroBoundary = new InformeProvider();

	}

	@Test
	public void deveObterOsDadosdeInformesDiario() {

		List<InformeDiario> all = pinheiroBoundary.getAll();
		Assert.assertEquals(124080, all.size());
	}

	@Test
	public void deveObterOTotalConsolidadoPorCnpj() {

		Map<String, InformeDiario> totalCnpjs = pinheiroBoundary.getAllPorCNPJ();
		Assert.assertEquals(22874, totalCnpjs.size());
	}


}