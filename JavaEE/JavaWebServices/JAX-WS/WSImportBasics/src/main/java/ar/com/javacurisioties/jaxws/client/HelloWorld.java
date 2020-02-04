
package ar.com.javacurisioties.jaxws.client;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorld", targetNamespace = "http://sei.jaxws.javacurisioties.com.ar/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorld {


    /**
     * 
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "say3", targetNamespace = "http://sei.jaxws.javacurisioties.com.ar/", className = "ar.com.javacurisioties.jaxws.client.Say3")
    @ResponseWrapper(localName = "say3Response", targetNamespace = "http://sei.jaxws.javacurisioties.com.ar/", className = "ar.com.javacurisioties.jaxws.client.Say3Response")
    @Action(input = "http://sei.jaxws.javacurisioties.com.ar/HelloWorld/say3Request", output = "http://sei.jaxws.javacurisioties.com.ar/HelloWorld/say3Response")
    public String say3(
        @WebParam(name = "parameters", targetNamespace = "")
        SayParameters parameters);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "say", targetNamespace = "http://sei.jaxws.javacurisioties.com.ar/", className = "ar.com.javacurisioties.jaxws.client.Say")
    @ResponseWrapper(localName = "sayResponse", targetNamespace = "http://sei.jaxws.javacurisioties.com.ar/", className = "ar.com.javacurisioties.jaxws.client.SayResponse")
    @Action(input = "http://sei.jaxws.javacurisioties.com.ar/HelloWorld/sayRequest", output = "http://sei.jaxws.javacurisioties.com.ar/HelloWorld/sayResponse")
    public String say(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "say0", targetNamespace = "http://sei.jaxws.javacurisioties.com.ar/", className = "ar.com.javacurisioties.jaxws.client.Say0")
    @Action(input = "http://sei.jaxws.javacurisioties.com.ar/HelloWorld/say0")
    public void say0(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
