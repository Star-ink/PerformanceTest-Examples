/**********************************************************\
|                                                          |
|                          hprose                          |
|                                                          |
| Official WebSite: http://www.hprose.com/                 |
|                   http://www.hprose.org/                 |
|                                                          |
\**********************************************************/
/**********************************************************\
 *                                                        *
 * StringBufferArrayUnserializer.java                     *
 *                                                        *
 * StringBuffer array unserializer class for Java.        *
 *                                                        *
 * LastModified: Apr 22, 2015                             *
 * Author: Ma Bingyao <andot@hprose.com>                  *
 *                                                        *
\**********************************************************/

package hprose.io.unserialize;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;

final class StringBufferArrayUnserializer implements HproseUnserializer {

    public final static HproseUnserializer instance = new StringBufferArrayUnserializer();

    public final Object read(HproseReader reader, ByteBuffer buffer, Class<?> cls, Type type) throws IOException {
        return reader.readStringBufferArray(buffer);
    }

    public final Object read(HproseReader reader, InputStream stream, Class<?> cls, Type type) throws IOException {
        return reader.readStringBufferArray(stream);
    }

}
