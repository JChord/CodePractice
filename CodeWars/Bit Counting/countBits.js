var countBits = function(n) {
  return Array.from((n >>> 0).toString(2)).reduce((sum, item, index)=>{
    if (item === "1") {
      sum++;
    }
    return sum;
  	}, 0);
}