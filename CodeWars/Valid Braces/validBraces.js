function validBraces(braces){
    let stack = [];
    let match = {"}": "{", "]":"[", ")":"("};

    Array.from(braces).forEach(item=>{
        if (item == "(" || item == "[" || item == "{") {
            stack.push(item);
        } else {
            if (stack.length > 0 && stack[stack.length - 1] == match[item]) {
                stack.pop();
            } else {
                stack.push(item);
            }
        }
    }
    return stack.length == 0;
}
