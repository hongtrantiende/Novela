package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: he0  reason: default package */
/* loaded from: classes.dex */
public final class he0 implements r94 {
    public final km8 a;
    public final c4 b;
    public final boolean c;
    public final abf d;
    public int e;
    public t94 f;
    public ie0 g;
    public long h;
    public kh1[] i;
    public long j;
    public kh1 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    /* JADX WARN: Type inference failed for: r2v3, types: [c4, java.lang.Object] */
    public he0(int i, abf abfVar) {
        this.d = abfVar;
        this.c = (i & 1) == 0;
        this.a = new km8(12);
        this.b = new Object();
        this.f = new v28(0);
        this.i = new kh1[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010e  */
    @Override // defpackage.r94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.s94 r23, defpackage.fr2 r24) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he0.b(s94, fr2):int");
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        km8 km8Var = this.a;
        s94Var.x(km8Var.a, 0, 12);
        km8Var.M(0);
        if (km8Var.o() != 1179011410) {
            return false;
        }
        km8Var.N(4);
        if (km8Var.o() != 541677121) {
            return false;
        }
        return true;
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        kh1[] kh1VarArr;
        this.j = -1L;
        this.k = null;
        for (kh1 kh1Var : this.i) {
            if (kh1Var.k == 0) {
                kh1Var.i = 0;
            } else {
                kh1Var.i = kh1Var.n[a2d.f(kh1Var.m, j, true)];
            }
        }
        if (j == 0) {
            if (this.i.length == 0) {
                this.e = 0;
                return;
            } else {
                this.e = 3;
                return;
            }
        }
        this.e = 6;
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        this.e = 0;
        if (this.c) {
            t94Var = new o40(t94Var, this.d);
        }
        this.f = t94Var;
        this.j = -1L;
    }

    @Override // defpackage.r94
    public final void a() {
    }
}
