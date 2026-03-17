# Shopping Basket Application

A simple Java console application that simulates a shopping basket with different types of items including utility items, weight-based items, and coupons.

## Features

- Add different types of items to a shopping basket:
  - **Utility Items (U)** - Regular items with description and fixed price
  - **Weight Items (W)** - Items priced by weight (price per kilo × weight)
  - **Coupons (C)** - Discount coupons (negative values)
- Interactive command-line interface
- Input validation and error handling
- Automatic receipt generation with itemized list and total

## Item Types

### Utility Item (U)
A standard item with a fixed price.
- Input: Description, Price
- Example: `U` → "Book", 29.99

### Weight Item (W)
An item priced based on weight.
- Input: Description, Weight (kg), Price per kilo
- Example: `W` → "Apples", 1.5, 3.99

### Coupon (C)
A discount coupon that reduces the total.
- Input: Description, Value (positive value automatically converted to negative)
- Example: `C` → "Summer Sale", 10.00

## How to Use

1. Run the application
2. Enter item type (U, W, or C) when prompted
3. Follow the prompts to enter item details
4. Repeat steps 2-3 to add more items
5. Type 'T' to finish and print the receipt

## Sample Session
Type: U
Description: Book
Price: 29.99

Type: W
Description: Apples
Weight: 1.5
Price per kilo: 3.99

Type: C
Description: Discount
Value: 5.00

Type: T

Receipt

Book 29.99$
Apples (3.99 x 1.5) 5.99$
Discount -5.00$

Total: 30.98


## Class Structure

- **App.java** - Main application class with user interface
- **Basket.java** - Manages the collection of items
- **Item.java** - Abstract base class for all items
- **UtilItem.java** - Fixed-price items
- **WeightItem.java** - Weight-based items
- **Coupon.java** - Discount coupons

## Error Handling

The application handles:
- Invalid item types
- Wrong input formats (non-numeric values where numbers expected)
- Gracefully continues operation after errors

## Requirements

- Java Runtime Environment (JRE) 8 or higher
- Command-line interface

## How to Compile and Run

```bash
# Compile all Java files
javac *.java

# Run the application
java App
