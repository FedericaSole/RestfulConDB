/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

/**
 *
 * @author biar
 */
public class RestServer {
 
    
    public static void main(String[] argv){
        JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
        factoryBean.setResourceClasses(CantanteRepository.class);
        factoryBean.setResourceProvider(new SingletonResourceProvider(new CantanteRepository()));
        factoryBean.setAddress("http://localhost:8080/");
        Server server = factoryBean.create();
    }
    
  
}
