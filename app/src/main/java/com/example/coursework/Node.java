package com.example.coursework;

public class Node {

    //* In this class i added everything that the RightNode needed or me to be able to use as an extra option.
    private int ID;
    private int LeftID;
    private int MiddleID;
    private int RightID;
    private String description;
    private String question;

    private Node LeftNode;
    private Node MiddleNode;
    private Node RightNode;



    public Node(int ID, int LeftID, int MiddleID, int RightID, String description, String question) {
        this.ID = ID;
        this.LeftID = LeftID;
        this.MiddleID = MiddleID;
        this.RightID = RightID;
        this.description = description;
        this.question = question;
    }

    public Node() {}

    public int getID() {return ID;}
    public void setID(int ID) {this.ID = ID;}
    public int getLeftID() {return LeftID;}
    public void setLeftID(int leftID) {this.LeftID = leftID; }
    public int getMiddleID() {return MiddleID;}
    public void setMiddleID(int middleID) {this.MiddleID = middleID;}
    public int getRightID() { return RightID; }
    public void setRightID(int rightID) { this.RightID = rightID; }
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description; }
    public String getQuestion() {return question;}
    public void setQuestion(String question) {this.question = question;}
    public Node getLeftNode() {return LeftNode;}
    public void setLeftNode(Node yes) {this.LeftNode = yes;}
    public Node GetMiddleNode() {return MiddleNode;}
    public void setMiddleNode(Node no) {this.MiddleNode = no;}
    public Node getRightNode() { return RightNode; }
    public void setRightNode(Node rightNode) { RightNode = rightNode; }


    @Override
    public String toString() {
        return "nodeID:" + ID +
                ", yesID:" + LeftID +
                ", noID:" + MiddleID +
                ", description:'" + description + '\'' +
                ", question:'" + question + '\'';
    }


}
