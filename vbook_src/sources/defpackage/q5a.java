package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q5a  reason: default package */
/* loaded from: classes.dex */
public final class q5a {
    public final /* synthetic */ int a;
    public final List b;
    public final fjc[] c;
    public final t6f d;

    public q5a(int i, List list) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = list;
                this.c = new fjc[list.size()];
                t6f t6fVar = new t6f(new d89(this, 10));
                this.d = t6fVar;
                t6fVar.m(3);
                return;
            default:
                this.b = list;
                this.c = new fjc[list.size()];
                this.d = new t6f(new d89(this, 2));
                return;
        }
    }

    public void a(long j, km8 km8Var) {
        if (km8Var.a() >= 9) {
            int m = km8Var.m();
            int m2 = km8Var.m();
            int z = km8Var.z();
            if (m == 434 && m2 == 1195456820 && z == 3) {
                this.d.a(j, km8Var);
            }
        }
    }

    public final void b(t94 t94Var, zc7 zc7Var) {
        boolean z;
        boolean z2;
        int i = this.a;
        List list = this.b;
        fjc[] fjcVarArr = this.c;
        switch (i) {
            case 0:
                for (int i2 = 0; i2 < fjcVarArr.length; i2++) {
                    zc7Var.a();
                    zc7Var.b();
                    fjc s = t94Var.s(zc7Var.c, 3);
                    vq4 vq4Var = (vq4) list.get(i2);
                    String str = vq4Var.o;
                    if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    wq9.u(z, "Invalid closed caption MIME type provided: %s", str);
                    String str2 = vq4Var.a;
                    if (str2 == null) {
                        zc7Var.b();
                        str2 = (String) zc7Var.e;
                    }
                    uq4 uq4Var = new uq4();
                    uq4Var.a = str2;
                    uq4Var.m = lc7.p("video/mp2t");
                    uq4Var.n = lc7.p(str);
                    uq4Var.e = vq4Var.e;
                    uq4Var.d = vq4Var.d;
                    uq4Var.K = vq4Var.L;
                    uq4Var.q = vq4Var.r;
                    eub.t(uq4Var, s);
                    fjcVarArr[i2] = s;
                }
                return;
            default:
                for (int i3 = 0; i3 < fjcVarArr.length; i3++) {
                    zc7Var.a();
                    zc7Var.b();
                    fjc s2 = t94Var.s(zc7Var.c, 3);
                    vq4 vq4Var2 = (vq4) list.get(i3);
                    String str3 = vq4Var2.o;
                    if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    wq9.u(z2, "Invalid closed caption MIME type provided: %s", str3);
                    uq4 uq4Var2 = new uq4();
                    zc7Var.b();
                    uq4Var2.a = (String) zc7Var.e;
                    uq4Var2.m = lc7.p("video/mp2t");
                    uq4Var2.n = lc7.p(str3);
                    uq4Var2.e = vq4Var2.e;
                    uq4Var2.d = vq4Var2.d;
                    uq4Var2.K = vq4Var2.L;
                    uq4Var2.q = vq4Var2.r;
                    eub.t(uq4Var2, s2);
                    fjcVarArr[i3] = s2;
                }
                return;
        }
    }
}
