function likes(names) {
  let appendStr = "";
  let length = names.length
  if (length === 0 || length === 1) {
    appendStr = " likes this";
  } else {
    appendStr = " like this";
  }
  
  if (length === 0) {
  	names = "no one";
  } else if (length === 1) {
  	names = names[0];
  } else if (length === 2) {
  	names = names[0] + " and " + names[1];
  } else if (length === 3) {
  	names = names[0] + ", " + names[1] + " and " + names[2];
  } else {
  	names = names[0] + ", " + names[1] + " and " + (length - 2) + " others";
  }

  return names + appendStr;
}