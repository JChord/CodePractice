function dirReduc(arr){
  let dir = [];
  let match = {
    "NORTH" : -1, "SOUTH" : 1, "EAST":-2, "WEST":2
  };
  arr.forEach(item=>{
    let pre = dir.pop();
    if (pre) {
      if ((match[item] + match[pre]) != 0) {
        dir.push(pre,item);
      }
    } else {
      dir.push(item);
    }
  });
  
  return dir;
}
