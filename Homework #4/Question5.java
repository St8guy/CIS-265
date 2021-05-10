public class Question5 {

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
		
		System.out.println("\n \nNumber of Leaves: " + StringTree.getNumberOfLeaves());
	}
}