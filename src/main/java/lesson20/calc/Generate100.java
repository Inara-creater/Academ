package lesson20.calc;

import lesson19.db.DbOps;

public class Generate100 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            generate();
        }
    }

    private static void generate() {
        int op1 = (int) (Math.random()*50);
        int op2 = (int) (Math.random()*50);
        String[] array = {"plus", "minus", "mult", "div"};
        int random_index = (int) (Math.random()*4);
        String ops = array[random_index];
        int id = (int) (Math.random()*200);
        int r = 0;
        switch (ops) {
            case "plus" : r=op1+op2; break;
            case "minus": r=op1-op2; break;
            case "mult" : r=op1*op2; break;
            case "div"  : r=op1/op2; break;
        }
        DbOps.insert_op(op1, op2, ops, r, id);


    }
}
