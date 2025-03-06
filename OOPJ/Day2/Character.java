//Write a program to determine if a character is a vowel or a consonant using the ternary operator

class Character{
	char y = 'A';
	public static void main(String args[]){
		char re = (y == 'a' || y == 'e' || y == 'i' || y == 'o'
            || y == 'u' ||y == 'A' || y == 'E' || y == 'I' || y == 'O'
            || y == 'U') ? y+"vowel" :y+"consonant";
		 
		 System.out.println(re);
		
	}
}