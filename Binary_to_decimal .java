import java.util.Scanner;

class Binary_to_decimal {

static int binaryToDecimal(int n)

int num = n;

int dec value = 0;

int base = 1;

int temp = num; while (temp > 0) {

int last digit = temp % 10;

temp = temp / 10;

dec_value += last_digit base;

base = base * 2;

}

return dec_value;

}

public static void main(String[] args){

Scanner myObj = new Scanner(System.in); System.out.println("Enter the number: ");

int num = myObj.nextInt();

System.out.println("The Decimal number of +num + is");

System.out.println(binaryToDecimal(num));

}

}