function array_diff_very_fast(a, b) {

    let count = {};

    b.forEach(item=>{
        count[item] = true;
    });

    let result = [];
    for(let i=0,len=a.length; i<len; i++) {
      let val = a[i];
      if (!count[val]) {
        result.push(val);
      }
    }

    return result;
}
