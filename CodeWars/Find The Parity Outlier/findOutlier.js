function findOutlier(integers){
  let result = integers.filter(item=>item%2)
  if (result.length == 1) {
    return result.pop();
  }
  return integers.filter(item=>result.indexOf(item) == -1).pop();
}