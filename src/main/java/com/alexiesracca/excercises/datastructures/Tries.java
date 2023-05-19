package com.alexiesracca.excercises.datastructures;

import java.util.ArrayList;
import java.util.List;

/**
 * Create Trie data structure
 * @author alexies
 *
 */

public class Tries {

    Node root = new Node(' ', false);

    public static void main(String args[]){

       Tries t = new Tries();
       Node n = null;
       String word;
        
       word = "DICT";
       n = t.insert(t.root,word);
       if(n!=null) {
           System.out.println("Insert: "+ word);
       }
 
       word = "DICT";
       n = t.find(t.root, word);
       if(n!=null) {
           System.out.println("Search: "+ word+ " - found, freq: "+ n.freqCount);
       }
       
       word = "DICK";
       n = t.find(t.root, word);
       if(n!=null) {
           System.out.println("Search: "+ word+ " - found, freq: "+ n.freqCount);
       }
       
       word = "DICK";
       n = t.insert(t.root, word);
       if(n!=null) {
           System.out.println("Search: "+ word+ " - found, freq: "+ n.freqCount);
       }
       
       word = "DICK";
       n = t.find(t.root, word);
       if(n!=null) {
           System.out.println("Search: "+ word+ " - found, freq: "+ n.freqCount);
       }
       
       word = "DICK";
       n = t.find(t.root, word);
       if(n!=null) {
           System.out.println("Search: "+ word+ " - found, freq: "+ n.freqCount);
       }
       
       word = "DINK";
       n = t.find(t.root, word);
       if(n!=null) {
           System.out.println("Search: "+ word+ " - found, freq: "+ n.freqCount);
       }
       
       
       word = "DICTIONARY";
       n = t.insert(t.root,word);
       if(n!=null) {
           System.out.println("Insert: "+ word);
       }
       
       word = "DICTION";
       n = t.insert(t.root,word);
       if(n!=null) {
           System.out.println("Insert: "+ word);
       }
       
       word = "DIC";
       t.showSuggestions(t.root, word);
       
       
       //==========
       word = "ALEXIES";
       n = t.insert(t.root,word);
       if(n!=null) {
           System.out.println("Insert: "+ word);
       }
       
       word = "ALEXA";
       n = t.insert(t.root,word);
       if(n!=null) {
           System.out.println("Insert: "+ word);
       }
       
       word = "ALEXANDER";
       n = t.insert(t.root,word);
       if(n!=null) {
           System.out.println("Insert: "+ word);
       }
       
       word = "ALEXIS";
       n = t.insert(t.root,word);
       if(n!=null) {
           System.out.println("Insert: "+ word);
       }
       
       word = "ALAXAN";
       n = t.insert(t.root,word);
       if(n!=null) {
           System.out.println("Insert: "+ word);
       }
       
       word = "ALEX";
       t.showSuggestions(t.root, word);
       
       word = "AL";
       t.showSuggestions(t.root, word);

    }

   public Node insert(Node root, String word){
	   //System.out.print("\nInsert - > ");

        Node node = root;

        char[] wordChars = word.toUpperCase().toCharArray();

        for(char c : wordChars ) {

        	int charInt = c - 65 ;
            
            if(node.children[charInt] == null ){
                Node child = new Node(c, false);
                node.children[charInt] = child;
            }
            node = node.children[charInt];
        }
        
        node.isWord = true;

        return node;
    }

   public  Node find(Node root, String word){
	 //  System.out.print("\nFind - > ");
	   
       Node node = root;

       char[] wordChars = word.toUpperCase().toCharArray();

       for(char c : wordChars ) {
           
           int charInt = c - 65 ;
           
           if(node.children[charInt] == null ){
        	   return null;
           }
           
           node = node.children[charInt];
       }

       node.freqCount++;
       return node;
    }
   
   public void showSuggestions(Node root, String prefix) {
	   System.out.println("Show suggestions - > "+ prefix);
	   
       Node node = find(root, prefix);
       
       List<String> words = getWords(node, prefix.substring(0, prefix.length()-1));
       
       System.out.println(" " + words);

   }
   
   public List<String> getWords(Node node, String prefix) {
	   List<String> words = new ArrayList<String>();
	   
	   if(node.isWord) {
		   words.add(prefix+node.c);
	   }
	
	   for(Node child : node.children) {
		   
		   if(child!=null) {
			   words.addAll(getWords(child, prefix+node.c ));
		   }
		   
	   } 
	   
	   return words;
   }
   
   class Node{

	    char c;
	    boolean isWord;
	    Node[] children;   
	    int freqCount;
	    
	     Node(char c, boolean isWord){
	        this.c = c;
	        this.isWord = isWord;
	        this.children = new Node[26];
	        this.freqCount = 0;
	    }
	     
	     public String toString() {
	    	 return this.c+"";
	     }
    
   }


}
