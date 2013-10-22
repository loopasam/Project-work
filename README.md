 stuffs related to modeling are here:
- [ Java programing for making model using Eclipse]( https://github.com/Ashwini607/Project-work/blob/master/Documents/workspace/trial/src/trial)  
- [ Result of models in different RDF serialisation](https://github.com/Ashwini607/Project-work/blob/master/Documents)

---
 SPARQL query for metadata:
 
- [Able to retrieve all available triples from triple store](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/metadataQuery1.rq)
- [Able to retrieve all types from triple store](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/metadataQuery2.rq)
- [Able to retrievie Subclassof related data from triple store](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/metadataQuery3.rq)
- [Able to retrive all labeled data from triple store](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/metadataQuery4.rq)

---

I have kept the chemblDatabase queries in a folder /Documents/EBIDatabase/Query. we can directlly run the query using 
terminal but for running on sparql-endpoint of database, remove the comment from query.  

Some of the Queries related to ChEMBL sparql endpoint are mention below: 

- [Retrieving chembl molecule on the basis of trade name](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/moleculeSourceForTradeName.rq)
- [Retrieving the molecular formula of molecule having chembl-id "CHEMBL192"](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/molFormulaof192Molecule.rq)
- [Retrieving rotational bond of chembl molecule having chembl-id  "CHEMBL192"](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/rotbonOf192Molecule.rq)
- [Retrieving trade name of CHEMBL192 molecule](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/tradeNameOf192Molecule.rq)
- [Retrieving the chembl molecules sources having molecular formula is combination of “C22H30N6O4S”](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/sourceForMolecularFormula.rq)
- [Retrieving substance types having target type "cell-line"](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/substanceTypeToCell-line.rq)
- [Retrieving target types available in chembl's rdf triple store](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/targetType.rq)
- [Retrieving compound activity details for all target](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/compoundActDetails.rq)
- [Retrieving all the bioactive chembl molecules for bacterial target](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/bacterialTargetData.rq)
- [Retrieving chembl molecules targeting “Firefly Luciferase”](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/compoundToFirLuciferase.rq)
- [Retrieving target_chembl-id, target_name, target_type, uniprot_reference and sequences for proteins target](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/compoundDetailsForProteinTar.rq)
- [Retrieving chembl molecules activity details for all targets containing a protein of interest, and protein of interest is human M2 muscarinic receptor (P08172)](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/P08172CompActAssTarDet.rq)
- [Retrieving chembl molecules activity details for a target, and target is Human PDE5 (CHEMBL1827)](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/detailsForTarget.rq)
- [Retrieving chembl molecules activity details for all target](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/compoundActDetails.rq)
- [Retrieving chembl molecules chembl-ID, activity standard type, activity standard unit having activity standard type "IC50" and standard unit "nM" using Filter](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/IC50Compounds.rq)
- [Retrieving chembl molecules chembl-ID having activity standard type "IC50" and activity standard unit "nM"](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/IC50Compounds_1.rq)
- [Retrieving chembl molecules chembl-ID having activity standard type "IC50" and activity standard unit "nM" having extra columns with variable name that contain constant text about standard type and standard unit](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/IC50Compounds_2.rq)
- [Retrieving chembl molecules chembl-ID having activity standard type "IC50" and activity standard unit "nM" having extra columns that contains constant text about standard type and standard unit](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/IC50Compounds_3.rq)
- [Retrieving chembl molecules chembl-ID, activity standard type, activity standard unit having activity standard type "IC50" and standard unit "nM" using Filter but two conditions in a single filter](https://github.com/Ashwini607/Project-work/blob/master/Documents/EBIDatabase/query/IC50Compounds_4.rq)


---

Shell Script:

- [Most of them are for analysing the running time of sparql query to make more efficient code](https://github.com/Ashwini607/Project-work/blob/master/Documents/bin)
