import java.util.Scanner;
class Stack
{
    Scanner scan=new Scanner(System.in);
    int n;
    int stack[];
    Stack(int size)
    {
        
         this.n=size;
       stack=new int[n];
    }  
       
       
        int top=-1;
       public void push()
        {
            int x;
            System.out.println("Enter Element to be inserted: ");
            x=scan.nextInt();
            if(top==(n-1))
            {
                System.out.println("OVERFLOW");
            }
            else
            {
                top++;
                stack[top]=x;
                
            }
        }
        public void pop()
        {
            if(top==-1)
            {
                System.out.println("UNDERFLOW");
                
            }
            else
            {
            int item;
            item=stack[top];
            top--;
            System.out.println("Deleted Element: "+item);
            }
        }
        public void peek()
        {
            if(top==-1)
            {
                    System.out.println("UNDERFLOW");
                    
            }
            else
            {
                int last;
                last=stack[top];
                System.out.println("Top Element: "+last);
            }
        }
        public void display()
        {
            System.out.println("STACK ELEMENTS");
            for(int i=top;i>=0;i--)
            {
                System.out.println("\n"+stack[i]);
                
            }
        }
        public static void main(String args[])
        {
            Scanner scan=new Scanner(System.in);
            int n;
            System.out.println("Enter no of elements in the stack: ");
               n=scan.nextInt();
               Stack stk=new Stack(n);
               int choice;
               boolean c=true;
              
               while(c==true)
               {
                    System.out.println("Enter Your Choice: \n1.push2.pop3.peek4.To display");
               
               choice=scan.nextInt();
               switch(choice)
               {
                   case 1:
                        for(int i=0;i<n;i++)
               {
               stk.push();
               }
               break;
               case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.display();
                    break;
                default:
                   c=false;
                   break;
                  
                    
                   
                       
                   
               }
               }
               }
                   
                   
              
              


        }