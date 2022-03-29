
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import java.sql.SQLException;

public class NodeTree {
    public TreeNode makeSampleDerevo() throws SQLException, ClassNotFoundException {
FirstShelving fs = new FirstShelving();
SecondShelving ss = new SecondShelving();
ThirdShelving ts = new ThirdShelving();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Наш отдел");
        DefaultMutableTreeNode shelf = new DefaultMutableTreeNode("Первая полка");
        DefaultMutableTreeNode shelf2 = new DefaultMutableTreeNode();
        DefaultMutableTreeNode product = new DefaultMutableTreeNode(fs.firstProductFirstShelving());
        DefaultMutableTreeNode product2 = new DefaultMutableTreeNode(fs.secondProductFirstShelving());
        DefaultMutableTreeNode product3 = new DefaultMutableTreeNode(fs.thirdProductFirstShelving());
        DefaultMutableTreeNode quantity = new DefaultMutableTreeNode(fs.firstProductQuantityFirstShelving());
        DefaultMutableTreeNode quantity2 = new DefaultMutableTreeNode(fs.secondProductQuantityFirstShelving());
        DefaultMutableTreeNode quantity3 = new DefaultMutableTreeNode(fs.thirdProductQuantityFirstShelving());
        DefaultMutableTreeNode price = new DefaultMutableTreeNode(fs.firstProductPriceFirstShelving());
        DefaultMutableTreeNode price2 = new DefaultMutableTreeNode(fs.secondProductPriceFirstShelving());
        DefaultMutableTreeNode price3 = new DefaultMutableTreeNode(fs.thirdProductPriceFirstShelving());

        root.add(shelf);
        shelf.add(product);
        shelf.add(product2);
        shelf.add(product3);
        shelf = new DefaultMutableTreeNode("Quantity");
        product.add(shelf);
        shelf.add(quantity);
        shelf2 = new DefaultMutableTreeNode("Price");
        product.add(shelf2);
        shelf2.add(price);

        shelf = new DefaultMutableTreeNode("Quantity");
        product2.add(shelf);
        shelf.add(quantity2);
        shelf2 = new DefaultMutableTreeNode("Price");
        product2.add(shelf2);
        shelf2.add(price2);

        shelf = new DefaultMutableTreeNode("Quantity");
        product3.add(shelf);
        shelf.add(quantity3);
        shelf2 = new DefaultMutableTreeNode("Price");
        product3.add(shelf2);
        shelf2.add(price3);


            DefaultMutableTreeNode product1 = new DefaultMutableTreeNode(ss.firstProductSecondShelving());
            DefaultMutableTreeNode product22 = new DefaultMutableTreeNode(ss.secondProductSecondShelving());
            DefaultMutableTreeNode product33 = new DefaultMutableTreeNode(ss.thirdProductSecondShelving());
            DefaultMutableTreeNode quantity1 = new DefaultMutableTreeNode(ss.firstProductQuantitySecondShelving());
            DefaultMutableTreeNode quantity22 = new DefaultMutableTreeNode(ss.secondProductQuantitySecondShelving());
            DefaultMutableTreeNode quantity33 = new DefaultMutableTreeNode(ss.thirdProductQuantitySecondShelving());
            DefaultMutableTreeNode price1 = new DefaultMutableTreeNode(ss.firstProductPriceSecondShelving());
            DefaultMutableTreeNode price22 = new DefaultMutableTreeNode(ss.secondProductPriceSecondShelving());
            DefaultMutableTreeNode price33 = new DefaultMutableTreeNode(ss.thirdProductPriceSecondShelving());


        shelf = new DefaultMutableTreeNode("Третья полка");
            root.add(shelf);
            shelf.add(product1);
            shelf.add(product22);
            shelf.add(product33);
            shelf = new DefaultMutableTreeNode("Quantity");
            product1.add(shelf);
            shelf.add(quantity1);
            shelf2 = new DefaultMutableTreeNode("Price");
            product1.add(shelf2);
            shelf2.add(price1);

            shelf = new DefaultMutableTreeNode("Quantity");
            product22.add(shelf);
            shelf.add(quantity22);
            shelf2 = new DefaultMutableTreeNode("Price");
            product22.add(shelf2);
            shelf2.add(price22);

            shelf = new DefaultMutableTreeNode("Quantity");
            product33.add(shelf);
            shelf.add(quantity33);
            shelf2 = new DefaultMutableTreeNode("Price");
            product33.add(shelf2);
            shelf2.add(price33);




            DefaultMutableTreeNode product11 = new DefaultMutableTreeNode(ts.firstProductThirdShelving());
            DefaultMutableTreeNode product222 = new DefaultMutableTreeNode(ts.secondProductThirdShelving());
            DefaultMutableTreeNode product333 = new DefaultMutableTreeNode(ts.thirdProductThirdShelving());
            DefaultMutableTreeNode quantity11 = new DefaultMutableTreeNode(ts.firstProductQuantityThirdShelving());
            DefaultMutableTreeNode quantity222 = new DefaultMutableTreeNode(ts.secondProductQuantityThirdShelving());
            DefaultMutableTreeNode quantity333 = new DefaultMutableTreeNode(ts.thirdProductQuantityThirdShelving());
            DefaultMutableTreeNode price11 = new DefaultMutableTreeNode(ts.firstProductPriceThirdShelving());
            DefaultMutableTreeNode price222 = new DefaultMutableTreeNode(ts.secondProductPriceThirdShelving());
            DefaultMutableTreeNode price333 = new DefaultMutableTreeNode(ts.thirdProductPriceThirdShelving());


            shelf = new DefaultMutableTreeNode("Вторая полка");
            root.add(shelf);
            shelf.add(product11);
            shelf.add(product222);
            shelf.add(product333);
            shelf = new DefaultMutableTreeNode("Quantity");
            product11.add(shelf);
            shelf.add(quantity11);
            shelf2 = new DefaultMutableTreeNode("Price");
            product11.add(shelf2);
            shelf2.add(price11);

            shelf = new DefaultMutableTreeNode("Quantity");
            product222.add(shelf);
            shelf.add(quantity222);
            shelf2 = new DefaultMutableTreeNode("Price");
            product222.add(shelf2);
            shelf2.add(price222);

            shelf = new DefaultMutableTreeNode("Quantity");
            product333.add(shelf);
            shelf.add(quantity333);
            shelf2 = new DefaultMutableTreeNode("Price");
            product333.add(shelf2);
            shelf2.add(price333);

        return root;
    }
}
