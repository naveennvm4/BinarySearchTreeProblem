class BinarySearchTreeNode<K extends Comparable<K>> {
    K key;
    BinarySearchTreeNode<K> left;
    BinarySearchTreeNode<K> right;

    public BinarySearchTreeNode(K key){
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
