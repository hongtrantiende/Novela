package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pyb  reason: default package */
/* loaded from: classes.dex */
public final class pyb {
    public final boolean a;
    public final Object b;
    public final ky5 c;
    public int d;
    public int e;

    public pyb(pyb pybVar, boolean z) {
        ky5 ky5Var;
        ky5 ky5Var2;
        this.a = z;
        this.b = new Object();
        if (pybVar != null && (ky5Var2 = pybVar.c) != null) {
            ky5Var2.e();
            ky5Var = new ky5(ky5Var2);
        } else {
            ky5Var = new ky5(null);
        }
        this.c = ky5Var;
        if (pybVar != null) {
            this.d = pybVar.d;
            this.e = pybVar.e;
            return;
        }
        this.d = 0;
        this.e = 1000;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r19) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyb.a(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r19) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyb.b(int):void");
    }

    public final int c() {
        return this.e - this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyb)) {
            return false;
        }
        pyb pybVar = (pyb) obj;
        if (this.d != pybVar.d || this.e != pybVar.e) {
            return false;
        }
        return c16.i(this.c, pybVar.c);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.d) * 31) + this.e;
    }

    public /* synthetic */ pyb(pyb pybVar, int i) {
        this((i & 1) != 0 ? null : pybVar, true);
    }
}
