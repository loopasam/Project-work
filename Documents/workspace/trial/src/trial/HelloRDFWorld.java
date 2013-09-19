package trial;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.VCARD;

public class HelloRDFWorld {

	public static void main(String[] args) {
		/*String personURI    = "http://somewhere/JohnSmith";
		String givenName    = "John";
		String familyName   = "Smith";
		String fullName     = givenName + " " + familyName;
		Model m = ModelFactory.createDefaultModel();
		String NS = "http://example.com/test/"; 
		
		Resource r = m.createResource(NS + "r");
		Property p = m.createProperty(NS +"p");
		
		r. addProperty (p, "hello world", XSDDatatype.XSDstring);
		
		m.write(System.out, "N3");
		Resource johnSmith
		  = m.createResource(personURI)
		         .addProperty(VCARD.FN, fullName)
		         .addProperty(VCARD.N,
		                      m.createResource()
		                           .addProperty(VCARD.Given, givenName)
		                           .addProperty(VCARD.Family, familyName));
		m.write(System.out, "RDF/XML");
		*/
		Model model = ModelFactory.createDefaultModel();
		Resource Annehathaway 
		  = model.createResource("http://www.woman/AnneHathaway")
				 .addProperty(VCARD.KEY, "AnneHathway")
		         .addProperty(VCARD.FN, model.createResource(VCARD.FN)
		        		                     .addProperty(VCARD.CLASS,"Shakespeare")
				                             .addProperty(VCARD.N, "Kinglear, The Tempest, Hemryv")
				                             .addProperty(VCARD.ADR, model.createResource(VCARD.ADR)
				        		                                          .addProperty(VCARD.GEO, "Startford")
						                                                  .addProperty(VCARD.AGENT, model.createResource(VCARD.AGENT)
						                            		                                             .addProperty(VCARD.GROUP, "England")
						                     		                                                     .addProperty(VCARD.Country,"UK"))));
		         

		     
		
		          
		           
	    model.write(System.out, "N-TRIPLES");  
	 
		// TODO Auto-generated method stub


		
	}

}
