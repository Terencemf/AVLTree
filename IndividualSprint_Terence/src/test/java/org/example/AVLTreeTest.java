package org.example;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AVLTreeTest extends TestCase {

    @Mock
    MyTree treeMock;

    @Test
    public void testTreeMocking() {
        List<MyTree> TreeMockList = new ArrayList<MyTree>();
        MyTree FirstTree = new MyTree();
        int FirstNumber = 8;
        int SecondNumber = 13;
        int ThirdNumber = 20;
        int FourthNumber = 32;
        int FifthNumber = 1;
        int SixthNumber = 12;
        int SeventhNumber = 34;
        int EighthNumber = 4;

        FirstTree.root = FirstTree.insertNode(FirstTree.root, FirstNumber);
        FirstTree.root = FirstTree.insertNode(FirstTree.root, SecondNumber);
        FirstTree.root = FirstTree.insertNode(FirstTree.root, ThirdNumber);
        FirstTree.root = FirstTree.insertNode(FirstTree.root, FourthNumber);
        FirstTree.root = FirstTree.insertNode(FirstTree.root, FifthNumber);
        FirstTree.root = FirstTree.insertNode(FirstTree.root, SixthNumber);
        FirstTree.root = FirstTree.insertNode(FirstTree.root, SeventhNumber);
        FirstTree.root = FirstTree.insertNode(FirstTree.root, EighthNumber);
        FirstTree.printTree(FirstTree.root, "", true);
        TreeMockList.add(FirstTree);
    }
    @Test
    public void testTreeMocking2() {
        List<MyTree> TreeMockList = new ArrayList<MyTree>();
        MyTree SecondTree = new MyTree();
        int Num1 = 10;
        int Num2 = 21;
        int Num3 = 88;
        int Num4 = 16;
        int Num5 = 22;
        int Num6 = 3;
        int Num7 = 14;
        int Num8 = 99;

        SecondTree.root = SecondTree.insertNode(SecondTree.root, Num1);
        SecondTree.root = SecondTree.insertNode(SecondTree.root, Num2);
        SecondTree.root = SecondTree.insertNode(SecondTree.root, Num3);
        SecondTree.root = SecondTree.insertNode(SecondTree.root, Num4);
        SecondTree.root = SecondTree.insertNode(SecondTree.root, Num5);
        SecondTree.root = SecondTree.insertNode(SecondTree.root, Num6);
        SecondTree.root = SecondTree.insertNode(SecondTree.root, Num7);
        SecondTree.root = SecondTree.insertNode(SecondTree.root, Num8);
        SecondTree.printTree(SecondTree.root, "", true);
        TreeMockList.add(SecondTree);
    }
    @Test
    public void testTreeMocking3() {
        List<MyTree> TreeMockList = new ArrayList<MyTree>();
        MyTree Tree3 = new MyTree();
        int Number1 = 1;
        int Number2 = 2;
        int Number3 = 8;
        int Number4 = 16;
        int Number5 = 76;
        int Number6 = 44;
        int Number7 = 12;
        int Number8 = 55;

        Tree3.root = Tree3.insertNode(Tree3.root, Number1);
        Tree3.root = Tree3.insertNode(Tree3.root, Number2);
        Tree3.root = Tree3.insertNode(Tree3.root, Number3);
        Tree3.root = Tree3.insertNode(Tree3.root, Number4);
        Tree3.root = Tree3.insertNode(Tree3.root, Number5);
        Tree3.root = Tree3.insertNode(Tree3.root, Number6);
        Tree3.root = Tree3.insertNode(Tree3.root, Number7);
        Tree3.root = Tree3.insertNode(Tree3.root, Number8);
        Tree3.printTree(Tree3.root, "", true);
        TreeMockList.add(Tree3);
    }
}