import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Arrays;
import java.util.Map;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {


    // 사용자 인덱스 + 신고 횟수
    Map<String, Integer> userIndex = new HashMap<>();
    for (int i = 0; i < id_list.length; i++) {
        userIndex.put(id_list[i], i);
    }

    // 신고목록
    Map<String, Set<String>> reports = new HashMap<>();
    for (String r : report) {
        String[] users = r.split(" ");
        String reporter = users[0];
        String reportedUser = users[1];

        reports.computeIfAbsent(reportedUser, key -> new HashSet<>())
               .add(reporter);
    }


    int[] answer = new int[id_list.length];
    for (String user : reports.keySet()) {
        if (reports.get(user).size() >= k) {
            for (String reporter : reports.get(user)) {
                answer[userIndex.get(reporter)]++;
            }
        }
    }

        return answer;
    }    

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {
            "muzi frodo",
            "apeach frodo",
            "frodo neo",
            "muzi neo",
            "apeach muzi"
        };

        System.out.println(Arrays.toString(solution.solution(id_list, report, 2)));

    }
}
