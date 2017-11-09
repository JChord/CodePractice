function deleteNth(arr,n){
  const store = {};
  arr.forEach(num=>{
    store[num] = n;
  });
  const result = [];
  arr.forEach(num=>{
    if (store[num] > 0) {
      result.push(num);
      store[num] = --store[num];
    }
  });
  return result;
}