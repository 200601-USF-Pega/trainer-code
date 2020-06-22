
package com.revature.web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.revature.web package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddHero_QNAME = new QName("http://service.tourofheroes.revature.com/", "addHero");
    private final static QName _GetAllHeroes_QNAME = new QName("http://service.tourofheroes.revature.com/", "getAllHeroes");
    private final static QName _AddHeroResponse_QNAME = new QName("http://service.tourofheroes.revature.com/", "addHeroResponse");
    private final static QName _GetAllHeroesResponse_QNAME = new QName("http://service.tourofheroes.revature.com/", "getAllHeroesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.revature.web
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllHeroesResponse }
     * 
     */
    public GetAllHeroesResponse createGetAllHeroesResponse() {
        return new GetAllHeroesResponse();
    }

    /**
     * Create an instance of {@link AddHeroResponse }
     * 
     */
    public AddHeroResponse createAddHeroResponse() {
        return new AddHeroResponse();
    }

    /**
     * Create an instance of {@link GetAllHeroes }
     * 
     */
    public GetAllHeroes createGetAllHeroes() {
        return new GetAllHeroes();
    }

    /**
     * Create an instance of {@link AddHero }
     * 
     */
    public AddHero createAddHero() {
        return new AddHero();
    }

    /**
     * Create an instance of {@link Hero }
     * 
     */
    public Hero createHero() {
        return new Hero();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddHero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tourofheroes.revature.com/", name = "addHero")
    public JAXBElement<AddHero> createAddHero(AddHero value) {
        return new JAXBElement<AddHero>(_AddHero_QNAME, AddHero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllHeroes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tourofheroes.revature.com/", name = "getAllHeroes")
    public JAXBElement<GetAllHeroes> createGetAllHeroes(GetAllHeroes value) {
        return new JAXBElement<GetAllHeroes>(_GetAllHeroes_QNAME, GetAllHeroes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddHeroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tourofheroes.revature.com/", name = "addHeroResponse")
    public JAXBElement<AddHeroResponse> createAddHeroResponse(AddHeroResponse value) {
        return new JAXBElement<AddHeroResponse>(_AddHeroResponse_QNAME, AddHeroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllHeroesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tourofheroes.revature.com/", name = "getAllHeroesResponse")
    public JAXBElement<GetAllHeroesResponse> createGetAllHeroesResponse(GetAllHeroesResponse value) {
        return new JAXBElement<GetAllHeroesResponse>(_GetAllHeroesResponse_QNAME, GetAllHeroesResponse.class, null, value);
    }

}
