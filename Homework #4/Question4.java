public class Question4 {

	public static void main(String[] args) 
	{
		BST<String> StringTree = new BST<String>();
		StringTree.insert("Cleveland");
		StringTree.insert("Berea");
		StringTree.insert("Parma");
		StringTree.insert("Olmsted");
		StringTree.insert("Brusnwick");
		StringTree.insert("Brooklyn");
		StringTree.insert("Westlake");
		StringTree.insert("Brecksville");
		
		System.out.print("\nHeight of tree: " +  StringTree.height());
		System.out.print("\nBreadth first traversal: ");
		StringTree.breadthFirstTraversal();
	}
}
