## 📘 Funds Validator: 

Проєкт реалізовує функціонал валідації достатності грошових коштів на рахунку при певній сумі покупки.

#### Формат виведення при достатності коштів:
```
Selected operation is: PURCHASE
Balance is USD 1000,00.
Enter purchase amount, USD: 750
Funds are OK. Purchase paid.
Balance is USD 250,00
```
#### Формат виведення при поверненні коштів:
```
Selected operation is: REFUND
Balance is HRN 42000,00.
Enter purchase amount, HRN: 233
Funds are OK. The purchase refunded.
Balance is HRN 42233,00
```
#### Формат виведення при недостатності коштів:
```
Selected operation is: PURCHASE
Balance is USD 1000,00.
Enter purchase amount, USD: 1200
Insufficient funds!
```