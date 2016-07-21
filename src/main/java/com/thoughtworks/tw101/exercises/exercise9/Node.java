package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node> {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
    public void setRight(Node right) {
        this.right = right;
    }

    public void add(String nameOfNewNode) {
            // similar logic to a binary search tree so the nodes are in alpha order for the traversal
            // less than 0 means this node is earlier on in the alphabet than nameOfNewNode
            if(compareTo(new Node(nameOfNewNode))<0) {
                if(right!=null) {
                    this.right.add(nameOfNewNode);
                } else {
                    setRight(new Node(nameOfNewNode));
                }
            } else {
                // greater than or equal to, means later on in the alphabet
                if(left!=null) {
                    this.left.add(nameOfNewNode);
                } else {
                    setLeft(new Node(nameOfNewNode));
                }
            }
    }

    public List<String> names() {
        List<String> namesList = new ArrayList<String>();
        inOrderTraversal(this, namesList);
        return namesList;
    }

    private void inOrderTraversal(Node n, List<String> names) {
        if(n.left!=null) {
            inOrderTraversal(n.left, names);
        }
        names.add(n.name);
        if(n.right!=null) {
            inOrderTraversal(n.right, names);
        }
    }

    @Override
    public int compareTo(Node n) {
        return name.compareTo(n.name);
    }

}
