/*  																													
	    			       Jaguar-jCompany Developer Suite.																		
			    		        Powerlogic 2010-2014.
			    		    
		Please read licensing information in your installation directory.Contact Powerlogic for more 
		information or contribute with this project: suporte@powerlogic.com.br - www.powerlogic.com.br																								
*/

package br.com.plc.rhdemo.entity;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import com.powerlogic.jcompany.domain.PlcBaseMapEntity;
/**
 * @since jCompany 3.2 Ancestral para todas as classes da aplicaï¿½ï¿½o, 
 * com pre-mapeamentos para OID, versao e auditoria minima herdados.
 */
@MappedSuperclass
public abstract class AppBaseEntity extends PlcBaseMapEntity implements Serializable {

}
