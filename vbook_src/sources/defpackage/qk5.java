package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qk5  reason: default package */
/* loaded from: classes.dex */
public final class qk5 extends jsc {
    public static final Pattern j = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder h = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder i = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // defpackage.jsc
    public final tb7 B(vb7 vb7Var, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.i;
        CharsetDecoder charsetDecoder2 = this.h;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new tb7(new sk5(null, null, bArr));
        }
        Matcher matcher = j.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String B = kve.B(group);
                B.getClass();
                if (!B.equals("streamurl")) {
                    if (B.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new tb7(new sk5(str2, str3, bArr));
    }
}
