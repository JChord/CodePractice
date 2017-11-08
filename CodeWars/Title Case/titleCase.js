function titleCase(title, minorWords) {
	if (title.length > 0) {
    	return title.split(" ").map((word, index)=>{
    	   word = word.toLowerCase();
         word = word.charAt(0).toUpperCase() + word.slice(1);
		
         if (index > 0 && minorWords) {
           let ary = minorWords.toLowerCase().split(" ");
           if (ary.includes(word.toLowerCase())) {
             word = word.toLowerCase();
            }
          }
          return word;
    }).join(" ");
  } else {
  	return title;
  }
}
