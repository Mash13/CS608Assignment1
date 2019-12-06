# CS608Assignment1
Write a program to determine whether the given series of numbers is convergent or divergent. 
In case of convergent series, write the approximate sum value.

This is what you do:
Using a loop, calculate the sum of the given series for the first 1000, 2000, 3000, 4000,
5000, 6000, 7000, 8000, 9000, 10,000 terms.
As we discussed in my notes, if the sum values do not increase significantly, it is likely the
series is convergent. Incorporate this idea in your program: If the difference between
successive sum values is less than, say . 0001, then conclude, "The given series is likely
convergent." Otherwise divergent.

Series for 1A:
1 + 1/(2^2) + 1/(3^2) + 1/(4^2) + ...

Series for 1B:
1 - 1/3 + 1/5 - 1/7 + 1/9 + ...
When you print the final value (the sum), multiply it by 4 and print the result.
