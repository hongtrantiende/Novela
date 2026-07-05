package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: at4  reason: default package */
/* loaded from: classes3.dex */
public abstract class at4 {
    public final et4 a;
    public final byte[] b;

    public at4(et4 et4Var, byte[] bArr) {
        this.a = et4Var;
        this.b = bArr;
        ByteBuffer.wrap(bArr).getClass();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame ");
        sb.append(this.a);
        sb.append(" (fin=true, buffer len = ");
        return hl5.p(sb, this.b.length, ')');
    }
}
