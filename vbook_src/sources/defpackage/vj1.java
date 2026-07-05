package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vj1  reason: default package */
/* loaded from: classes.dex */
public final class vj1 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vj1(long r4, long r6, int r8) {
        /*
            r3 = this;
            if (r8 == 0) goto L37
            r0 = 1
            if (r8 == r0) goto L34
            r1 = 2
            if (r8 == r1) goto Lb
            java.lang.String r4 = "unknown"
            goto L39
        Lb:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 == 0) goto L19
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 == 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            defpackage.wq9.D(r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "start exceeds end. Start time: "
            r8.<init>(r0)
            r8.append(r4)
            java.lang.String r4 = ", End time: "
            r8.append(r4)
            r8.append(r6)
            java.lang.String r4 = r8.toString()
            goto L39
        L34:
            java.lang.String r4 = "not seekable to start"
            goto L39
        L37:
            java.lang.String r4 = "invalid period count"
        L39:
            java.lang.String r5 = "Illegal clipping: "
            java.lang.String r4 = r5.concat(r4)
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj1.<init>(long, long, int):void");
    }

    public vj1(int i) {
        this(-9223372036854775807L, -9223372036854775807L, i);
    }
}
