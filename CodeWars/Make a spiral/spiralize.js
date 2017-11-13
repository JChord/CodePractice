var spiralize = function(size) {
	let result = [];
  	for(let i=0; i<size; i++) {
  		let temp = [];
  		for(let j=0; j<size; j++) {
  			temp.push(0);
  		}
  		result.push(temp);
  	}

  	console.log(result);


}

var snail = function(array) {
	if (array.length == 0) {
		return [];
	}
  	n = array[0].length;

  	if (n === 0) {
    	return [];
  	}

  	if (n === 1) {
  		return array[0];
  	}

  	let result = [];
  
  	for (let i=0; i<n; i++) {
  		result.push(array[0][i]);
  	}
  	array.splice(0, 1);

  	for(let i=0; i<array.length; i++) {
  		result.push(array[i][n-1]);
      	array[i].splice(n-1, 1);
  	}

  	let bellow = array.pop();
  	for(let i=bellow.length-1; i>=0; i--) {
  		result.push(bellow[i]);
  	}

  	for(let i=array.length-1; i>=0; i--) {
		  result.push(array[i][0]);
		  array[i].splice(0, 1);
  	}

  	return result.concat(snail(array));
}

spiralize(5);