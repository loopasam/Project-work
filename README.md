# stuffs related to modeling are here

I have used Eclipse Java development tools and library of Apache Jena to make rdf model in different serialisation such as N-triples, Turtle, RDF/XML, and N3.

To know more about Apache Jena just [click](http://jena.apache.org)

Complete guide for beginner to start jena project in Eclipse just [click](http://www.iandickinson.me.uk/articles/jena-eclipse-helloworld/)   

- [ Java programing for making model using Eclipse]( https://github.com/Ashwini607/Project-work/blob/master/Documents/workspace/trial/src/trial)  
- [ Result of models in different RDF serialisation](https://github.com/Ashwini607/Project-work/blob/master/Documents)

---
# SPARQL query for metadata

if you are new for rdf triple store then you can try these queries, because these work on any triple store. It will help to get familiar with containts of triple store.  
 
- [Retrieve all available triples from triple store](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/metadataQuery1.rq)
- [Retrieve all types from triple store](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/metadataQuery2.rq)
- [Retrievie Subclassof related data from triple store](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/metadataQuery3.rq)
- [Retrive all labeled data from triple store](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/metadataQuery4.rq)

---
# CHEMBL SPARQL query

I have kept the chembl triple store queries in a folder /Documents/EBIDatabase/Query. We can directlly run the query using 
terminal but for running on sparql-endpoint of chembl triple store, remove the comment from the query. 

chembl sparql-endpoint is available at -[click](http://www.ebi.ac.uk/rdf/services/chembl/sparql?)

Some of the Queries related to ChEMBL sparql endpoint are mention below: 

- [Retrieve chembl molecule on the basis of trade name](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/moleculeSourceForTradeName.rq)
- [Retrieve the molecular formula of chembl molecule having chembl-id "CHEMBL192"](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/molFormulaof192Molecule.rq)
- [Retrieve rotational bond of chembl molecule having chembl-id  "CHEMBL192"](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/rotbonOf192Molecule.rq)
- [Retrieve trade name of CHEMBL192 molecule](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/tradeNameOf192Molecule.rq)
- [Retrieve the chembl molecules sources having molecular formula is combination of “C22H30N6O4S”](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/sourceForMolecularFormula.rq)
- [Retrieve substance types having target type "cell-line"](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/substanceTypeToCell-line.rq)
- [Retrieve target types available in chembl rdf triple store](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/targetType.rq)
- [Retrieve compound activity details for all target](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/compoundActDetails.rq)
- [Retrieve all the bioactive chembl molecules for bacterial target](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/bacterialTargetData.rq)
- [Retrieve chembl molecules targeting “Firefly Luciferase”](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/compoundToFirLuciferase.rq)
- [Retrieve target_chembl-id, target_name, target_type, uniprot_reference and sequences for proteins target](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/compoundDetailsForProteinTar.rq)
- [Retrieve chembl molecules activity details for all targets containing a protein of interest, and protein of interest is human M2 muscarinic receptor (P08172)](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/P08172CompActAssTarDet.rq)
- [Retrieve chembl molecules activity details for a target, and target is Human PDE5 (CHEMBL1827)](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/detailsForTarget.rq)
- [Retrieve chembl molecules activity details for all target](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/compoundActDetails.rq)
- [Retrieve chembl molecules chembl-ID, activity standard type, activity standard unit having activity standard type "IC50" and standard unit "nM" using Filter](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/IC50Compounds.rq)
- [Retrieve chembl molecules chembl-ID having activity standard type "IC50" and activity standard unit "nM"](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/IC50Compounds_1.rq)
- [Retrieve chembl molecules chembl-ID having activity standard type "IC50" and activity standard unit "nM" having extra columns with variable name that contain constant text about standard type and standard unit](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/IC50Compounds_2.rq)
- [Retrieve chembl molecules chembl-ID having activity standard type "IC50" and activity standard unit "nM" having extra columns that contains constant text about standard type and standard unit](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/IC50Compounds_3.rq)
- [Retrieve chembl molecules chembl-ID, activity standard type, activity standard unit having activity standard type "IC50" and standard unit "nM" using Filter but two conditions in a single filter](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/IC50Compounds_4.rq)


---

# Shell Script

Timimg for running query may be different if you run it again and agin, so I have made the script to run the same query many times and get the running time in separate files to analyse it. 
Same query but with modification like using filter or not using filter, adding extra text column to output have kept in a single script that cah help to make efficient code. 

- [Most of them are for analysing the running time of sparql query to make more efficient code](https://github.com/Ashwini607/Project-work/blob/master/Documents/bin)
