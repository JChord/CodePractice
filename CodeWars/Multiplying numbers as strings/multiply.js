function multiply(a, b) {
    a = Array.from(a.replace(/^0+(?=\d)/, ''), char=>{
        return parseInt(char,10);
    });

    b = Array.from(b.replace(/^0+(?=\d)/, ''), char=>{
        return parseInt(char,10);
    });

    let result = [];
    for (let i=0; i<a.length; i++) {
        for (let j=0; j<b.length; j++) {
            if (result[i+j]) {
                result[i+j] += a[i] * b[j];
            } else {
                result[i+j] = a[i] * b[j];
            }
        }
    }

    for(let i=result.length-1; i>=1; i--) {
        if(result[i] >= 10) {
            if (result[i-1]) {
                result[i-1] += Math.floor(result[i]/10);

            } else {
                result[i-1] = Math.floor(result[i]/10);
            }
            result[i] = result[i]%10;


        }
    }

    if (result[0] === 0) {
        return '0';
    }
    return result.join('');
}
