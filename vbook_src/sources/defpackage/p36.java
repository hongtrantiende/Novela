package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p36  reason: default package */
/* loaded from: classes.dex */
public final class p36 implements r94 {
    public t94 b;
    public int c;
    public int d;
    public int e;
    public pr7 g;
    public s94 h;
    public zg1 i;
    public ws7 j;
    public final km8 a = new km8(2);
    public long f = -1;

    @Override // defpackage.r94
    public final void a() {
        ws7 ws7Var = this.j;
        if (ws7Var != null) {
            ws7Var.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0189  */
    @Override // defpackage.r94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.s94 r26, defpackage.fr2 r27) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p36.b(s94, fr2):int");
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        String u;
        tt2 tt2Var = (tt2) s94Var;
        km8 km8Var = this.a;
        km8Var.J(2);
        tt2Var.f(km8Var.a, 0, 2, false);
        if (km8Var.G() == 65496) {
            while (true) {
                km8Var.J(2);
                tt2Var.f(km8Var.a, 0, 2, false);
                int G = km8Var.G();
                this.d = G;
                if (G == 65498) {
                    break;
                }
                km8Var.J(2);
                tt2Var.x(km8Var.a, 0, 2);
                int G2 = km8Var.G() - 2;
                if (G2 < 0) {
                    break;
                } else if (this.d != 65505) {
                    tt2Var.b(G2, false);
                } else {
                    km8Var.J(G2);
                    tt2Var.f(km8Var.a, 0, G2, false);
                    if (Objects.equals(km8Var.u(), "http://ns.adobe.com/xap/1.0/") && (u = km8Var.u()) != null) {
                        String[] strArr = ie2.k;
                        for (int i = 0; i < 4; i++) {
                            if (u.contains(strArr[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            ws7 ws7Var = this.j;
            ws7Var.getClass();
            ws7Var.d(j, j2);
        }
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        this.b = t94Var;
    }

    public final void g() {
        t94 t94Var = this.b;
        t94Var.getClass();
        t94Var.m();
        this.b.v(new ge0(-9223372036854775807L));
        this.c = 6;
    }
}
