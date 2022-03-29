import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Supermarket {

        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    JFrame frame = null;
                    try {
                        frame = new DerevoFrameEdit();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
            });
        }

        static class DerevoFrameEdit extends JFrame {
            public DerevoFrameEdit() throws SQLException, ClassNotFoundException {
                setTitle("SuperMarket");
                setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

                NodeTree nodeTree = new NodeTree();

                TreeNode root = nodeTree.makeSampleDerevo();
                model = new DefaultTreeModel(root);
                tree = new JTree(model);
                tree.setEditable(true);

                JScrollPane scrollPane = new JScrollPane(tree);
                add(scrollPane, BorderLayout.CENTER);

                MyButton button_my = new MyButton();
                button_my.makeButtons();
            }





            {
                JPanel panel = new JPanel();
                JButton addSiblingButton = new JButton("Добавить полку");
                addSiblingButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)
                                tree.getLastSelectedPathComponent();
                        if (selectedNode == null) return;
                        DefaultMutableTreeNode parent = (DefaultMutableTreeNode)
                                selectedNode.getParent();
                        if (parent == null) return;

                        DefaultMutableTreeNode newNode = new DefaultMutableTreeNode("Новый продукт");
                        int selectedIndex = parent.getIndex(selectedNode);
                        model.insertNodeInto(newNode, parent, selectedIndex + 1);

                        TreeNode[] nodes = model.getPathToRoot(newNode);
                        TreePath path = new TreePath(nodes);
                        tree.scrollPathToVisible(path);
                    }
                });
                panel.add(addSiblingButton);

                JButton addChildButton = new JButton("Добавить подтип продукта");
                addChildButton.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent event) {
                        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)
                                tree.getLastSelectedPathComponent();

                        if (selectedNode == null) return;

                        DefaultMutableTreeNode newNode = new DefaultMutableTreeNode("Новый продукт");
                        model.insertNodeInto(newNode, selectedNode, selectedNode.getChildCount());

                        TreeNode[] nodes = model.getPathToRoot(newNode);
                        TreePath path = new TreePath(nodes);
                        tree.scrollPathToVisible(path);
                    }
                });
                panel.add(addChildButton);
                JButton deleteButton = new JButton("Удалить");
                deleteButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)
                                tree.getLastSelectedPathComponent();

                        if (selectedNode != null && selectedNode.getParent() != null)
                            model.removeNodeFromParent(selectedNode);
                    }
                });
                panel.add(deleteButton);
                JButton saveButton = new JButton("Сохранить");
                saveButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)
                                tree.getLastSelectedPathComponent();

                        if (selectedNode != null && selectedNode.getParent() != null)
                            model.removeNodeFromParent(selectedNode);
                    }
                });
                panel.add(saveButton);
                add(panel, BorderLayout.SOUTH);
            }

            private DefaultTreeModel model;
            private JTree tree;
            private static final int DEFAULT_WIDTH = 500;
            private static final int DEFAULT_HEIGHT = 500;

        }


    }