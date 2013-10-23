# it helps to print the time taken in running two programs as many times you  want in a separate file.
# program is for calculating the bacterial target without filter function which is off course less time consuming 
# and another is adding one more extra constant text column ("Bacteria") .


#!/bin/bash

echo "enter the number of times a program will execute"

read value

for((i=0; i<value; i++))
do
  START=$(date +%s)
 # do something
 # start your script work here
  time ./rsparqlmem --service=http://www.ebi.ac.uk/rdf/services/chembl/sparql --query=/Users/ashwini/Documents/EBIDatabase/query/bacterialTargetData.rq 

  # your logic ends here
  END=$(date +%s)
  DIFF=$(( $END - $START ))

  echo "It took $DIFF seconds" | grep 'seconds' >> time_1.txt

  
done

awk '{print $3}' time_1.txt > time2.txt


for((i=0; i<value; i++))
do
  START=$(date +%s)
 # do something
 # start your script work here
  time ./rsparqlmem --service=http://www.ebi.ac.uk/rdf/services/chembl/sparql --query=/Users/ashwini/Documents/EBIDatabase/query/bacterialTargetData_2.rq 

  # your logic ends here
  END=$(date +%s)
  DIFF=$(( $END - $START ))

  echo "It took $DIFF seconds" | grep 'seconds' >> time_2.txt

  
done

awk '{print $3}' time_2.txt > time3.txt
