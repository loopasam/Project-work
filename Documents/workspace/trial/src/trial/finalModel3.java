package trial;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.RDF;
import com.hp.hpl.jena.vocabulary.RDFS;
import com.hp.hpl.jena.vocabulary.VCARD;

public class finalModel3 {

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
		String bb = "http://www.veryCleanCountry/";
		String ee = "http://www.areCountry/";
		String ff = "http://www.developedCountry/";
		String gg = "http://www.person/";
		
			
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
				 .addProperty(RDF.type, model.createResource(gg))
                 .addProperty(y, model.createTypedLiteral(new Integer(30)))

						 
		         .addProperty(q, model.createResource(tt + "Shakespeare")
		        		                     .addProperty(r,"Shakespeare")
		        		                     .addProperty(RDF.type, model.createResource(gg))
				                             .addProperty(s, "Kinglear, The Tempest, Hemryv")
				                             .addProperty(y, model.createTypedLiteral(new Integer(35)))
				                             .addProperty(t, model.createResource(dd + "Startford")
				                            		                      .addProperty(RDF.type, model.createResource(pp))
				        		                                          .addProperty(u, "Startford")
						                                                  .addProperty(v, model.createResource(pp + "England")
						                                                		                         .addProperty(RDF.type, model.createResource(ee))
						                            		                                             .addProperty(w, "England")
						                     		                                                     
						                     		                                                    		 .addProperty(x, "UK"))));
						                     						  
				Resource AnneHathaway =		                     		                                                    		 
						model.createResource(cc+ "AnneHathaway") .addProperty(a, model.createResource(cc + "Happy")
	                                     .addProperty(r,"Happy")
	                                     .addProperty(RDF.type, model.createResource(gg)));
	                                    		
	   Resource Wales =
		   model.createResource(qq +"Wales")
		           .addProperty(RDF.type, model.createResource(ee))
				   .addProperty(w, "Wales")
				   .addProperty(x, "UK")	   
				   .addProperty(RDF.type, model.createResource(ff));
				 
				   
		   
	   Resource WalesScotland =
			   model.createResource(qq +"Scotland")
			           .addProperty(RDF.type, model.createResource(ee))
					   .addProperty(w, "Scotland")
					   .addProperty(x, "UK");		         

		     
		
		model.setNsPrefix( "cc", cc );
		model.setNsPrefix( "tt", tt ); 
		model.setNsPrefix( "cd", cd ); 
		model.setNsPrefix( "dd", dd ); 
		model.setNsPrefix( "pp", pp ); 
		model.setNsPrefix( "qq", qq ); 
		model.setNsPrefix("aa", aa);
		model.setNsPrefix("bb", bb);
		model.setNsPrefix("ee", ee);
		model.setNsPrefix("ff", ff);
		model.setNsPrefix("gg", gg);
		
		           
	    model.write(System.out, "RDF/XML");  

	 
		// TODO Auto-generated method stub


		
	}	}