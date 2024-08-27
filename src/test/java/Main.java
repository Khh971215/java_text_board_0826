import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 문제점 : 현재 우리 파싱로직은 유연하지 못한다.
        // 왜? 파라미터가 추가되면 추가 된 내용에 대해서 추가 작업을 해줘야 하기 때문에..
        String queryString = "hit=73&id=3&memberId=13&boardId=2";

        // 압축해제 시작
        String[] queryStrignBits = queryString.split("&");
        /*
        for(String bit : queryStrignBits) {
            System.out.println(bit);
        }
        */
        List<String> paramNames = new ArrayList<>();
        List<Integer> paramValues = new ArrayList<>();

        for(String bit : queryStrignBits) {
            String[] bitBits = bit.split("=");
            String paramName = bitBits[0];
            String paramValue = bitBits[1];

            paramNames.add(paramName);
            paramValues.add(Integer.parseInt(paramValue));

            // System.out.printf("%s : %s\n", paramName, paramValue);
        }
        // 압축해제 끝
        System.out.println(paramNames);
        int boardIdIndex = paramNames.indexOf("boardId");
        System.out.println("boardId : " + paramValues.get(boardIdIndex));
    }
}
