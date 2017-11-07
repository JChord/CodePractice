function highAndLow(numbers) {
    let sortAry = numbers.split(" ").sort((a,b)=>{
        return b-a;
    });
    return `${sortAry[0]} ${sortAry.pop()}`
}
