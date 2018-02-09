# Loc-n-Load -- MatrixFinder
Aaron Li
<br>
Jackie Li
<br>
George Liang
# Spreadsheets w/ Graph:
https://goo.gl/fXdtpB

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


### Data Analysis
Although our data often fluctuate, this is to be expected. Our algorithm always revolve around a linear slope, and because 
of this the data follows a linear succession. Our search method works, meaning it is O(n) time.