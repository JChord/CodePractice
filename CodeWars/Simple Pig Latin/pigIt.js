function pigIt(str) {
    return str.split(" ").map(item=>{
        return item.slice(1) + item.slice(0,1) + "ay";
    }).join(" ");
}
