package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e7b  reason: default package */
/* loaded from: classes.dex */
public final class e7b extends mq7 implements zj3, wx1 {
    public btd K;
    public o7b L;
    public final ljc M;

    public e7b(btd btdVar, o7b o7bVar) {
        o7bVar.getClass();
        this.K = btdVar;
        this.L = o7bVar;
        ljc c = lre.c();
        ((Paint) c.b).setAntiAlias(false);
        this.M = c;
    }

    public final boolean H1(k61 k61Var, a9c a9cVar) {
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
                int width = bitmap.getWidth();
                k61Var.a(jjVar, 0L, (bitmap.getHeight() & 4294967295L) | (width << 32), v.d(), v.c(), this.M);
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [xl9, java.lang.Object] */
    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        List<a9c> list;
        boolean z;
        boolean z2;
        qd6Var.a();
        long j = ((zy5) this.K.d.getValue()).a;
        if (((int) (j >> 32)) > 0 && ((int) (j & 4294967295L)) > 0) {
            long f = this.K.f();
            if (((int) (f >> 32)) > 0 && ((int) (f & 4294967295L)) > 0) {
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
                            if (z2 && H1(w, a9cVar)) {
                                obj.a++;
                            }
                        }
                        for (a9c a9cVar2 : list) {
                            vy5 vy5Var2 = a9cVar2.b;
                            if (vy5Var2.c > i && i3 > vy5Var2.a && vy5Var2.d > i2 && i4 > vy5Var2.b) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                obj2.a++;
                                if (H1(w, a9cVar2)) {
                                    obj4.a++;
                                }
                            } else {
                                obj3.a++;
                            }
                        }
                        qw6 qw6Var = this.L.f;
                        le1 le1Var = new le1(list, (Object) obj2, (Object) obj3, (Object) obj4, (Object) obj, this, 6);
                        qw6Var.getClass();
                        qw6Var.b(mw6.a, le1Var);
                    }
                }
            }
        }
    }
}
