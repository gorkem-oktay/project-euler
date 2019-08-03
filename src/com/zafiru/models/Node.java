package com.zafiru.models;

public class Node {

    public Object data;
    public Node parent;
    public Node left;
    public Node right;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(Object data, Node parent, Node left, Node right) {
        this.data = data;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }
}
