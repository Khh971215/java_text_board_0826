import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 문제점 : 현재 우리 파싱로직은 유연하지 못한다.
        // 왜? 파라미터가 추가되면 추가 된 내용에 대해서 추가 작업을 해줘야 하기 때문에..
        String queryString = "id=3&memberId=13&boardId=2&hit=73&writerName=신짱구";

        Map<String, String> params = new LinkedHashMap<>();
        // LinkedHashMap : 순서를 보장

        // 압축해제 시작
        String[] queryStrignBits = queryString.split("&");

        for(String bit : queryStrignBits) {
            String[] bitBits = bit.split("=");
            params.put(bitBits[0], bitBits[1]);



            // System.out.printf("%s : %s\n", paramName, paramValue);
        }
        // 압축해제 끝

        String queryString2 = "id=1&memberId=3&boardId=3&hit=53";

        Map<String, String> params2 = new LinkedHashMap<>();
        // LinkedHashMap : 순서를 보장

        // 압축해제 시작
        String[] queryStrignBits2 = queryString2.split("&");

        for(String bit : queryStrignBits2) {
            String[] bitBits = bit.split("=");
            params2.put(bitBits[0], bitBits[1]);



            // System.out.printf("%s : %s\n", paramName, paramValue);
        }
        // 압축해제 끝


        System.out.println("== 반복문을 이용한 순회 출력 ==");
        for(String paramName : params.keySet()) {
            String paramValue = params.get(paramName);

            System.out.printf("%s : %s\n", paramName, paramValue);
        }

        System.out.println("== 반복문을 이용한 순회 출력2 ==");
        for(String paramName : params2.keySet()) {
            String paramValue = params2.get(paramName);

            System.out.printf("%s : %s\n", paramName, paramValue);
        }
    }
}
