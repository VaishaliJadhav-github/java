package abcpackage;

class Addition {
    /* Since we didn't mention any access modifier here, it would
     * be considered as default.
     */
   int addTwoNumbers(int a, int b){
        return a+b;
    }
}
class Test extends Addition{
    public static void main(String args[]){
        Addition obj = new Addition();
        /* It will throw error because we are trying to access
         * the default method in another package
         */
        obj.addTwoNumbers(10, 21);
    }
}