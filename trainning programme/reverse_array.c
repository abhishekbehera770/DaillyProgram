#include <stdio.h>
int main()
{
    int arr[100], x;

    printf("enter the size of the array");
    scanf("%d", &x);

    printf("enter the elements of the array");
    for (int i = 1; i < x; i++)
    {
        scanf("%d", arr[i]);
    }

    printf("show the values");
    for (int i = 0; i < x; i++)
    {
        printf("%d", arr[i]);
    }
}