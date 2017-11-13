function validParentheses(parens) {
    let stack = [];

    Array.from(parens).forEach(item=>{
        if (item == "(") {
            stack.push(item);
        } else if (item == ")") {
            if (stack.length > 0 && stack[stack.length - 1] == "(") {
                stack.pop();
            } else {
                stack.push(item);
            }
        }
    });

    return stack.length == 0;
}
