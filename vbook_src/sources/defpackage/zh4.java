package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zh4  reason: default package */
/* loaded from: classes.dex */
public final class zh4 implements r94 {
    public t94 e;
    public fjc f;
    public tb7 h;
    public bi4 i;
    public int j;
    public int k;
    public yh4 l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final km8 b = new km8(new byte[32768], 0);
    public final boolean c = false;
    public final fr2 d = new Object();
    public int g = 0;

    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    @Override // defpackage.r94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.s94 r32, defpackage.fr2 r33) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh4.b(s94, fr2):int");
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        tb7 l0 = new fz4(21).l0(s94Var, vk5.i, 0);
        if (l0 != null) {
            int length = l0.a.length;
        }
        km8 km8Var = new km8(4);
        ((tt2) s94Var).f(km8Var.a, 0, 4, false);
        if (km8Var.B() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.g = 0;
        } else {
            yh4 yh4Var = this.l;
            if (yh4Var != null) {
                yh4Var.d(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.n = j3;
        this.m = 0;
        this.b.J(0);
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        this.e = t94Var;
        this.f = t94Var.s(0, 1);
        t94Var.m();
    }

    @Override // defpackage.r94
    public final void a() {
    }
}
