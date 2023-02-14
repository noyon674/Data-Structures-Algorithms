#include<stdio.h>
#define size 5
int top;
top = -1;
int stack[size];

/*
Stack follows LIFO: Last In First Out
*/

// Element Pushing
void push(int x )
{
    if(top < size-1)
    {
        top += 1;
        stack[top] = x;
        printf("\nElement added: %d", x);
    }
    else
    {
        printf("\nOps! There is no space.");
    }
}

// Element Deleting from top
void pop()
{
    if(top >= 0)
    {
        int value = stack[top];
        top -= 1;
        printf("\nElement Deleted: %d", value);
    }
    else
    {
        printf("Ops! Empty Stack.");
    }
}

// Showing top element from stack
void peek()
{
    if(top >= 0)
    {
        printf("\n Top Element of stack: %d", stack[top]);
    }
}
int main()
{
    push(40);
    push(30);
    peek();
    push(40);
    push(10);
    push(50);
    push(90);
    peek();
    pop();
    peek();
}
