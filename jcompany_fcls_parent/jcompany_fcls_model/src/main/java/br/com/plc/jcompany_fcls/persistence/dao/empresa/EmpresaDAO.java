/*  																													
	    			       Jaguar-jCompany Developer Suite.																		
			    		        Powerlogic 2010-2014.
			    		    
		Please read licensing information in your installation directory.Contact Powerlogic for more 
		information or contribute with this project: suporte@powerlogic.com.br - www.powerlogic.com.br																								
 */ 
package br.com.plc.jcompany_fcls.persistence.dao.empresa;

import java.math.BigDecimal;
import java.util.List;

import br.com.plc.jcompany_fcls.entity.empresa.EmpresaEntity;
import br.com.plc.jcompany_fcls.entity.funcionario.FuncionarioEntity;
import br.com.plc.jcompany_fcls.persistence.dao.AppJpaDAO;

import com.powerlogic.jcompany.commons.PlcBaseContextVO;
import com.powerlogic.jcompany.commons.annotation.PlcAggregationDAOIoC;
import com.powerlogic.jcompany.commons.config.stereotypes.SPlcDataAccessObject;
import com.powerlogic.jcompany.persistence.jpa.PlcQuery;
import com.powerlogic.jcompany.persistence.jpa.PlcQueryFirstLine;
import com.powerlogic.jcompany.persistence.jpa.PlcQueryLineAmount;
import com.powerlogic.jcompany.persistence.jpa.PlcQueryOrderBy;
import com.powerlogic.jcompany.persistence.jpa.PlcQueryParameter;
import com.powerlogic.jcompany.persistence.jpa.PlcQueryService;

@PlcAggregationDAOIoC(EmpresaEntity.class)
@SPlcDataAccessObject
@PlcQueryService
public class EmpresaDAO extends AppJpaDAO{


	@PlcQuery("querySel")
	public native List<FuncionarioEntity> findList(
			PlcBaseContextVO context,
			@PlcQueryParameter(name = "id", expression=" id = :id") Long id,
			@PlcQueryParameter(name = "nome", expression=" nome like '%' || :nome || '%'") String nome,
			@PlcQueryParameter(name = "capitalSocial", expression=" capitalSocial = :capitalSocial") BigDecimal capitalSocial,
			@PlcQueryOrderBy String dynamicOrderByPlc,
			@PlcQueryFirstLine Integer primeiraLinhaPlc, 
			@PlcQueryLineAmount Integer numeroLinhasPlc		   
	);

	@PlcQuery("querySel")
	public native Long findCount(
			PlcBaseContextVO context,
			@PlcQueryParameter(name = "id", expression=" id = :id") Long id,
			@PlcQueryParameter(name = "nome", expression=" nome like '%' || :nome || '%'") String nome,
			@PlcQueryParameter(name = "capitalSocial", expression=" capitalSocial = :capitalSocial") BigDecimal capitalSocial,
			@PlcQueryOrderBy String dynamicOrderByPlc,
			@PlcQueryFirstLine Integer primeiraLinhaPlc, 
			@PlcQueryLineAmount Integer numeroLinhasPlc		   
	);	



}
