function solution(input, markers){
  return input.split("\n").map(item=>{
  	let first = -1;
  	markers.forEach(mark=>{
    	let findIdx = item.indexOf(mark);
        if (findIdx >=0) {
        	if (first === -1) {
            	first = findIdx;
        	} else {
            first = Math.min(first, findIdx);
        	}
        }
    });
    if (first > -1) {
    	item = item.substr(0, first);
    }
    return item.trim();
  }).join("\n");
}