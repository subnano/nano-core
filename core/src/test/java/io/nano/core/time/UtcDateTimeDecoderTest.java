package io.nano.core.time;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class UtcDateTimeDecoderTest {

    private ByteBuffer buffer;
    private DateFormat formatter;

    @BeforeEach
    void setUp() {
        buffer = ByteBuffer.allocate(32);
        formatter = new SimpleDateFormat("yyyyMMdd-HH:mm:ss.SSS");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Test
    void decodeRegularDateTime() throws Exception {
        assertDateTimeDecoding("20180809-09:23:09.430");
    }

    @Test
    void decodeEpoch() throws Exception {
        assertDateTimeDecoding("19700101-00:00:00.000");
    }

    @Test
    void decodeMillenium() throws Exception {
        assertDateTimeDecoding("20000101-00:00:00.001");
    }
    @Test
    void decodeLeapYear() throws Exception {
        assertDateTimeDecoding("20200229-14:56:12.987");
    }

    private void assertDateTimeDecoding(String expected) throws Exception {
        long expectedMillis = formatter.parse(expected).getTime();
        buffer.clear();
        buffer.put(expected.getBytes(StandardCharsets.US_ASCII), 0, expected.length());
        long epochMillis = UtcDateTimeDecoder.decode(buffer, 0);
        Assertions.assertThat(epochMillis).isEqualTo(expectedMillis);
    }

}