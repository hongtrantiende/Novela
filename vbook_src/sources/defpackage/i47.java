package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i47  reason: default package */
/* loaded from: classes.dex */
public final class i47 extends Exception {
    public final String a;
    public final boolean b;
    public final h47 c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i47(defpackage.vq4 r10, defpackage.m47 r11, boolean r12, int r13) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Decoder init failed: ["
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r1 = "], "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r3 = r0.toString()
            java.lang.String r5 = r10.o
            if (r13 >= 0) goto L1d
            java.lang.String r10 = "neg_"
            goto L1f
        L1d:
            java.lang.String r10 = ""
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_"
            r0.<init>(r1)
            r0.append(r10)
            int r10 = java.lang.Math.abs(r13)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            r7 = 0
            r2 = r9
            r4 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i47.<init>(vq4, m47, boolean, int):void");
    }

    public i47(String str, Throwable th, String str2, boolean z, h47 h47Var, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = h47Var;
        this.d = str3;
    }
}
