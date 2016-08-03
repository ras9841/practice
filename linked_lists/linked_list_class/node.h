/**
 *  File: node.h
 *  Author: Allen Sanford (ras9841@rit.edu)
 *  Description:
 *      Outlines the Node class generically.
 *  Date Creaded: 08/03/16
 */

#ifndef NODE_H
#define NODE_H
template <class T>
class Node {
        T data;
        Node<T> *next;
    public:
        Node<T> (T val);
        T getData ();
};

template <class T>
Node<T>::Node(T val)
{
    this->data = val;
    this->next = nullptr;
}

template <class T>
T Node<T>::getData()
{
    return this->data;  
}
#endif
