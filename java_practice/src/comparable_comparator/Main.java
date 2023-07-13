package comparable_comparator;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String s1 = scanner.nextLine();
String s2 = scanner.nextLine();


int minDiff = 0;
int maxDiff = 0;

for (int i = 0; i < s1.length(); i++) {
  char c1 = s1.charAt(i);
  char c2 = s2.charAt(i);

  if (c1 == c2) {
    continue; // symbols are the same, no difference
  } else if (c1 == '?') {
    if (c2 != 'a') {
      minDiff++;
    }
    if (c2 != 'z') {
      maxDiff++;
    }
  } else if (c2 == '?') {
    if (c1 != 'z') {
      maxDiff++;
    }
    if (c1 != 'a') {
      minDiff++;
    }
  } else {
    minDiff++;
    maxDiff++;
  }
}

System.out.println(minDiff + " " + maxDiff);
}
}