#include<iostream>
using namespace std;
class Node
{
  public:
  int data;
  Node *next;
  Node( int value)
  {
      data=value;
      next=nullptr;
  }
};
class LinkedList
{
    private:
    Node *head;
    public:
    LinkedList()
    {
        head=nullptr;
    }
    void insertatend(int value)
    {
        Node *newNode=new Node(value);
        if(head==nullptr)
        {
            head=newNode;
        }
        else
        {
            Node *temp=head;
            while(temp->next!=nullptr)
            {
                temp=temp->next;
            }
            temp->next=newNode;
        }
    }
    Node *reverseRec(Node *node)
    {
        if(node==nullptr || node->next==nullptr)
        {
            return node;
        }
        Node *test=reverseRec(node->next);
        node->next->next=node;
        node->next=nullptr;
        return test;
    }
    void reverse()
    {
        head=reverseRec(head);
    }
    void display()
    {
        if(head==nullptr)
        {
            cout<<"Linked List is empty "<<endl;
            return;
        }
        Node *temp=head;
        while(temp!=nullptr)
        {
            cout<<temp->data<<" ";
            temp=temp->next;
        }
        cout<<endl;
    }
};
int main()
{
  LinkedList l;
  l.insertatend(10);
  l.insertatend(20);
  l.insertatend(30);
  l.insertatend(40);
  
  l.display();
  cout<<endl;
  l.reverse();
  l.display();
}