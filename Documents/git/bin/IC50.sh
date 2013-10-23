# here I have work for a single problem but output is in different format.
#!/bin/bash

echo "enter the number of times a program will execute"

read value
echo "1st query"
# 1st query is about # retrieve the molecule chembl-ID having activity standard type "IC50"
# and activity standered unit "nM"

for((i=0; i<value ;i++))
do
  START=$(date +%s)
 # do something
 # start your script work here
  time ./rsparqlmem --service=http://www.ebi.ac.uk/rdf/services/chembl/sparql --query=/Users/ashwini/Documents/EBIDatabase/query/IC50Compounds.rq 

  # your logic ends here
  END=$(date +%s)
  DIFF=$(( $END - $START ))

  echo "It took $DIFF seconds" | grep 'seconds' >> IC50Compounds.txt

  
done

awk '{print $3}' IC50Compounds.txt >> IC50Compounds1.txt

echo "2nd query"
# 2nd query is about# retrieve the molecule chembl-ID having activity standard type "IC50"
# and activity standered unit "nM". We can do using filter for "IC50" and "nM"
# but that will be time consuming for running query.

for((i=0; i<value; i++))
do
  START=$(date +%s)
 # do something
 # start your script work here
  time ./rsparqlmem --service=http://www.ebi.ac.uk/rdf/services/chembl/sparql --query=/Users/ashwini/Documents/EBIDatabase/query/IC50Compounds_1.rq 

  # your logic ends here
  END=$(date +%s)
  DIFF=$(( $END - $START ))

  echo "It took $DIFF seconds" | grep 'seconds' >> IC50Compounds_1.txt

  
done

awk '{print $3}' IC50Compounds_1.txt >> IC50Compounds_11.txt

echo "3rd query"
# 3rd query is about#Retrieve all the compounds having IC50 bioactivity value in nM.
# have not used filter but still able to print a column having standered type and
# standered unit with variable column name.

for((i=0; i<value; i++))
do
  START=$(date +%s)
 # do something
 # start your script work here
  time ./rsparqlmem --service=http://www.ebi.ac.uk/rdf/services/chembl/sparql --query=/Users/ashwini/Documents/EBIDatabase/query/IC50Compounds_2.rq 

  # your logic ends here
  END=$(date +%s)
  DIFF=$(( $END - $START ))

  echo "It took $DIFF seconds" | grep 'seconds' >> IC50Compounds_2.txt

  
done

awk '{print $3}' IC50Compounds_2.txt >> IC50Compounds_21.txt

echo "4th query"
# 4th query is about# retrieve the molecule chembl-ID having activity standard type "IC50"
# and activity standered unit "nM". Here able to produce fixed text column for 
# standered type and standered unit.

for((i=0; i<value; i++))
do
  START=$(date +%s)
 # do something
 # start your script work here
  time ./rsparqlmem --service=http://www.ebi.ac.uk/rdf/services/chembl/sparql --query=/Users/ashwini/Documents/EBIDatabase/query/IC50Compounds_3.rq 

  # your logic ends here
  END=$(date +%s)
  DIFF=$(( $END - $START ))

  echo "It took $DIFF seconds" | grep 'seconds' >> IC50Compounds_3.txt

  
done

awk '{print $3}' IC50Compounds_3.txt >> IC50Compounds_31.txt

echo "5th query"
# 5th query is about#Retrieve all the compounds having IC50 bioactivity value in nM.
# using filter to select specific pattern matching and print the columns that contain that
# value. Filter is not required for our result, and time taken by this query is more. 
# Filter can be use in a single line or in separate line.

for((i=0; i<value; i++))
do
  START=$(date +%s)
 # do something
 # start your script work here
  time ./rsparqlmem --service=http://www.ebi.ac.uk/rdf/services/chembl/sparql --query=/Users/ashwini/Documents/EBIDatabase/query/IC50Compounds_4.rq 

  # your logic ends here
  END=$(date +%s)
  DIFF=$(( $END - $START ))

  echo "It took $DIFF seconds" | grep 'seconds' >> IC50Compounds_4.txt

  
done

awk '{print $3}' IC50Compounds_4.txt >> IC50Compounds_41.txt