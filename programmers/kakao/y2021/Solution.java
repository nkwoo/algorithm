package kakao.y2021;

public class Solution {
    public String solution(String new_id) {
        return verifyUserId(new_id);
    }

    private String verifyUserId(String userId) {
        userId = toLowerUserId(userId);

        userId = replaceCharacter(userId,"[^a-z0-9-_.]", "");

        userId = replaceCharacter(userId,"[.]+", ".");

        userId = removeStartEndWithDot(userId);

        userId = checkEmptyString(userId);

        userId = substringBy16(userId);

        userId = appendUserId(userId);

        return userId;
    }

    private String toLowerUserId(String userId) {
        return userId.toLowerCase();
    }

    private String replaceCharacter(String userId, String regex, String exchangeString) {
        return userId.replaceAll(regex, exchangeString);
    }

    private String removeStartEndWithDot(String userId) {
        return userId.startsWith(".") ? userId.substring(1) : userId.endsWith(".") ? userId.substring(0, userId.length() - 1) : userId;
    }

    private String checkEmptyString(String userId) {
        return "".equals(userId) ? "a" : userId;
    }

    private String substringBy16(String userId) {
        return removeStartEndWithDot(userId.length() > 15 ? userId.substring(0, 15) : userId);
    }

    private String appendUserId(String userId) {
        return userId.length() < 3 ? appendUserId(userId + userId.substring(userId.length() - 1)) : userId;
    }
}