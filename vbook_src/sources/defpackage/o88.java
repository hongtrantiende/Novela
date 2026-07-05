package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o88  reason: default package */
/* loaded from: classes.dex */
public final class o88 implements r94 {
    public t94 a;
    public j1b b;
    public boolean c;

    /* JADX WARN: Removed duplicated region for block: B:70:0x0170 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
    @Override // defpackage.r94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.s94 r21, defpackage.fr2 r22) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o88.b(s94, fr2):int");
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        try {
            return g(s94Var);
        } catch (xm8 unused) {
            return false;
        }
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        j1b j1bVar = this.b;
        if (j1bVar != null) {
            q88 q88Var = j1bVar.a;
            r88 r88Var = q88Var.a;
            r88Var.a = 0;
            r88Var.b = 0L;
            r88Var.c = 0;
            r88Var.d = 0;
            r88Var.e = 0;
            q88Var.b.J(0);
            q88Var.c = -1;
            q88Var.e = false;
            if (j == 0) {
                j1bVar.d(!j1bVar.l);
            } else if (j1bVar.h != 0) {
                long j3 = (j1bVar.i * j2) / 1000000;
                j1bVar.e = j3;
                s88 s88Var = j1bVar.d;
                String str = a2d.a;
                s88Var.f(j3);
                j1bVar.h = 2;
            }
        }
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        this.a = t94Var;
    }

    public final boolean g(s94 s94Var) {
        boolean z;
        r88 r88Var = new r88();
        if (r88Var.a(s94Var, true) && (r88Var.a & 2) == 2) {
            int min = Math.min(r88Var.e, 8);
            km8 km8Var = new km8(min);
            s94Var.x(km8Var.a, 0, min);
            km8Var.M(0);
            if (km8Var.a() >= 5 && km8Var.z() == 127 && km8Var.B() == 1179402563) {
                this.b = new j1b();
                return true;
            }
            km8Var.M(0);
            try {
                z = oue.M(1, km8Var, true);
            } catch (xm8 unused) {
                z = false;
            }
            if (z) {
                this.b = new j1b();
            } else {
                km8Var.M(0);
                if (ye8.e(km8Var, ye8.o)) {
                    this.b = new j1b();
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.r94
    public final void a() {
    }
}
