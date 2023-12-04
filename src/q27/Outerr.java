package q27;

class Outerr {
    //static initializer block of enclosing class
    static {
        System.out.print('A');
    }
    //instance initializer block of enclosing class
    {
        System.out.print('B');
    }
    //constructor of enclosing class
    Outerr() {
        System.out.print('C');
    }

    class Innerr {
        //static initializer block of regular inner class
        static {
            System.out.print('D');
        }
        //instance initializer block of regular inner class
        {
            System.out.print('E');
        }
        //constructor of regular inner class
        Innerr() {
            System.out.print('F');
        }
    }
}
