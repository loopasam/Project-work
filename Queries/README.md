# Introduction

This repository contains a list of queries illustrating how to use the ChEMBL SPARQL enpoint. If you are new to the
semantic web, you can [follow a tutorial]() first. If you have some knowledge about SQL and relational database already, the transition to SPARQL should be easy, you can directly get started!

**Location of the SPARQL endpoint:** http://www.ebi.ac.uk/rdf/services/chembl/sparql

**Documentation about the endpoint:** http://www.ebi.ac.uk/rdf/documentation/chembl

**Contact:** http://www.ebi.ac.uk/rdf/chembl-contact


# Examples of SPARQL queries over the ChEMBL end-point

I have kept the ChEMBL triple store queries in a folder /Documents/git/ChEMBL-RDF-queries. We can directly run the query, using terminal but for running on sparql-endpoint of ChEMBL triple store, remove the comment from the query. 

Note: Try to avoid the use of filter function in SPARQL query, because it takes more time for running.

ChEMBL SPARQL-endpoint is available at [http://www.ebi.ac.uk/rdf/services/ChEMBL/sparql?](http://www.ebi.ac.uk/rdf/services/ChEMBL/sparql?)
 
  A. Simple (Information related to just the molecule): 
  
1. [Retrieve ChEMBL molecule on the basis of trade name](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/moleculeSourceForTradeName.rq)
- [Retrieve the molecular formula of ChEMBL molecule having ChEMBL-id "CHEMBL192"](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/molFormulaof192Molecule.rq)
- [Retrieve rotational bond of ChEMBL molecule having ChEMBL-id  "CHEMBL192"](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/rotbonOf192Molecule.rq)
- [Retrieve trade name of CHEMBL192 molecule](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/tradeNameOf192Molecule.rq)
- [Retrieve the ChEMBL molecules URI having molecular formula is combination of “C22H30N6O4S”](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/sourceForMolecularFormula.rq)
  
B. Moderate (Need to know more about schema to reach the specific location):

1. [Retrieve substance types having target type "cell-line"](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/substanceTypeToCell-line.rq)
- [Retrieve target types available in ChEMBL rdf triple store](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/targetType.rq)
- [Retrieve compound activity details for all target](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/compoundActDetails.rq)
- [Retrieve all the bioactive ChEMBL molecules for bacterial target](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/bacterialTargetData.rq)
- [Retrieve ChEMBL molecules targeting “Firefly Luciferase”](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/compoundToFirLuciferase.rq)
- [Retrieve target details, uniprot_reference and sequences for proteins target](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/compoundDetailsForProteinTar.rq)
- [Retrieve ChEMBL molecules activity details for all targets containing a protein of interest, and protein of interest is human M2 muscarinic receptor (P08172)](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/P08172CompActAssTarDet.rq)
- [Retrieve ChEMBL molecules activity details for a target, and target is Human PDE5 (CHEMBL1827)](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/detailsForTarget.rq)
- [Retrieve ChEMBL molecules activity details for all target](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/compoundActDetails.rq)

In some of the queries, I have used the filter function even is not needed but just to make extra column which give satisfaction for correct output. I helps If you are new for triple store.
For example, I am interested in ChEMBL-id of molecules having activity standard type "IC50" then we can put "IC50" value at standard type but to make a extra column to show that I have selected the correct standard type, can use filter. We can add standard type as a
new column having constant text "IC50" without filter. These differences make change in running time of query. To analyse this kind of changes, I have made query for about same problem in different way like last 5 ChEMBL queries.  

- [Retrieve ChEMBL molecules ChEMBL-ID, activity standard type, activity standard unit having activity standard type "IC50" and standard unit "nM" using filter](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/IC50Compounds.rq)
- [Retrieve ChEMBL molecules ChEMBL-ID having activity standard type "IC50" and activity standard unit "nM"](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/IC50Compounds_1.rq)
- [Retrieve ChEMBL molecules ChEMBL-ID having activity standard type "IC50" and activity standard unit "nM" having extra columns with variable name that contain constant text about standard type and standard unit](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/IC50Compounds_2.rq)
- [Retrieve ChEMBL molecules ChEMBL-ID having activity standard type "IC50" and activity standard unit "nM" having extra columns that contains constant text about standard type and standard unit](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/IC50Compounds_3.rq)
- [Retrieve ChEMBL molecules ChEMBL-ID, activity standard type, activity standard unit having activity standard type "IC50" and standard unit "nM" using filter but two conditions in a single filter](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/ChEMBL-RDF-queries/IC50Compounds_4.rq)


# SPARQL query for metadata

 If you are new in querying RDF triple store then you can try these queries, because these work on any SPARQL endpoint. It will help to get familiar with contains of triple store.  
 
- [Retrieve all available triples from triple store](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/metadataQuery1.rq)
- [Retrieve all types from triple store](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/metadataQuery2.rq)
- [Retrieve triples which is Subclassof other triple from triple store](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/metadataQuery3.rq)
- [Retrieve all labeled triple from triple store](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/metadataQuery4.rq)


# Shell Script

 Timing in running query may be different if you run a same query again and again, so I have made the script to run the same query many times and get the running time in a separate file for analysis. 
Same problem but different query like using filter, not using filter, adding extra text column to output has kept in a single shell script but gives different time calculating file for each query. It can help to make efficient code. 

rsparql is a execution file for SPARQL query present in bin directory of Apache-Jena Java framework. We changed it for need of some more space to run the query, and the name of new execution file is [rsparqlmem](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/bin/rsparqlmem). I have used this new file for running shell script file.
- [Most of them are for analysing the running time of SPARQL query to make more efficient code](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/bin)
  
For example, Bacteria target analysis: used filter to select organism, not filter but kept name at the place of organism name and without filter but added just a extra fixed text column to show organism is Bacteria.
[Result](https://github.com/Ashwini607/Project-work/blob/master/Documents/git/bin/runTime.png)
