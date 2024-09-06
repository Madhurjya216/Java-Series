import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
public static void main(String[] args) {
int i, j;
Scanner value = new Scanner(System.in);

System.out.println("How many elements you want to enter: ");
int data = value.nextInt();

int[] arr = new int[data];

System.out.println("Enter the elements of the array: ");
for (i = 0; i < arr.length; i++) {
arr[i] = value.nextInt();
}

int poistiveInt = 0;
int negativeInt = 0;
int zeroInt = 0;

for (j = 0; j < arr.length; j++) {
if (arr[j] > 0) {
poistiveInt++;
} else if (arr[j] < 0) {
negativeInt++;
} else {
zeroInt++;
}
}

System.out.println("Total number of positive intergers are: " + poistiveInt);
System.out.println("Total number of negative intergers are: " + negativeInt);
System.out.println("Total number of zero values are: " + zeroInt);

double ratio = 12.8975469595656765;

DecimalFormat df = new DecimalFormat("#.######");
String finalRatio = df.format(ratio);

System.out.println(finalRatio);

value.close();
}
}