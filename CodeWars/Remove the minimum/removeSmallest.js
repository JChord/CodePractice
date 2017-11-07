function removeSmallest(numbers) {
    let min = Math.min(...numbers);
    let index = numbers.indexOf(min)
    if (index > -1) {
        numbers.splice(index, 1);
    }
    return numbers;
}
