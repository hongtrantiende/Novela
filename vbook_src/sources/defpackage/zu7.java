package defpackage;

import android.os.Looper;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zu7  reason: default package */
/* loaded from: classes.dex */
public class zu7 {
    public static final Object k = new Object();
    public final Object a;
    public final tw9 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final og j;

    public zu7(int i) {
        je8 je8Var = mu9.e;
        this.a = new Object();
        this.b = new tw9();
        this.c = 0;
        this.f = k;
        this.j = new og(this, 6);
        this.e = je8Var;
        this.g = 0;
    }

    public static void a(String str) {
        bz.R().d.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        vs.k(hl5.n("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(as6 as6Var) {
        if (as6Var.b) {
            if (!as6Var.d()) {
                as6Var.a(false);
                return;
            }
            int i = as6Var.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            as6Var.c = i2;
            as6Var.a.f(this.e);
        }
    }

    public final void c(as6 as6Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (as6Var != null) {
                b(as6Var);
                as6Var = null;
            } else {
                tw9 tw9Var = this.b;
                tw9Var.getClass();
                rw9 rw9Var = new rw9(tw9Var);
                tw9Var.c.put(rw9Var, Boolean.FALSE);
                while (rw9Var.hasNext()) {
                    b((as6) ((Map.Entry) rw9Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(un6 un6Var, q78 q78Var) {
        a("observe");
        if (un6Var.k().h != kn6.a) {
            zr6 zr6Var = new zr6(this, un6Var, q78Var);
            as6 as6Var = (as6) this.b.a(q78Var, zr6Var);
            if (as6Var != null && !as6Var.c(un6Var)) {
                vs.m("Cannot add the same observer with different lifecycles");
            } else if (as6Var != null) {
            } else {
                un6Var.k().a(zr6Var);
            }
        }
    }

    public final void g(Object obj) {
        boolean z;
        synchronized (this.a) {
            if (this.f == k) {
                z = true;
            } else {
                z = false;
            }
            this.f = obj;
        }
        if (!z) {
            return;
        }
        bz R = bz.R();
        og ogVar = this.j;
        ux2 ux2Var = R.d;
        if (ux2Var.f == null) {
            synchronized (ux2Var.d) {
                try {
                    if (ux2Var.f == null) {
                        ux2Var.f = ux2.R(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        ux2Var.f.post(ogVar);
    }

    public void h(q78 q78Var) {
        a("removeObserver");
        tw9 tw9Var = this.b;
        WeakHashMap weakHashMap = tw9Var.c;
        qw9 qw9Var = tw9Var.a;
        while (qw9Var != null && !qw9Var.a.equals(q78Var)) {
            qw9Var = qw9Var.c;
        }
        as6 as6Var = null;
        if (qw9Var != null) {
            tw9Var.d--;
            if (!weakHashMap.isEmpty()) {
                for (sw9 sw9Var : weakHashMap.keySet()) {
                    sw9Var.a(qw9Var);
                }
            }
            qw9 qw9Var2 = qw9Var.d;
            qw9 qw9Var3 = qw9Var.c;
            if (qw9Var2 != null) {
                qw9Var2.c = qw9Var3;
            } else {
                tw9Var.a = qw9Var3;
            }
            qw9 qw9Var4 = qw9Var.c;
            if (qw9Var4 != null) {
                qw9Var4.d = qw9Var2;
            } else {
                tw9Var.b = qw9Var2;
            }
            qw9Var.c = null;
            qw9Var.d = null;
            as6Var = qw9Var.b;
        }
        if (as6Var == null) {
            return;
        }
        as6Var.b();
        as6Var.a(false);
    }

    public void i(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public void e() {
    }

    public void f() {
    }

    public zu7() {
        this.a = new Object();
        this.b = new tw9();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new og(this, 6);
        this.e = obj;
        this.g = -1;
    }
}
