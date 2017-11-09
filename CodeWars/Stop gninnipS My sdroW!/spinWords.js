function spinWords(words){
  return words.split(" ").map(word=>{
  	if (word.length >= 5) {
    	return word.split("").reverse().join("");
    }
    return word;
  }).join(" ");
}