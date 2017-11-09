var palindromeChainLength = function(n) {
  let step = 0;
  let reverse = Array.from(String(n)).reverse().join("");
  while (n != reverse) {
    n = n+parseInt(reverse);
    reverse = Array.from(String(n)).reverse().join("");
    step++;
  }
  return step;
};