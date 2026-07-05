package defpackage;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v56  reason: default package */
/* loaded from: classes3.dex */
public final class v56 {
    public final Charset a;

    public v56(Charset charset) {
        this.a = charset;
    }

    public final String a(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, this.a);
    }

    public final String b() {
        String name = this.a.name();
        name.getClass();
        return name;
    }
}
