package info.learn;

import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import static java.time.ZoneOffset.UTC;

public class Test
{
    private static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final String QUALTRICS_DATETIME_PATTERN = "uuuu-MM-dd'T'HH:mm:ssX";
    private static final Map<String, Boolean> map;

    // Instantiating the static map
    static {
        map = new LinkedHashMap<>();
        map.put("OWNER", true);
        map.put("APPROVER", true);
    }

    public static void main(String[] args) throws ParseException
    {
        boolean test = false;
        System.out.println(test);

        System.out.println(!test);
    }

    public static void getEncodedUser()
    {
        String userIdCode = """
     {
         "email":"collab.api.user@sap.com",
         "givenName":"Collab API",
         "familyName":"USER",
         "userUuid":"ad8a4ceb-2c4f-4c86-8dc6-db1471b95dc7",
         "scimId":"ad8a4ceb-2c4f-4c86-8dc6-db1471b95dc7"
      }
    """;
        System.out.println(Base64.getEncoder().encodeToString(userIdCode.getBytes()));
    }

    private static void toFilterSetOfStringWithList()
    {
        Map<String, List<String>> setOfString = new HashMap<>();
        setOfString.put("PLANT", null);
        setOfString.put("MATERIAL_GROUP", Arrays.asList("M001", "M002"));
        setOfString.put("GOPAL", null);
        System.out.println("Before " + setOfString);
        setOfString =
            setOfString.entrySet().stream()
                .filter(map -> isNotEmpty(map.getValue()))
                .filter(str -> EnumSample.getAllEntityTypes().anyMatch(
                    enumSample -> enumSample.getName().equals(str.getKey())))
                .collect(Collectors.toMap(data -> data.getKey(), data -> data.getValue()));

        System.out.println("After " + setOfString);
    }

    public static boolean isNotEmpty(Collection<?> coll)
    {
        return !isEmpty(coll);
    }

    public static boolean isEmpty(Collection<?> coll)
    {
        return coll == null || coll.isEmpty();
    }


    public static Instant getUTCTime(String date)
    {
        return LocalDateTime.parse(date, DateTimeFormatter.ofPattern(DATE_TIME_FORMAT)).toInstant(
            UTC);
    }

    private static String toCamelCaseWord(String text)
    {
        return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
    }

    public static List<String> filterList(List<String> lst)
    {
        return lst.stream().filter(a -> "GOPAL".equals(a)).collect(Collectors.toList());
    }
}

