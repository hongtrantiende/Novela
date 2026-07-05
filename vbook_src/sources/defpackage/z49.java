package defpackage;

import android.os.Trace;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z49  reason: default package */
/* loaded from: classes.dex */
public final class z49 implements di6 {
    public final int a;
    public final zg4 b;
    public final xt4 c;
    public x02 d;
    public m6b e;
    public l6b f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public y49 l;
    public boolean m;
    public long n;
    public long o;
    public long p = yq7.a();
    public boolean q;
    public final /* synthetic */ o40 r;

    public z49(o40 o40Var, int i, zg4 zg4Var, xt4 xt4Var) {
        this.r = o40Var;
        this.a = i;
        this.b = zg4Var;
        this.c = xt4Var;
    }

    @Override // defpackage.di6
    public final void a() {
        this.m = true;
    }

    public final void b() {
        l6b l6bVar = this.f;
        if (l6bVar != null) {
            l6bVar.cancel();
        }
        this.f = null;
        m6b m6bVar = this.e;
        if (m6bVar != null) {
            m6bVar.a();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(n8b n8bVar) {
        boolean d;
        if (!this.r.a) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                d = d(n8bVar);
            } finally {
                Trace.endSection();
            }
        } else {
            d = d(n8bVar);
        }
        ff.G(-1L, "compose:lazy:prefetch:execute:item");
        return d;
    }

    @Override // defpackage.di6
    public final void cancel() {
        if (!this.h) {
            this.h = true;
            b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e6 A[Catch: all -> 0x01ff, LOOP:2: B:97:0x01ba->B:111:0x01e6, LOOP_END, TRY_ENTER, TryCatch #5 {all -> 0x01ff, blocks: (B:82:0x0173, B:84:0x017b, B:86:0x0181, B:91:0x018f, B:93:0x019b, B:95:0x01b1, B:94:0x019e, B:96:0x01b3, B:97:0x01ba, B:99:0x01c2, B:105:0x01d3, B:107:0x01d8, B:111:0x01e6, B:112:0x01ec), top: B:186:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r9v18, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [ee0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.n8b r22) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z49.d(n8b):boolean");
    }

    public final boolean e() {
        l6b l6bVar;
        if (this.i || ((l6bVar = this.f) != null && l6bVar.i())) {
            return true;
        }
        return false;
    }

    public final void f(Object obj, Object obj2, ee0 ee0Var) {
        l6b s26Var;
        l6b l6bVar = this.f;
        if (l6bVar == null) {
            o40 o40Var = this.r;
            lu4 a = ((sh6) o40Var.b).a(this.a, obj, obj2);
            be6 a2 = ((o6b) o40Var.c).a();
            if (!a2.a.J()) {
                s26Var = new eb5(3, a2, obj);
            } else {
                a2.l(obj, a, true);
                s26Var = new s26(1, a2, obj);
            }
            l6bVar = s26Var;
            this.f = l6bVar;
            this.j = obj;
        }
        this.q = false;
        while (!l6bVar.i() && !this.q) {
            l6bVar.b(new iu1(11, this, ee0Var));
        }
        h();
        boolean z = this.q;
        long j = this.o;
        if (z) {
            ee0Var.b = ee0.a(j, ee0Var.b);
        } else {
            ee0Var.a = ee0.a(j, ee0Var.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        if (j > j2) {
            return true;
        }
        return false;
    }

    public final void h() {
        long a = yq7.a();
        long b = u9c.b(a, this.p);
        long j = b >> 1;
        hq7 hq7Var = wl3.b;
        if ((((int) b) & 1) != 0) {
            if (j > 9223372036854L) {
                j = Long.MAX_VALUE;
            } else if (j < -9223372036854L) {
                j = Long.MIN_VALUE;
            } else {
                j *= 1000000;
            }
        }
        this.o = j;
        long j2 = this.n - j;
        this.n = j2;
        this.p = a;
        ff.G(j2, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        x02 x02Var = this.d;
        boolean e = e();
        boolean z = this.g;
        boolean z2 = this.h;
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append(x02Var);
        sb.append(", isComposed = ");
        rs8.z(sb, e, ", isMeasured = ", z, ", isCanceled = ");
        return rs8.m(" }", sb, z2);
    }
}
