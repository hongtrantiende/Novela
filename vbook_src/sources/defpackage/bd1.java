package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bd1  reason: default package */
/* loaded from: classes.dex */
public final class bd1 {
    public final ln0 a;
    public final CharsetDecoder b;
    public final ByteBuffer c;
    public boolean d;
    public char e;

    public bd1(ln0 ln0Var, Charset charset) {
        Object removeLast;
        byte[] bArr;
        charset.getClass();
        this.a = ln0Var;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        onUnmappableCharacter.getClass();
        this.b = onUnmappableCharacter;
        q01 q01Var = q01.b;
        synchronized (q01Var) {
            rz rzVar = q01Var.a;
            if (rzVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = rzVar.removeLast();
            }
            byte[] bArr2 = (byte[]) removeLast;
            bArr = bArr2 != null ? bArr2 : null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr == null ? new byte[8196] : bArr);
        wrap.getClass();
        this.c = wrap;
        wrap.flip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d3, code lost:
        r2 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(char[] r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd1.a(char[], int, int):int");
    }
}
