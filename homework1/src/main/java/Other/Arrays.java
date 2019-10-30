package Other;

 class Arrays {
    public static void main(String[] args) {
        int [] newint = new int[5];
        newint[0] = 10;
        newint[1] = 20;
        newint[2] = 30;
        newint[3] = 40;
        newint[4] = 50;

        for (int i = 0; i < newint.length; i++)
        System.out.println("Element at index : " + i + " : " + newint[i]);
    }


}
