function get_pay(price, discount, shipping) {
// pay(지불금액) = price(책값) - (price(책값) * (discount(할인율)/100)) + shipping(배송료) -->
  
    let pay = price - (price * (discount/100)) + shipping;
    document.querySelector("#price").innerHTML = price + "원";
    document.querySelector("#discount").innerHTML = discount +"%";
    document.querySelector("#shipping").innerHTML = shipping + "원";
    document.querySelector("#pay").innerHTML = pay + "원";
} 

