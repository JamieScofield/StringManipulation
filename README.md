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
