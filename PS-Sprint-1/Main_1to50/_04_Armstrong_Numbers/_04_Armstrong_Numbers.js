let num = 153;
let arm = 0,
  copy,
  rem;
copy = num;

while (num > 0) {
  rem = num % 10;
  console.log("Remainder:", rem);
  
  arm += (rem * rem * rem);
  console.log("Current Armstrong sum:", arm);
  
  num = Math.floor(num / 10); // Use Math.floor to get integer part
  console.log("Updated number:", num);
}

if (copy === arm) {
  console.log(copy + " is an Armstrong Number");
} else {
  console.log(copy + " is not an Armstrong Number");
}
