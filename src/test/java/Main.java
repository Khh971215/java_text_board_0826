import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String queryString = "a=1&b=2&c=3";
        String[] queryStrignBits = queryString.split("&");

        System.out.println(Arrays.toString(queryStrignBits));

        /*
        for(String bit : queryStrignBits) {
            System.out.println(bit);
        }
        */
        for(String bit : queryStrignBits) {
            String[] bitBits = bit.split("=");
            String paramName = bitBits[0];
            String paramValue = bitBits[1];

            System.out.printf("%s : %s\n", paramName, paramValue);
        }
    }
}
