package trial;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.RDF;
import com.hp.hpl.jena.vocabulary.RDFS;
import com.hp.hpl.jena.vocabulary.VCARD;

public class ShakespeareRDF {

	private static String xsd;

	public static void main(String[] args) {

		Model model = ModelFactory.createDefaultModel();
		
		String cc = "http://www.woman/";
		String tt = "http://www.man/";
		String cd = "http://www.introductionpage/";
		String dd = "http://www.kyahai/";
		String pp = "http://www.city/";
		String qq = "http://www.country/";
		String aa = "http://www.person/";
			
		Property p = model.createProperty( cc + "name" );
		Property q = model.createProperty( cd + "married" );
		Property r = model.createProperty( aa + "name" );
		Property s = model.createProperty( cd + "wrote" );
		Property t = model.createProperty( cd + "livedin" );
		Property u = model.createProperty( dd + "name" );
		Property v = model.createProperty( dd + "isin" );
		Property w = model.createProperty( pp + "name" );
		Property x = model.createProperty( qq + "partof" );
		Property y = model.createProperty( aa + "age" );
		Property z = model.createProperty( qq + "Scotland" );
		Property o = model.createProperty( qq + "England" );
		Property a = model.createProperty( cd + "friend" );
		
		Resource Annehathaway =
		  model.createResource( cc + "AnneHathaway")
				 .addProperty(r, "AnneHathway")
				 .addProperty(RDF.type, "person")
                 .addProperty(y, model.createTypedLiteral(new Integer(30)))

						 
		         .addProperty(q, model.createResource(tt + "Shakespeare")
		        		                     .addProperty(r,"Shakespeare")
		        		                     .addProperty(RDF.type, "person")
				                             .addProperty(s, "Kinglear, The Tempest, Hemryv")
				                             .addProperty(y, model.createTypedLiteral(new Integer(35)))
				                             .addProperty(t, model.createResource(dd + "Startford")
				                            		                      .addProperty(RDF.type, "city")
				        		                                          .addProperty(u, "Startford")
						                                                  .addProperty(v, model.createResource(pp + "England")
						                                                		                         .addProperty(RDF.type, "country")
						                            		                                             .addProperty(w, "England")
						                     		                                                     
						                     		                                                    		 .addProperty(x, "UK"))));
						                     						  
				Resource AnneHathaway =		                     		                                                    		 
						model.createResource(cc+ "AnneHathaway") .addProperty(a, model.createResource(cc + "Happy")
	                                     .addProperty(r,"Happy")
	                                     .addProperty(RDF.type, "person"));
	                                    		
	   Resource Wales =
		   model.createResource(qq +"Wales")
		           .addProperty(RDF.type, "country")
				   .addProperty(w, "Wales")
				   .addProperty(x, "UK")
				   .addProperty(RDFS.subClassOf, model.createResource("http://www.veryCleanCountry/" )
						                            .addProperty( RDF.type, "very clean place"))
						   
				   .addProperty(RDF.type, model.createResource("http://www.developedCountry/") 
						                            .addProperty( RDF.type, "high living standard"));
				 
				   
		   
	   Resource WalesScotland =
			   model.createResource(qq +"Scotland")
			           .addProperty(RDF.type, "country")
					   .addProperty(w, "Scotland")
					   .addProperty(x, "UK");		         

		     
		
		model.setNsPrefix( "cc", cc );
		model.setNsPrefix( "tt", tt ); 
		model.setNsPrefix( "cd", cd ); 
		model.setNsPrefix( "dd", dd ); 
		model.setNsPrefix( "pp", pp ); 
		model.setNsPrefix( "qq", qq ); 
		model.setNsPrefix("aa", aa);
		
		           
	    model.write(System.out, "TURTLE");  

	 
		// TODO Auto-generated method stub


		
	}

}
