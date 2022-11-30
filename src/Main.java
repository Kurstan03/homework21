public class Main {
    public static void main(String[] args) {
        Alphabet alphabet = new Alphabet(
                "EnglishAlphabetAndNumbers",
                "A a\nB b\nC c\nD d\nE e\nF f\nG g\nH h\nI i\nJ j\nK k\nL l\nM m" +
                        "\nN n" + "\nO o\nP p\nQ q\nR r\nS s\nT t\nU u\nV v\nW w\nX x\nY y\nZ z",
                "\n0\n1\n2\n3\n4\n5\n6\n7\n8\n9"
                );
        alphabet.fileWriter();
        alphabet.filReader();
    }
}