package com.zafiru.problems;

import com.zafiru.models.Node;
import com.zafiru.utils.Helper;

import java.util.*;

public class Problem18 extends Problem {

    public Problem18() {
        super(18, "By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.\n" +
                "\n" +
                "3\n" +
                "7 4\n" +
                "2 4 6\n" +
                "8 5 9 3\n" +
                "\n" +
                "That is, 3 + 7 + 4 + 9 = 23.\n" +
                "\n" +
                "Find the maximum total from top to bottom of the triangle below:\n" +
                "\n" +
                "75\n" +
                "95 64\n" +
                "17 47 82\n" +
                "18 35 87 10\n" +
                "20 04 82 47 65\n" +
                "19 01 23 75 03 34\n" +
                "88 02 77 73 07 63 67\n" +
                "99 65 04 28 06 16 70 92\n" +
                "41 41 26 56 83 40 80 70 33\n" +
                "41 48 72 33 47 32 37 16 94 29\n" +
                "53 71 44 65 25 43 91 52 97 51 14\n" +
                "70 11 33 28 77 73 17 78 39 68 17 57\n" +
                "91 71 52 38 17 14 91 43 58 50 27 29 48\n" +
                "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n" +
                "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23\n" +
                "\n" +
                "NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. However, Problem 67, is the same challenge with a triangle containing one-hundred rows; it cannot be solved by brute force, and requires a clever method! ;o)");
    }

    public static Set<Node> getDeepestNodes(Node root, Set<Node> nodes) {
        if (root.left.left == null) {
            nodes.add(root);
            return nodes;
        } else {
            getDeepestNodes(root.left, nodes);
            getDeepestNodes(root.right, nodes);

            return nodes;
        }
    }

    @Override
    public String answer() {

        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(
                75,
                95, 64,
                17, 47, 82,
                18, 35, 87, 10,
                20, 4, 82, 47, 65,
                19, 1, 23, 75, 3, 34,
                88, 2, 77, 73, 7, 63, 67,
                99, 65, 4, 28, 6, 16, 70, 92,
                41, 41, 26, 56, 83, 40, 80, 70, 33,
                41, 48, 72, 33, 47, 32, 37, 16, 94, 29,
                53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14,
                70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57,
                91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48,
                63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31,
                4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23));

        Node root = Helper.convertArrayToTree(data);

        while (root.left != null) {
            Set<Node> nodes = getDeepestNodes(root, new HashSet<>());
            nodes.forEach(node -> {
                if((int)node.left.data > (int)node.right.data){
                    node.data = (int)node.data + (int)node.left.data;
                } else {
                    node.data = (int)node.data + (int)node.right.data;
                }

                node.left = null;
                node.right = null;
            });
        }

        return root.data.toString();
    }
}
