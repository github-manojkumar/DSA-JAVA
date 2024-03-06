package DSA_Java.Tries.Implementation;

import java.util.HashMap;
import java.util.Map;

public class TriesDS {

    private class Node{

        char ch;
        boolean eow;
        Map<Character,Node> children;

        Node(char ch){
            this.ch=ch;
            this.eow=false;
            this.children=new HashMap<>();
        }
    }

    Node root;

    public TriesDS(){
        this.root=new Node(' ');
    }

    public void addWord(String word){
        addWord(root,word,0);
    }

    private void addWord(Node parent,String word,int idx){

        if(idx==word.length()) {
            if(!parent.eow){
                parent.eow=true;
            }
            return;
        }

        char ch=word.charAt(idx);
        Node child=parent.children.get(ch);

        if(child==null){
            Node node=new Node(ch);
            parent.children.put(ch,node);
            child=node;
        }

        addWord(child,word,idx+1);

    }

    public boolean deleteWord(String word){
        return deleteWord(root,word,0);
    }
    private boolean deleteWord(Node parent,String word,int idx){
        if (idx == word.length()) {
            if (!parent.eow) {
                // Word not found
                return false;
            }
            parent.eow = false; // Unset end of word marker
            return parent.children.isEmpty(); // Return true if this is a leaf node
        }

        char ch = word.charAt(idx);
        Node child = parent.children.get(ch);

        if (child == null) {
            // Word not found
            return false;
        }

        boolean deleteChild = deleteWord(child, word, idx + 1);

        if (deleteChild) {
            parent.children.remove(ch); // Remove child if it's marked for deletion
            return parent.children.isEmpty() && !parent.eow; // Return true if this is a leaf node and not an end of word
        }

        return false;
    }

    public boolean searchWord(String word){
        return searchWord(root,word,0);
    }

    private boolean searchWord(Node parent,String word,int idx){

        if(idx==word.length()) return parent.eow;

        char ch=word.charAt(idx);
        Node child=parent.children.get(ch);

        if(child==null){
            return false;
        }else{
            return searchWord(child,word,idx+1);
        }
    }

    public void display(){
        display(root,"");
        System.out.println();
    }

    private void display(Node parent,String output){
        if(parent==null) return;

        if(parent.eow){
            System.out.print(output+" ");
        }

        for(char ch: parent.children.keySet()){
            display(parent.children.get(ch),output+ch);
        }

    }


}
