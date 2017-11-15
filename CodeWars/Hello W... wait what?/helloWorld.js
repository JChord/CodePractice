var helloWorld = function () {
    let splitStr = String();
    let mathStr = Math.toString().split(splitStr);
    mathStr.pop();
    let h = mathStr.pop().toUpperCase();
    let undefinedStr = (String(undefined)).split(splitStr);
    let d = undefinedStr.pop();
    let e = undefinedStr.pop();
    let l = (String(null)).split(splitStr).pop();
    mathStr.shift();
    let o = mathStr.shift();
    mathStr.shift();
    mathStr.shift();
    mathStr.shift();
    mathStr.shift();
    mathStr.shift();
    let space = mathStr.shift();
    let w = WeakSet.name.split(splitStr).shift();
    let arrayStr = Array.name.split(splitStr);
    arrayStr.shift();
    let r = arrayStr.shift();

    let spaceCode = space.charCodeAt();
    let excl = String.fromCharCode((++spaceCode));
    return h + e + l + l + o + space + w + o + r + l + d + excl;
}
