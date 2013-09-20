package trial;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.VCARD;

public class ShakespeareRDF {

	public static void main(String[] args) {

		Model model = ModelFactory.createDefaultModel();
		
		String cc = "http://www.woman/";
		String tt = "http://www.man/";
		String cd = "http://www.introductionpage/";
		String dd = "http://www.kyahai/";
		String pp = "http://www.city/";
		String qq = "http://www.country/";
		Property p = model.createProperty( cc + "name" );
		Property q = model.createProperty( cd + "married" );
		Property r = model.createProperty( tt + "name" );
		Property s = model.createProperty( cd + "wrote" );
		Property t = model.createProperty( cd + "livedin" );
		Property u = model.createProperty( dd + "name" );
		Property v = model.createProperty( dd + "isin" );
		Property w = model.createProperty( pp + "name" );
		Property x = model.createProperty( qq + "partof" );
		Resource Annehathaway 
		  = model.createResource( cc + "AnneHathaway")
				 .addProperty(p, "AnneHathway")
		         .addProperty(q, model.createResource(tt + "Shakespeare")
		        		                     .addProperty(r,"Shakespeare")
				                             .addProperty(s, "Kinglear, The Tempest, Hemryv")
				                             .addProperty(t, model.createResource(dd + "Startford")
				        		                                          .addProperty(u, "Startford")
						                                                  .addProperty(v, model.createResource(pp + "England")
						                            		                                             .addProperty(w, "England")
						                     		                                                     .addProperty(x,"UK"))));
		         

		     
		
		model.setNsPrefix( "cc", cc );
		model.setNsPrefix( "tt", tt ); 
		model.setNsPrefix( "cd", cd ); 
		model.setNsPrefix( "dd", dd ); 
		model.setNsPrefix( "pp", pp ); 
		model.setNsPrefix( "qq", qq ); 
		
		           
	    model.write(System.out, "TURTLE");  

	 
		// TODO Auto-generated method stub


		
	}

}
