public class arr {
    public static void main(String[] args) {
        int[] numbers ={1,2,3};
        System.out.println(numbers.length);

        String[] friends = {"a", "b", "", ""};
        System.out.println(friends.length);

        friends[2] = "c";
        System.out.println(friends[2]);

        for (int i = 0; i < friends.length; i++){
            System.out.println("friends[" + i +"]" + ":" + friends[i]);
        }
    }
}
