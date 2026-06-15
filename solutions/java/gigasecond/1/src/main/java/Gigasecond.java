import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    private long gigaSec = (long) Math.pow(10,9);
    private LocalDateTime dt = null;
    
    public Gigasecond(LocalDate moment) {
        LocalDateTime momentDateTime = moment.atStartOfDay();
        dt = momentDateTime.plusSeconds(gigaSec);
    }

    public Gigasecond(LocalDateTime moment) {
        dt = moment.plusSeconds(gigaSec);
    }

    public LocalDateTime getDateTime() {
        return dt;
    }
}
