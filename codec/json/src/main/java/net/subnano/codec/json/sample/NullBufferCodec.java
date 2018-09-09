package net.subnano.codec.json.sample;

import net.subnano.codec.json.JsonByteParser;
import net.subnano.codec.json.JsonVisitor;
import net.subnano.codec.json.NullJsonVisitor;

import java.nio.ByteBuffer;

/**
 * @author Mark Wardell
 */
public class NullBufferCodec {

    private final JsonByteParser parser = new JsonByteParser();
    private final JsonVisitor visitor = new NullJsonVisitor();

    public void decode(ByteBuffer buffer) {
        parser.parse(buffer, visitor);
    }

}
