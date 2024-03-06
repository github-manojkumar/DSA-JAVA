package DSA_Java.Tries.Implementation;

public class TestTries {
    public static void main(String[] args) {
        TriesDS trie=new TriesDS();
        trie.addWord("apple");
        trie.addWord("app");
        trie.addWord("bat");
        trie.addWord("batman");
        trie.addWord("batsman");
        trie.addWord("application");
        trie.addWord("battle");

        System.out.println("Words in Trie:");
        trie.display();
//        System.out.println("After deleting batsman");
//        trie.deleteWord("bat");
//        trie.display();

    }
}
