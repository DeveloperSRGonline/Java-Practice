import javax.swing.*;
import javax.swing.tree.*;
class TreeExample
{
public static void main(String args[])
{
 JFrame f=new JFrame();
 DefaultMutableTreeNode root=new
DefaultMutableTreeNode("Computer");
 DefaultMutableTreeNode c=new DefaultMutableTreeNode("C Drive");
 DefaultMutableTreeNode d=new DefaultMutableTreeNode("D Drive");
 root.add(c);
 root.add(d);
 JTree tree=new JTree(root);
 f.add(tree);
 f.setSize(300,300);
 f.setVisible(true);
}
}