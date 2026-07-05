package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hy  reason: default package */
/* loaded from: classes.dex */
public final class hy {
    public final ArrayList a;

    public hy(ojc ojcVar) {
        ojcVar.getClass();
        String str = zld.a;
        m02 m02Var = ojcVar.b;
        b28 b28Var = ojcVar.d;
        ArrayList C = tl1.C(new uj0(m02Var, 0), new uj0(ojcVar.c), new uj0(ojcVar.e, 4));
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = ojcVar.a;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            C.add(new x18((ConnectivityManager) systemService));
        } else {
            b28Var.getClass();
            C.addAll(tl1.B(new uj0(b28Var, 2), new uj0(b28Var, 3), new u18(b28Var), new t18(b28Var)));
        }
        this.a = C;
    }

    public void a(xq4 xq4Var) {
        boolean z = xq4Var instanceof v38;
        ArrayList arrayList = this.a;
        if (z) {
            arrayList.add(xq4Var);
        } else if (xq4Var instanceof ny1) {
            for (v38 v38Var : ((ny1) xq4Var).a) {
                arrayList.add(v38Var);
            }
        } else {
            xk5.o();
        }
    }

    public void b() {
        this.a.add(nn8.c);
    }

    public void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new on8(f, f2, f3, f4, f5, f6));
    }

    public void d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new wn8(f, f2, f3, f4, f5, f6));
    }

    public void e(float f) {
        this.a.add(new pn8(f));
    }

    public void f(float f) {
        this.a.add(new xn8(f));
    }

    public void g(float f, float f2) {
        this.a.add(new qn8(f, f2));
    }

    public void h(float f, float f2) {
        this.a.add(new yn8(f, f2));
    }

    public void i(float f, float f2) {
        this.a.add(new rn8(f, f2));
    }

    public void j(float f, float f2) {
        this.a.add(new zn8(f, f2));
    }

    public void k(float f, float f2, float f3, float f4) {
        this.a.add(new sn8(f, f2, f3, f4));
    }

    public void l(float f, float f2, float f3, float f4) {
        this.a.add(new ao8(f, f2, f3, f4));
    }

    public void m(float f, float f2) {
        this.a.add(new co8(f, f2));
    }

    public sj4 n(ymd ymdVar) {
        ymdVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (((l02) obj).c(ymdVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(tl1.s(arrayList, 10));
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList3.add(((l02) obj2).b(ymdVar.j));
        }
        return z1d.A(new g8c((sj4[]) sl1.C0(arrayList3).toArray(new sj4[0]), 2));
    }

    public void o(float f) {
        this.a.add(new eo8(f));
    }

    public void p(float f) {
        this.a.add(new do8(f));
    }

    public hy(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                return;
            case 2:
                this.a = new ArrayList(32);
                return;
            default:
                this.a = new ArrayList();
                return;
        }
    }
}
