public class StringManipulatorTest {
    public static void main(String[] args){
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat(" Hello","   World");
        System.out.println(str);
    
        StringManipulator manipulatorIndex = new StringManipulator();
        char letter = 'o';
        Integer a = manipulatorIndex.getIndexOrNull("Coding", letter);
        Integer b = manipulatorIndex.getIndexOrNull("Hello World", letter);
        Integer c = manipulatorIndex.getIndexOrNull("Hi", letter);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c); 

        StringManipulator manipulatorString = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer aa = manipulatorString.getIndexOrNullString(word, subString);
        Integer bb = manipulatorString.getIndexOrNullString(word, notSubString);
        System.out.println(aa); 
        System.out.println(bb); 

        StringManipulator manipulatorsubstring = new StringManipulator();
        String words = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(words); // eworld
    }
}