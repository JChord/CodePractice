function array_diff(a, b) {
  return a.filter(item=>{
      return !b.includes(item);
  });
}
