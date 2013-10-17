# it helps to print the time taken in running one program 20 times in a separate file.
# program is for calculating the bacterial target using filter function which is off course more time consuming 

echo "enter the number of times a program will execute"

read value

#!/bin/bash
for((i=0; i< value; i++))
do
  START=$(date +%s)
 # do something
 # start your script work here
  time ./rsparqlmem --service=http://www.ebi.ac.uk/rdf/services/chembl/sparql --query=/Users/ashwini/Documents/EBIDatabase/query/bacterialTargetData_1.rq 

  # your logic ends here
  END=$(date +%s)
  DIFF=$(( $END - $START ))

  echo "It took $DIFF seconds" | grep 'seconds' >> time.txt

  
done

awk '{print $3}' time.txt >> time1.txt