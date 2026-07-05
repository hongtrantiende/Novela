package defpackage;

import android.os.Bundle;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pz3  reason: default package */
/* loaded from: classes.dex */
public final class pz3 extends Exception {
    public final int C;
    public final e67 D;
    public final boolean E;
    public final int a;
    public final long b;
    public final int c;
    public final String d;
    public final int e;
    public final vq4 f;

    static {
        a82.s(0, 1, 2, 3, 4);
        a2d.K(5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pz3(int r14, java.lang.Exception r15, int r16, java.lang.String r17, int r18, defpackage.vq4 r19, int r20, defpackage.e67 r21, boolean r22) {
        /*
            r13 = this;
            r8 = r20
            r0 = 0
            if (r14 == 0) goto L62
            r1 = 3
            r2 = 1
            if (r14 == r2) goto L17
            if (r14 == r1) goto L14
            java.lang.String r1 = "Unexpected runtime error"
        Ld:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L6a
        L14:
            java.lang.String r1 = "Remote error"
            goto Ld
        L17:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r5 = r17
            r3.append(r5)
            java.lang.String r4 = " error, index="
            r3.append(r4)
            r6 = r18
            r3.append(r6)
            java.lang.String r4 = ", format="
            r3.append(r4)
            r7 = r19
            r3.append(r7)
            java.lang.String r4 = ", format_supported="
            r3.append(r4)
            java.lang.String r4 = defpackage.a2d.a
            if (r8 == 0) goto L58
            if (r8 == r2) goto L55
            r2 = 2
            if (r8 == r2) goto L52
            if (r8 == r1) goto L4f
            r1 = 4
            if (r8 != r1) goto L4b
            java.lang.String r1 = "YES"
            goto L5a
        L4b:
            defpackage.vm1.d()
            throw r0
        L4f:
            java.lang.String r1 = "NO_EXCEEDS_CAPABILITIES"
            goto L5a
        L52:
            java.lang.String r1 = "NO_UNSUPPORTED_DRM"
            goto L5a
        L55:
            java.lang.String r1 = "NO_UNSUPPORTED_SUBTYPE"
            goto L5a
        L58:
            java.lang.String r1 = "NO"
        L5a:
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L6a
        L62:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r1 = "Source error"
        L6a:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L76
            java.lang.String r0 = ": null"
            java.lang.String r1 = r1.concat(r0)
        L76:
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r4 = r14
            r2 = r15
            r3 = r16
            r9 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz3.<init>(int, java.lang.Exception, int, java.lang.String, int, vq4, int, e67, boolean):void");
    }

    public final pz3 a(e67 e67Var) {
        String message = getMessage();
        String str = a2d.a;
        return new pz3(message, getCause(), this.a, this.c, this.d, this.e, this.f, this.C, e67Var, this.b, this.E);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz3(String str, Throwable th, int i, int i2, String str2, int i3, vq4 vq4Var, int i4, e67 e67Var, long j, boolean z) {
        super(str, th);
        Bundle bundle = Bundle.EMPTY;
        this.a = i;
        this.b = j;
        boolean z2 = false;
        wq9.s(!z || i2 == 1);
        wq9.s((th != null || i2 == 3) ? true : z2);
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = vq4Var;
        this.C = i4;
        this.D = e67Var;
        this.E = z;
    }

    public pz3(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
