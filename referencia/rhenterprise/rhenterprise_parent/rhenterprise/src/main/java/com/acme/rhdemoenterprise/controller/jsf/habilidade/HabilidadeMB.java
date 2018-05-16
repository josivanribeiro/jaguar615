package com.acme.rhdemoenterprise.controller.jsf.habilidade;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

import com.acme.rhdemoenterprise.controller.jsf.AppMB;
import com.powerlogic.jcompany.commons.annotation.PlcUriIoC;
import com.powerlogic.jcompany.commons.config.stereotypes.SPlcMB;
import com.powerlogic.jcompany.controller.jsf.PlcEntityList;
import com.powerlogic.jcompany.controller.jsf.annotations.PlcHandleException;



/*	Para alterar o comportamento padrÃ£o do jCompany, descomente esse trecho do cÃ³digo e altere a configuraÃ§Ã£o conforme desejar. 

import com.powerlogic.jcompany.config.aggregation.PlcConfigAggregation;
import com.powerlogic.jcompany.config.collaboration.PlcConfigCollaboration;
import com.powerlogic.jcompany.config.collaboration.PlcConfigTabular;

	
@PlcConfigAggregation(entidade = com.plc.app2.entity.CidadeEntity.class)

@PlcConfigCollaboration(tabular = @PlcConfigTabular(numeroNovos = 4))

*/




/**
 * Classe de Controle gerada pelo assistente
 */
@SPlcMB
@PlcUriIoC("habilidade")	
@PlcHandleException
public class HabilidadeMB extends AppMB  {

	private static final long serialVersionUID = 1L;

	

	/**
	 * Entidade da aÃ§Ã£o injetado pela CDI
	*/
	@Produces  @Named("habilidadeLista")
	public PlcEntityList criaLogicaItensPlc() {
		if (this.entityListPlc==null) {
			this.entityListPlc = new PlcEntityList();
			this.newObjectList();
		}
		return this.entityListPlc;
	}	
}