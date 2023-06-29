package com.example.coursework;

import java.io.FileNotFoundException;
import java.io.InputStream;


public class NodeMap {

    private Node head;
    private Node currentNode;

    public Node currentNode() { return currentNode;}

    public void noDecision(){
        currentNode = currentNode.getLeftNode();
    }

    public void decision(int decision) {
        switch (decision) {
            case 1:
                currentNode = currentNode.getLeftNode();
                break;
            case 2:
                currentNode = currentNode.GetMiddleNode();
                break;
            case 3:
                //* Ive added the right node as i have a 3rd option in the game
                currentNode = currentNode.getRightNode();
                break;
        }
    }


    public NodeMap(InputStream prc)  {
        NodeCollection nodeCollection;   //scope: constructor only, part of process, no requirement to keep;
        try {
            nodeCollection = new NodeCollection(prc);
            head = nodeCollection.get(0);
        } catch (FileNotFoundException e) {
            //message
            return;
        }
        buildMap(nodeCollection);
        currentNode = head;
    }

    //* Ive added the rightNode here aswell
    private void buildMap(NodeCollection nodeCollection)   {
        if (nodeCollection == null) {return;}
        for(Node source : nodeCollection.arrayList()){
            int LeftID = source.getLeftID();
            int MiddleID = source.getMiddleID();
            int RightID = source .getRightID();

            Node leftNode = nodeCollection.locateNodeBy(LeftID);
            Node rightNode = nodeCollection.locateNodeBy(MiddleID);
            Node RightNode = nodeCollection.locateNodeBy(RightID);

            source.setLeftNode(leftNode);
            source.setMiddleNode(rightNode);
            source.setRightNode(RightNode);
        }
    }

    public String toString(){
        String string = "";
        string += LeftPath() + "\n";
        string += MiddlePath() + "\n";
        string += RightPath() + "\n";
        return string;
    }

    public String LeftPath(){
        Node node = head;
        String string = "Left Path\n";
        while(node != null) {
            string += node.toString() + "\n";
            node = node.getLeftNode();
            if (node.getID() == 0) { node = null;}
        }
        return string;
    }

    public String MiddlePath(){
        Node node = head;
        String string = "Middle Path\n";
        while(node != null) {
            string += node.toString() + "\n";
            node = node.GetMiddleNode();
            if (node.getID() == 0) { node = null;}
        }
        return string;
    }
    //* Same here ive added a RightPath for the 3rd option
    public String RightPath(){
        Node node = head;
        String string = "Right PATH\n";
        while(node != null) {
            string += node.toString() + "\n";
            node = node.getRightNode();
            if (node.getID() == 0) { node = null;}
        }
        return string;
    }



}