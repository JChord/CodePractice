function sortArray(array) {
	const evenObj = {};
	array = array.filter((num,index)=>{
       if (num % 2 != 0) {
    		return true;
    	} else {
        	evenObj[index] = num;
        	return false;
    	};
    }).sort((a,b)=>a-b);
    for (let idx in evenObj) {
		array.splice(idx, 0, evenObj[idx]);
    }
    return array;
}