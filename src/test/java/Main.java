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
        /*
        for(String bit : queryStrignBits) {
            System.out.println(bit);
        }
        */


        for(String bit : queryStrignBits) {
            String[] bitBits = bit.split("=");
            params.put(bitBits[0], bitBits[1]);



            // System.out.printf("%s : %s\n", paramName, paramValue);
        }
        // 압축해제 끝
        System.out.println("== 원하는 것을 하나하나 가져와서 사용 ==");
        System.out.printf("id : %d\n", Integer.parseInt(params.get("id")));
        System.out.printf("memberId : %d\n", Integer.parseInt(params.get("memberId")) );
        System.out.printf("boardId : %d\n", Integer.parseInt(params.get("boardId")));
        System.out.printf("hit : %d\n", Integer.parseInt(params.get("hit")));
        System.out.printf("writerName : %s\n", params.get("writerName"));


        System.out.println("== 반복문을 이용한 순회 출력 ==");
        for(String paramName : params.keySet()) {
            String paramValue = params.get(paramName);

            System.out.printf("%s : %s\n", paramName, paramValue);
        }
    }
}
