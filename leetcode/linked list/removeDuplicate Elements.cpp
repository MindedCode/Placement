// -100 <= Node.val <= 100
// The list is guaranteed to be sorted in ascending order.

#include<stdio.h>
#include<stdlib.h>

struct node{
    int d;
    struct node *next;
};

void traverse(struct node *ptr){
    while(ptr != NULL){
        printf("%d ", ptr->d);
        ptr= ptr->next;
    }
}
struct node *removeDuplicate(struct node *conn){
    struct node *temp = conn;
    
    while(temp && temp->next){
        if(temp->next->d == temp->d){
            temp->next = temp->next->next;
            continue;
        }
        temp = temp->next;
    }
    return conn;
}
int main(){
    struct node *conn = (struct node*)malloc(sizeof(struct node));
    struct node *sec = (struct node*)malloc(sizeof(struct node));
    struct node *third = (struct node*)malloc(sizeof(struct node));
    struct node *fourth = (struct node*)malloc(sizeof(struct node));
    struct node *five = (struct node*)malloc(sizeof(struct node));
    struct node *six = (struct node*)malloc(sizeof(struct node));
    struct node *seven = (struct node*)malloc(sizeof(struct node));
    struct node *eight = (struct node*)malloc(sizeof(struct node));
    
    //connect nodes
    (*conn).d = 1;
    (*conn).next = sec;
    
    sec->d = 2;
    sec->next = third;
    
    third->d = 3;
    third->next = fourth;
    
    fourth->d = 3;
    fourth->next = five;
    
    five->d = 4;
    five->next = six;
    
    six->d = 4;
    six->next = seven;
    
    seven->d = 5;
    seven->next = eight;
    
    eight->d = 5;
    eight->next = NULL;
    
    printf("Original Duplicate List: \n");
    traverse(conn);
    
    printf("\n\n");
    printf("After Remove Duplicate element:\n");
    conn = removeDuplicate(conn);
    traverse(conn);


Output is:
// Original Duplicate List: 
// 1 2 3 3 4 4 5 5 

// After Remove Duplicate element:
// 1 2 3 4 5 
