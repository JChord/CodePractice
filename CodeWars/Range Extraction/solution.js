function solution(list){
  let result = [];
  for(let i=0; i<list.length;) {
    result.push(list[i]);
    let j=i+1;
    for(; j<list.length; j++) {
      if (list[j-1]+1 != list[j]) {
        break;
      }
    }
    j--;
    if (i == j) {
      result.push(",");
    } else if (i+1 == j) {
      result.push(",", list[j], ",");
    } else {
      result.push("-", list[j], ",");
    }
    i = j+1;
  }
  
  result.pop();
  return result.join("");
}