function orderWeight(strng) {
    return strng.split(" ").sort((a,b)=>{
      let weight1 = Array.from(a).reduce((sum,item,index)=>{
        return sum + parseInt(item);
      }, 0);
      let weight2 = Array.from(b).reduce((sum,item,index)=>{
        return sum + parseInt(item);
      }, 0);
      if (weight1 === weight2) {
        return a.localeCompare(b);
      } 
      return weight1 - weight2;
    }).join(" ");
}