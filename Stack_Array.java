//stack using Arrey
import java.util.Scanner;

public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter size");
int size=sc.nextInt();
int[] stack = new int[size];
int top=-1;
while(true){
System.out.println("Choose operation :\n1:push()\n2:pop()\n3:peek()\n4:display()");
int choice =sc.nextInt();
switch(choice) {
   case 1:
       if(top==size-1)
                    System.out.println("Stack Overflow");
                else{
                    System.out.print("Enter element:");
                    int ele = sc.nextInt();
                    stack[++top]=ele;
                }
                break;
            case 2:
                if(top==-1)
                    System.out.println("Stack Underflow");
                else
                    top--;
                    break;
            case 3:
                if(top==-1)
                    System.out.println("Stack Underflow");
                else
                    System.out.println(stack[top]);
                break;
            case 4:
                System.out.print("\nThe stack contents are ");
                for(int i=top; i>-1; i--){
                    System.out.print(stack[i] + " ");
                }
                break;
}
System.out.println("continue 1/0");
int flag = sc.nextInt();
if(flag==0)
   break;
}
}
}
