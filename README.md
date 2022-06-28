# StringManipulation
### Project by: Ali, Jamie, Dhrushil

### Number of Characters
```java
public int numOfChar(String input) {
    if (input.equals("")) return 0;
    int num = 0;
    String[] splitInput = input.split("\\W+");
    for (String s : splitInput) {
        num += s.length();
    }
    return num;
}
```
The following method will use the input parameter and split the string based on all non alphanumeric characters. This will then be stored into a string array in which a foreach loop is used to go through each item in the array and count the length of each word. Once we have the length of each word we can add them all to the num variable which will then return the total num of characters in the string.

### Number of Words
```java
public int numOfWords(String input) {
    if (input.equals("")) return 0;
    int num = 0;
    String[] splitInput = input.split("\\W+");
    for (String s : splitInput) {
        num++;
    }
    return num;
}
```
The following method will use the input parameter and split the string based on all non alphanumeric characters. This will then be stored into a string array in which a foreach loop is used to go through each item in the array. For every loop we will increment the num variable and then return the num variable at the end which will show us the total words in the string

### Frequency of Letters
```java
public char numOfFreq(String input)
{
    int count[] = new int[128];
    int freq = 0;
    char letter = ' ';

    for (int i=0; i<input.length(); i++){
        count[input.charAt(i)]++;
    }

    for (int i = 0; i < input.length(); i++) {
        if (freq < count[input.charAt(i)]) {
            freq = count[input.charAt(i)];
            letter = input.charAt(i);
        }
    }

    return letter;
}
 ```
The following method will initialise an int array called count of size 128, as this is the size of all possible characters once you remove the alphanumeric options. Then you run a for loop to enter the ascii code to the count array. After this you loop through all the ascii codes in the count array and if the number of letters is larger than the current freq value, we will update the frequency value to be that current letter. We then return the letter
