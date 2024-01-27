# Conversion Calculator

This Java program provides a user-friendly interface for converting numbers between decimal, binary, and hexadecimal representations. It utilizes a simple console-based menu system to allow users to select their desired conversion options. The conversion logic is implemented in the `Calculator` class, with exception handling for various input scenarios.

## How to Use

1. Run the `Program` class to start the conversion program.
2. Select an option from the menu:
    - `1`: Convert decimal to binary
    - `2`: Convert binary to decimal
    - `3`: Convert hexadecimal to decimal
    - `4`: Convert decimal to hexadecimal
    - `5`: Convert hexadecimal to binary
    - `6`: Convert binary to hexadecimal
    - `7`: End the program
3. Follow the prompts to enter the corresponding numbers for conversion.
4. View the converted result.

## Conversion Methods

### Decimal to Binary (`decimalToBinary`)

Converts a decimal number to its binary representation.

### Binary to Decimal (`binaryToDecimal`)

Converts a binary number to its decimal representation. Throws `InputMismatchBinary` exception for invalid binary input.

### Hexadecimal to Decimal (`hexadecimalToDecimal`)

Converts a hexadecimal number to its decimal representation. Throws `InputMismatchHexadecimal` exception for invalid hexadecimal input.

### Decimal to Hexadecimal (`decimalToHexadecimal`)

Converts a decimal number to its hexadecimal representation.

### Hexadecimal to Binary (`hexadecimalToBinary`)

Converts a hexadecimal number to its binary representation.

### Binary to Hexadecimal (`binaryToHexadecimal`)

Converts a binary number to its hexadecimal representation. Throws `InputMismatchBinary` exception for invalid binary input.

## Exceptions

### `InputMismatchBinary`

Thrown for invalid binary input during binary-to-decimal or binary-to-hexadecimal conversions.

### `InputMismatchHexadecimal`

Thrown for invalid hexadecimal input during hexadecimal-to-decimal conversions.

## Dependencies

The program uses the `Scanner` class for user input and handles various exceptions, providing a robust user experience.

Feel free to explore and contribute to the project! If you encounter any issues or have suggestions, please open an issue in the repository.
