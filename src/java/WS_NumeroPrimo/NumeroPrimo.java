/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WS_NumeroPrimo;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Diego
 */
@WebService(serviceName = "NumeroPrimo")
public class NumeroPrimo {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "isPrimo")
    public String isPrimo(@WebParam(name = "numero") int numero) {
        //codigo para retorno de numero primo
        
        //variaveis
        //CONTADOR DE DIVISOR
        int var_contador = 0;
        //RESTO DAS DIVISÕES
        int var_restodiv = 0;
        //VALIDADOR
        int var_numAux = 1;
        
        
        //Enquanto o numero que vir do parametro for maior ou igual a 1 faça
        while(numero >= var_numAux){
            var_restodiv = numero % var_numAux;
                    
            if(var_restodiv==0){
                var_contador++;
            
            }
            var_numAux++;
        }
        
        if(var_contador > 2){
            return " NÃO É PRIMO ";
            
                   
        }
        else {
        return " NUMERO É PRIMO " ;
        }
              
        
    }
}
