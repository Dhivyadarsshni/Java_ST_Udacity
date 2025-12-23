package module5CommonTypes.strings;

public class StringsAllMethodsDemo {

    public static void main(String[] args) {

        // ===============================
        // 1️⃣ String creation
        // ===============================
        String s = " Java Programming ";
        String s2 = "java programming";

        System.out.println("Original String: '" + s + "'");

        // ===============================
        // 2️⃣ Length
        // ===============================
        System.out.println("Length: " + s.length());

        // ===============================
        // 3️⃣ Character access
        // ===============================
        System.out.println("Char at index 2: " + s.charAt(2));

        // ===============================
        // 4️⃣ Case conversion
        // ===============================
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());

        // ===============================
        // 5️⃣ Trimming spaces
        // ===============================
        String trimmed = s.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // ===============================
        // 6️⃣ Comparison
        // ===============================
        System.out.println("Equals: " + trimmed.equals(s2));
        System.out.println("Equals Ignore Case: " + trimmed.equalsIgnoreCase(s2));

        // ===============================
        // 7️⃣ Substring
        // ===============================
        System.out.println("Substring (0,4): " + trimmed.substring(0, 4));

        // ===============================
        // 8️⃣ Contains
        // ===============================
        System.out.println("Contains 'Java': " + trimmed.contains("Java"));

        // ===============================
        // 9️⃣ StartsWith / EndsWith
        // ===============================
        System.out.println("Starts with 'Java': " + trimmed.startsWith("Java"));
        System.out.println("Ends with 'ing': " + trimmed.endsWith("ing"));

        // ===============================
        // 🔟 IndexOf / LastIndexOf
        // ===============================
        System.out.println("Index of 'a': " + trimmed.indexOf('a'));
        System.out.println("Last index of 'a': " + trimmed.lastIndexOf('a'));

        // ===============================
        // 1️⃣1️⃣ Replace
        // ===============================
        System.out.println("Replace Java with Python: " +
                trimmed.replace("Java", "Python"));

        // ===============================
        // 1️⃣2️⃣ Split
        // ===============================
        String langs = "Java,Python,C++,JavaScript";
        String[] arr = langs.split(",");

        System.out.println("Split result:");
        for (String lang : arr) {
            System.out.print(lang+ " ");
        }
        System.out.println();

        // ===============================
        // 1️⃣3️⃣ isEmpty / isBlank
        // ===============================
        String empty = "  ";
        String blank = "";

        System.out.println("empty.isEmpty(): " + empty.isEmpty());
        System.out.println("blank.isBlank(): " + blank.isBlank());

        // ===============================
        // 1️⃣4️⃣ Concat
        // ===============================
        String result = trimmed.concat(" is awesome");
        System.out.println("Concat result: " + result);

        // ===============================
        // 1️⃣5️⃣ valueOf
        // ===============================
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("String valueOf int: " + numStr);

        // ===============================
        // 1️⃣6️⃣ toCharArray
        // ===============================
        char[] chars = trimmed.toCharArray();
        System.out.print("Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // ===============================
        // 1️⃣7️⃣ Intern
        // ===============================
        String a = new String("Java");
        String b = a.intern();

        System.out.println("Intern example:");
        System.out.println(a == b); // false
        System.out.println(b == "Java"); // true
    }
}

