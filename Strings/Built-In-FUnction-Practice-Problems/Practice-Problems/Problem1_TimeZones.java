import java.time.*;
import java.time.format.DateTimeFormatter;

public class Problem1_TimeZones {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        ZonedDateTime nowGmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime nowIst = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); // IST
        ZonedDateTime nowPst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")); // PST (may show PDT depending on DST)

        System.out.println("Current Time in GMT: " + nowGmt.format(fmt));
        System.out.println("Current Time in IST: " + nowIst.format(fmt));
        System.out.println("Current Time in PST: " + nowPst.format(fmt));
    }
}
