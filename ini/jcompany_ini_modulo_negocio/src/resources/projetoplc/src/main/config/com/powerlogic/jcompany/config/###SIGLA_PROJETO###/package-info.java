/* ************************* META-DADOS GLOBAIS DA APLICAÇÃO ******************************
  ********************** Configurações padrão para toda a aplicação *************************
  ************ Obs: configurações corporativas devem estar no nível anterior,****************
  ************              preferencialmente na camada Bridge               ****************
  *******************************************************************************************/


@PlcConfigApplication(
	definition=@PlcConfigApplicationDefinition(name="###NOME_PROJETO###", acronym="###SIGLA_PROJETO_MINUSCULA###", version=1, release=0),
	classesDiscreteDomain={},
	classesLookup={}
)

package com.powerlogic.jcompany.config.###SIGLA_PROJETO_MINUSCULA###;
import com.powerlogic.jcompany.config.application.PlcConfigApplication;
import com.powerlogic.jcompany.config.application.PlcConfigApplicationDefinition;
