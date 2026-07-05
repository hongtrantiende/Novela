package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nh5  reason: default package */
/* loaded from: classes3.dex */
public final class nh5 extends IOException implements c72 {
    public final String a;
    public final Long b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nh5(java.lang.String r3, java.lang.Long r4, java.lang.Throwable r5) {
        /*
            r2 = this;
            r3.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Request timeout has expired [url="
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", request_timeout="
            r0.append(r1)
            if (r4 != 0) goto L17
            java.lang.String r1 = "unknown"
            goto L18
        L17:
            r1 = r4
        L18:
            r0.append(r1)
            java.lang.String r1 = " ms]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r5)
            r2.a = r3
            r2.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh5.<init>(java.lang.String, java.lang.Long, java.lang.Throwable):void");
    }

    @Override // defpackage.c72
    public final Throwable a() {
        return new nh5(this.a, this.b, getCause());
    }
}
