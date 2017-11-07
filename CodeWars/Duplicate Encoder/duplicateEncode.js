function duplicateEncode(word){
      word = word.toLowerCase();
      let wordAry = Array.from(word);
      let record = {};

      Array.from(wordAry).forEach((char, index)=>{
        if (record[char]) {
          record[char] = ++record[char];
        } else {
          record[char] = 1;
        }
      });

      let resultAry = wordAry.map(char=>{
        if (record[char]>1) {
          return ")";
        } else {
          return "(";
        }
      });

      return resultAry.join('');

}
