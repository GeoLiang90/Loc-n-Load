# Loc-n-Load -- MatrixFinder
Aaron Li
<br>
Jackie Li
<br>
George Liang
# Spreadsheets w/ Graph:
https://goo.gl/fXdtpB
![](graph/MatrixFinderGraph.PNG)

### Hypothesis
Our code operates through the list once, checking each item in our matrix. As long as the index has not been discovered, 
and the value we are searching for is valid, we continue to loop through. If we hit a boundary (the end of the row), we can
just go down the matrix and analyze backwards.

### Background
Our inspiration for this algorithm came from the telescope problem from the final. In the problem, we were asked to be iterate
through a matrix in a ladder-like formation. We are incorporating the same algorithm, where we serpentine through the matrix, 
searching for our desired value. 

### Experiment Methodology
First, check if the desired value is even possibly within the array. This is
done by checking if the desired value is larger than the smallest value of the
array (0, 0), and smaller than the largest value of the array (size - 1, size - 1),
and if it isn't within those parameters, it is not found.

Next, the search begins at the element at the top right, and if that element
is the desired value, its coordinates are returned. Otherwise, the following
decisions take place in the while loop:
* if value at index is smaller than desired value: move down a row
* if value at index is larger than desired value: move left a column

Based on small tests, we know our algorithm works. We generated matrices increasing by 20 elements each time 
that had 7000 to 13000 elements  We measured the runtime of searching for the bottom left element of each matrix
1000 times by using a for loop. We used the for loop because of its O(1) runtime which won't cost us too much to run
the same call 1000 times. Using the saved runtime for 1000 calls to our search() method, we divided it by 1000 to find
the average time of a search of the bottom left element of one matrix. This was repeated for each matrix incremented by
20 elements. 


### Data Analysis
Although our data often fluctuate, this was expected because hidden background processes slow down Java's runtime. Based on the line of best fit drawn in 
our Google Spreadsheet (which is based on our csv file), our algorithm always revolves around a linear slope, which means that our algorithm always 
follows a linear runtime. Therefore, we can conclude that our algorithm runs in O(n) or linear time. 
