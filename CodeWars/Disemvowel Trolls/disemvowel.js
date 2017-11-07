function disemvowel(str) {
    let vowels = ['a','o','e','i','u']
    return Array.from(str).filter(char=>!vowels.includes(char.toLowerCase())).join("");
}
