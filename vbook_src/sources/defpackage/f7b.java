package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f7b  reason: default package */
/* loaded from: classes.dex */
public final class f7b extends mq7 implements zj3, wx1 {
    public btd K;
    public o7b L;
    public final ljc M;
    public final ljc N;

    public f7b(btd btdVar, o7b o7bVar) {
        o7bVar.getClass();
        this.K = btdVar;
        this.L = o7bVar;
        ljc c = lre.c();
        ((Paint) c.b).setAntiAlias(true);
        this.M = c;
        ljc c2 = lre.c();
        c2.x(1);
        this.N = c2;
    }

    public final boolean H1(k61 k61Var, a9c a9cVar, boolean z) {
        int i;
        l8c l8cVar = a9cVar.d;
        if (l8cVar != null) {
            if (l8cVar.b()) {
                l8cVar = null;
            }
            if (l8cVar != null) {
                jj jjVar = ((pw1) l8cVar).b;
                Bitmap bitmap = jjVar.a;
                uy5 v = dye.v(a9cVar.b);
                this.M.n(a9cVar.g / 255.0f);
                k61Var.a(jjVar, 0L, (bitmap.getWidth() << 32) | (bitmap.getHeight() & 4294967295L), v.d(), v.c(), this.M);
                if (z) {
                    int i2 = a9cVar.e;
                    int i3 = a9cVar.f;
                    if (i2 == 2) {
                        if (i3 == 1) {
                            i = -16711936;
                        } else {
                            i = -16724737;
                        }
                    } else if (i2 == 1) {
                        i = -256;
                    } else {
                        i = -65536;
                    }
                    this.N.p(sve.b(i));
                    k61Var.g(v.a, v.b, v.c, v.d, this.N);
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [xl9, java.lang.Object] */
    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        List<a9c> list;
        boolean z;
        boolean z2;
        qd6Var.a();
        if (!yw1.a(((zy5) this.K.d.getValue()).a) && !yw1.a(this.K.f())) {
            List list2 = (List) this.L.L.getValue();
            uy5 uy5Var = null;
            if (!list2.isEmpty()) {
                list = list2;
            } else {
                list = null;
            }
            if (list != null) {
                uy5 uy5Var2 = (uy5) this.L.K.getValue();
                if (!uy5Var2.f()) {
                    uy5Var = uy5Var2;
                }
                if (uy5Var != null) {
                    int i = uy5Var.a;
                    int i2 = uy5Var.b;
                    int i3 = uy5Var.c;
                    int i4 = uy5Var.d;
                    List<a9c> list3 = (List) this.L.M.getValue();
                    boolean booleanValue = ((Boolean) this.L.F.getValue()).booleanValue();
                    k61 w = qd6Var.a.b.w();
                    ?? obj = new Object();
                    ?? obj2 = new Object();
                    ?? obj3 = new Object();
                    ?? obj4 = new Object();
                    for (a9c a9cVar : list3) {
                        vy5 vy5Var = a9cVar.b;
                        if (vy5Var.c > i && i3 > vy5Var.a && vy5Var.d > i2 && i4 > vy5Var.b) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2 && H1(w, a9cVar, false)) {
                            obj.a++;
                        }
                    }
                    this.N.w(((r13) nye.q(this, dy1.h)).f() * 0.5f);
                    for (a9c a9cVar2 : list) {
                        vy5 vy5Var2 = a9cVar2.b;
                        if (vy5Var2.c > i && i3 > vy5Var2.a && vy5Var2.d > i2 && i4 > vy5Var2.b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            obj2.a++;
                            if (H1(w, a9cVar2, booleanValue)) {
                                obj4.a++;
                            }
                        } else {
                            obj3.a++;
                        }
                    }
                    qw6 qw6Var = this.L.f;
                    le1 le1Var = new le1(list, (Object) obj2, (Object) obj3, (Object) obj4, (Object) obj, this, 7);
                    qw6Var.getClass();
                    qw6Var.b(mw6.a, le1Var);
                }
            }
        }
    }
}
