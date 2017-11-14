function middlePermutation(s) {
    s = Array.from(s).sort();
    if (s.length % 2 == 0) {
        let middleChar = s.length / 2 - 1;

        let remainder = s.slice(0, middleChar).concat(s.slice(middleChar+1));
        return s[middleChar] + remainder.reverse().join("");
    } else {
        let middleChar = Math.round(s.length / 2) - 1;

        let remainder = s.slice(0, middleChar-1).concat(s.slice(middleChar+1));
        return s[middleChar] +s[middleChar-1]+ remainder.reverse().join("");
    }
}
