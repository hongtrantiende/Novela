package defpackage;

import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: am4  reason: default package */
/* loaded from: classes.dex */
public final class am4 implements r94 {
    public final km8 a = new km8(4);
    public final km8 b = new km8(9);
    public final km8 c = new km8(11);
    public final km8 d = new km8();
    public final n1a e;
    public t94 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public h60 o;
    public jbd p;

    /* JADX WARN: Type inference failed for: r0v4, types: [c3e, n1a] */
    public am4() {
        ?? c3eVar = new c3e(new n73());
        c3eVar.b = -9223372036854775807L;
        c3eVar.c = new long[0];
        c3eVar.d = new long[0];
        this.e = c3eVar;
        this.g = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029d  */
    /* JADX WARN: Type inference failed for: r4v44, types: [h60, c3e] */
    @Override // defpackage.r94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.s94 r36, defpackage.fr2 r37) {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am4.b(s94, fr2):int");
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        km8 km8Var = this.a;
        tt2 tt2Var = (tt2) s94Var;
        tt2Var.f(km8Var.a, 0, 3, false);
        km8Var.M(0);
        if (km8Var.C() == 4607062) {
            tt2Var.f(km8Var.a, 0, 2, false);
            km8Var.M(0);
            if ((km8Var.G() & Context.VERSION_ECMASCRIPT) == 0) {
                tt2Var.f(km8Var.a, 0, 4, false);
                km8Var.M(0);
                int m = km8Var.m();
                tt2Var.f = 0;
                tt2Var.b(m, false);
                tt2Var.f(km8Var.a, 0, 4, false);
                km8Var.M(0);
                if (km8Var.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        this.f = t94Var;
    }

    public final km8 g(s94 s94Var) {
        int i = this.l;
        km8 km8Var = this.d;
        byte[] bArr = km8Var.a;
        if (i > bArr.length) {
            km8Var.K(new byte[Math.max(bArr.length * 2, i)], 0);
        } else {
            km8Var.M(0);
        }
        km8Var.L(this.l);
        s94Var.readFully(km8Var.a, 0, this.l);
        return km8Var;
    }

    @Override // defpackage.r94
    public final void a() {
    }
}
