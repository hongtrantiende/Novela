package defpackage;

import android.graphics.Rect;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hjd  reason: default package */
/* loaded from: classes.dex */
public abstract class hjd {
    public final tjd a;
    public cx5[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public hjd(tjd tjdVar) {
        this.c = new Rect[10];
        this.d = new Rect[10];
        this.a = tjdVar;
        c(tjdVar);
    }

    public final void a() {
        cx5[] cx5VarArr = this.b;
        if (cx5VarArr != null) {
            cx5 cx5Var = cx5VarArr[0];
            cx5 cx5Var2 = cx5VarArr[1];
            tjd tjdVar = this.a;
            if (cx5Var2 == null) {
                cx5Var2 = tjdVar.a.i(2);
            }
            if (cx5Var == null) {
                cx5Var = tjdVar.a.i(1);
            }
            h(cx5.a(cx5Var, cx5Var2));
            cx5 cx5Var3 = this.b[iwe.g(16)];
            if (cx5Var3 != null) {
                g(cx5Var3);
            }
            cx5 cx5Var4 = this.b[iwe.g(32)];
            if (cx5Var4 != null) {
                e(cx5Var4);
            }
            cx5 cx5Var5 = this.b[iwe.g(64)];
            if (cx5Var5 != null) {
                i(cx5Var5);
            }
        }
    }

    public abstract tjd b();

    public void c(tjd tjdVar) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> f = tjdVar.a.f(i);
            int g = iwe.g(i);
            this.c[g] = (Rect[]) f.toArray(new Rect[f.size()]);
            if (i != 8) {
                List<Rect> g2 = tjdVar.a.g(i);
                this.d[g] = (Rect[]) g2.toArray(new Rect[g2.size()]);
            }
        }
    }

    public void d(int i, cx5 cx5Var) {
        if (this.b == null) {
            this.b = new cx5[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[iwe.g(i2)] = cx5Var;
            }
        }
    }

    public abstract void f(cx5 cx5Var);

    public abstract void h(cx5 cx5Var);

    public hjd() {
        this(new tjd((tjd) null));
    }

    public void e(cx5 cx5Var) {
    }

    public void g(cx5 cx5Var) {
    }

    public void i(cx5 cx5Var) {
    }
}
