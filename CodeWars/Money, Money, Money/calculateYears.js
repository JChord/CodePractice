function calculateYears(principal, interest, tax, desired) {
    if (desired <= principal) {
      return 0;
    }
    var year = 0;
    do {
      let increse = principal * interest;
      principal = principal + principal * interest * (1 - tax) ;
      year++;
    } while (principal < desired);
    
    return year;
}