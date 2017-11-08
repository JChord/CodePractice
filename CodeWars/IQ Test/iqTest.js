function iqTest(numbers){
    numbers = numbers.split(" ");
    let even = numbers.filter(number=>number % 2 == 0);
    let odd = numbers.filter(number=>number % 2 != 0);
    let value =  even.length == 1 ? even.pop() : odd.pop();
    return numbers.indexOf(value) + 1;
}
