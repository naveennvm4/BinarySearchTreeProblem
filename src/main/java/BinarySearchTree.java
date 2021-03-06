public class BinarySearchTree<K extends Comparable<K>> {
    private BinarySearchTreeNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    private BinarySearchTreeNode<K> addRecursively(BinarySearchTreeNode<K> current, K key) {
        if (current == null)
            return new BinarySearchTreeNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0 ) return current;
        if (compareResult < 0)
            current.left = addRecursively(current.left, key);
        else
            current.right = addRecursively(current.right, key);
        return current;
    }

    public int getSize(){
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(BinarySearchTreeNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left)
                + this.getSizeRecursive(current.right);
    }

    public K search(K key) {
        return searchRecursively(root, key);
    }

    private K searchRecursively(BinarySearchTreeNode<K> current, K key) {
        if (current == null || current.key == key)
            return key;
        int compareResult = key.compareTo(current.key);
        if (compareResult < 0)
            return searchRecursively(current.left, key);
        else
            return searchRecursively(current.right, key);
    }
}