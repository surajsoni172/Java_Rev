package Revision;

public class DecimalToBinary2 {

	
	public static void main (String[] args)
    {
        
        
        String ABC = decimaltobinary(12);
        String XYZ = decimaltooctal(65);
        String PQR = decimalToHexadecimal(254);
       
       System.out.println(ABC);
       
       System.out.println(XYZ);
       
       System.out.println(PQR);
            
        }
        
        //
        public static String decimaltobinary (int decimal)
        {
            String binary = "";
            //if decimal no is 00
            if (decimal == 0)
            {
                
                return "0";
            }
           for (int i = decimal; i>0;i=i/2) 
           {
               
               binary = (i%2) + binary;
           }
            return binary;
        }
        
        
        public static String decimaltooctal (int decimal)
        {
            String octal = "";
            //if decimal no is 00
            if (decimal == 0)
            {
                
                return "0";
            }
           for (int i = decimal; i>0;i=i/8) 
           {
               
               octal = (i%8) + octal;
           }
            return octal;
        }
        
        
            // Method to convert decimal to hexadecimal without StringBuilder
            public static String decimalToHexadecimal(int decimal) {
                // Edge case: if the number is 0, its hexadecimal representation is "0"
                if (decimal == 0) {
                    return "0";
                }

                // Variable to store the hexadecimal result
                String hexadecimal = "";

                // Loop to convert decimal to hexadecimal
                for (int num = decimal; num > 0; num /= 16) {
                    int remainder = num % 16;

                    // Convert remainder to corresponding hexadecimal character
                    if (remainder < 10) {
                        hexadecimal = remainder + hexadecimal;  // For digits 0-9
                    } else {
                        // For hex digits A-F, add the corresponding letter
                        hexadecimal = (char) ('A' + (remainder - 10)) + hexadecimal;
                    }
                }

                return hexadecimal;
            }
        }



//For example, for decimal to binary  12:

//12 ÷ 2 = 6 (remainder 0) → prepend 0 → binary = "0"
//6 ÷ 2 = 3 (remainder 0) → prepend 0 → binary = "00"
//3 ÷ 2 = 1 (remainder 1) → prepend 1 → binary = "100"
//1 ÷ 2 = 0 (remainder 1) → prepend 1 → binary = "1100"
//So, the binary equivalent of 12 is "1100".

//For example, for decimal to octal  65:
//65 ÷ 8 = 8 (remainder 1) → prepend 1 → octal = "1"
//8 ÷ 8 = 1 (remainder 0) → prepend 0 → octal = "01"
//1 ÷ 8 = 0 (remainder 1) → prepend 1 → octal = "101"
//So, the octal equivalent of 65 is "101".

// Hexadecimal Digits: The program uses the values 0–9 for remainders 0–9 and A–F for remainders 10–15.
//Detailed Breakdown:
//1. Understanding the Range of remainder:
//In a hexadecimal number system, digits can range from 0 to 15. The digits 0 to 9 are represented by the characters '0' to '9', and the digits 10 to 15 are represented by the characters 'A' to 'F'.
//When we divide a decimal number by 16, the remainders will be in the range 0 to 15. For remainders 10 through 15, we need to convert these numbers to the letters 'A' through 'F'.
//2. Why remainder - 10:
//The decimal values 10, 11, 12, 13, 14, and 15 correspond to the hexadecimal characters A, B, C, D, E, and F, respectively.
//By subtracting 10 from the remainder, we shift the range of remainders from [10, 11, 12, 13, 14, 15] to [0, 1, 2, 3, 4, 5]. This allows us to map the remainder directly to an offset of 0 to 5, which we can add to the character 'A'.
//3. Character Arithmetic:
//The expression 'A' is the character 'A' in the Unicode (or ASCII) character set, which has a value of 65 in Unicode/ASCII encoding.
//When we add a number to a character in Java, it performs character arithmetic: the number is added to the Unicode value of the character.
//For example, 'A' + 0 gives the character 'A', 'A' + 1 gives the character 'B', and so on.
//Specifically:
//'A' has a Unicode value of 65.
//So, for remainder = 10, remainder - 10 = 0, and 'A' + 0 results in 'A'.
//For remainder = 11, remainder - 10 = 1, and 'A' + 1 results in 'B', and so on.
//4. Casting to char:
//The result of the addition 'A' + (remainder - 10) is an integer (since characters in Java are represented by integer Unicode values).
//We need to cast this integer back to a character using (char). This ensures that the result of the addition is converted to the corresponding hexadecimal letter.
//For example, if remainder = 11, 'A' + (11 - 10) results in 66, which corresponds to the character 'B'.
//5. Prepending the Hexadecimal Digit:
//After determining the correct hexadecimal digit, this line prepends it to the hexadecimal string. This is done by concatenating the new hexadecimal digit (calculated as (char) ('A' + (remainder - 10))) with the current value of the hexadecimal string.
//This operation ensures that we build the hexadecimal representation from the least significant digit (rightmost) to the most significant digit (leftmost). By prepending the new digit, we effectively construct the hexadecimal string in the correct order.
