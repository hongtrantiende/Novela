package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dt1  reason: default package */
/* loaded from: classes3.dex */
public final class dt1 {
    public final Object a;
    public final a61 b;
    public final mu4 c;
    public final Object d;
    public final Throwable e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ dt1(java.lang.Object r3, defpackage.a61 r4, defpackage.mu4 r5, java.lang.Throwable r6, int r7) {
        /*
            r2 = this;
            r0 = r7 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r7 & 4
            if (r0 == 0) goto Lb
            r5 = r1
        Lb:
            r7 = r7 & 16
            if (r7 == 0) goto L11
            r7 = r1
            goto L12
        L11:
            r7 = r6
        L12:
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt1.<init>(java.lang.Object, a61, mu4, java.lang.Throwable, int):void");
    }

    public static dt1 a(dt1 dt1Var, a61 a61Var, Throwable th, int i) {
        Object obj = dt1Var.a;
        if ((i & 2) != 0) {
            a61Var = dt1Var.b;
        }
        a61 a61Var2 = a61Var;
        mu4 mu4Var = dt1Var.c;
        Object obj2 = dt1Var.d;
        if ((i & 16) != 0) {
            th = dt1Var.e;
        }
        return new dt1(obj, a61Var2, mu4Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt1)) {
            return false;
        }
        dt1 dt1Var = (dt1) obj;
        if (c16.i(this.a, dt1Var.a) && c16.i(this.b, dt1Var.b) && c16.i(this.c, dt1Var.c) && c16.i(this.d, dt1Var.d) && c16.i(this.e, dt1Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        a61 a61Var = this.b;
        if (a61Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = a61Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        mu4 mu4Var = this.c;
        if (mu4Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = mu4Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public dt1(Object obj, a61 a61Var, mu4 mu4Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = a61Var;
        this.c = mu4Var;
        this.d = obj2;
        this.e = th;
    }
}
