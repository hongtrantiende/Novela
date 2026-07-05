package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tu1  reason: default package */
/* loaded from: classes3.dex */
public final class tu1 implements lu4, mu4, nu4, ou4, pu4, qu4, ru4, su4, wt4, yt4, au4, bu4, cu4, du4, eu4, fu4, gu4, iu4, ju4 {
    public final int a;
    public final boolean b;
    public Object c;
    public ek9 d;
    public ArrayList e;

    public tu1(Object obj, boolean z, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    public final Object a(int i, rv4 rv4Var) {
        int u;
        rv4Var.g0(this.a);
        o(rv4Var);
        if (rv4Var.f(this)) {
            u = jce.u(2, 0);
        } else {
            u = jce.u(1, 0);
        }
        int i2 = i | u;
        Object obj = this.c;
        obj.getClass();
        jsc.u(2, obj);
        Object invoke = ((lu4) obj).invoke(rv4Var, Integer.valueOf(i2));
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new su1(2, this, tu1.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return invoke;
    }

    public final Object b(Object obj, rv4 rv4Var, int i) {
        int u;
        rv4Var.g0(this.a);
        o(rv4Var);
        if (rv4Var.f(this)) {
            u = jce.u(2, 1);
        } else {
            u = jce.u(1, 1);
        }
        Object obj2 = this.c;
        obj2.getClass();
        jsc.u(3, obj2);
        Object c = ((mu4) obj2).c(obj, rv4Var, Integer.valueOf(u | i));
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new gk7(this, obj, i, 4);
        }
        return c;
    }

    @Override // defpackage.mu4
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3) {
        return b(obj, (rv4) obj2, ((Number) obj3).intValue());
    }

    public final Object e(Object obj, Object obj2, rv4 rv4Var, int i) {
        int u;
        rv4Var.g0(this.a);
        o(rv4Var);
        if (rv4Var.f(this)) {
            u = jce.u(2, 2);
        } else {
            u = jce.u(1, 2);
        }
        Object obj3 = this.c;
        obj3.getClass();
        jsc.u(4, obj3);
        Object h = ((nu4) obj3).h(obj, obj2, rv4Var, Integer.valueOf(u | i));
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new va(this, obj, obj2, i, 8);
        }
        return h;
    }

    public final Object f(Object obj, Object obj2, Object obj3, rv4 rv4Var, int i) {
        int u;
        rv4Var.g0(this.a);
        o(rv4Var);
        if (rv4Var.f(this)) {
            u = jce.u(2, 3);
        } else {
            u = jce.u(1, 3);
        }
        Object obj4 = this.c;
        obj4.getClass();
        jsc.u(5, obj4);
        Object l = ((ou4) obj4).l(obj, obj2, obj3, rv4Var, Integer.valueOf(u | i));
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new x90(this, obj, obj2, obj3, i, 1);
        }
        return l;
    }

    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, rv4 rv4Var, int i) {
        int u;
        rv4Var.g0(this.a);
        o(rv4Var);
        if (rv4Var.f(this)) {
            u = jce.u(2, 4);
        } else {
            u = jce.u(1, 4);
        }
        Object obj5 = this.c;
        obj5.getClass();
        jsc.u(6, obj5);
        Object j = ((pu4) obj5).j(obj, obj2, obj3, obj4, rv4Var, Integer.valueOf(i | u));
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new ud1(this, obj, obj2, obj3, obj4, i, 1);
        }
        return j;
    }

    @Override // defpackage.nu4
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        return e(obj, obj2, (rv4) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.qu4
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Number number) {
        return m(obj, obj2, obj3, obj4, obj5, (rv4) obj6, number.intValue());
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((Number) obj2).intValue(), (rv4) obj);
    }

    @Override // defpackage.pu4
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return g(obj, obj2, obj3, obj4, (rv4) obj5, ((Number) obj6).intValue());
    }

    @Override // defpackage.ru4
    public final /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Number number) {
        return n(obj, obj2, obj3, obj4, obj5, obj6, (rv4) obj7, number.intValue());
    }

    @Override // defpackage.ou4
    public final /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return f(obj, obj2, obj3, (rv4) obj4, ((Number) obj5).intValue());
    }

    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, rv4 rv4Var, int i) {
        int u;
        rv4Var.g0(this.a);
        o(rv4Var);
        if (rv4Var.f(this)) {
            u = jce.u(2, 5);
        } else {
            u = jce.u(1, 5);
        }
        Object obj6 = this.c;
        obj6.getClass();
        jsc.u(7, obj6);
        Object i2 = ((qu4) obj6).i(obj, obj2, obj3, obj4, obj5, rv4Var, Integer.valueOf(i | u));
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new ru1(this, obj, obj2, obj3, obj4, obj5, i, 0);
        }
        return i2;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, rv4 rv4Var, int i) {
        int u;
        rv4Var.g0(this.a);
        o(rv4Var);
        if (rv4Var.f(this)) {
            u = jce.u(2, 6);
        } else {
            u = jce.u(1, 6);
        }
        Object obj7 = this.c;
        obj7.getClass();
        jsc.u(8, obj7);
        Object k = ((ru4) obj7).k(obj, obj2, obj3, obj4, obj5, obj6, rv4Var, Integer.valueOf(i | u));
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new i81(this, obj, obj2, obj3, obj4, obj5, obj6, i);
        }
        return k;
    }

    public final void o(rv4 rv4Var) {
        ek9 A;
        if (this.b && (A = rv4Var.A()) != null) {
            A.b |= 1;
            ek9 ek9Var = this.d;
            if (ek9Var != null && ek9Var.a() && ek9Var != A && !c16.i(ek9Var.c, A.c)) {
                ArrayList arrayList = this.e;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList();
                    this.e = arrayList2;
                    arrayList2.add(A);
                    return;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ek9 ek9Var2 = (ek9) arrayList.get(i);
                    if (ek9Var2 == null || !ek9Var2.a() || ek9Var2 == A || c16.i(ek9Var2.c, A.c)) {
                        arrayList.set(i, A);
                        return;
                    }
                }
                arrayList.add(A);
                return;
            }
            this.d = A;
        }
    }

    public final void p(hu4 hu4Var) {
        boolean z;
        if (!c16.i(this.c, hu4Var)) {
            if (this.c == null) {
                z = true;
            } else {
                z = false;
            }
            this.c = hu4Var;
            if (!z && this.b) {
                ek9 ek9Var = this.d;
                if (ek9Var != null) {
                    fk9 fk9Var = ek9Var.a;
                    if (fk9Var != null) {
                        fk9Var.f(ek9Var, null);
                    }
                    this.d = null;
                }
                ArrayList arrayList = this.e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ek9 ek9Var2 = (ek9) arrayList.get(i);
                        fk9 fk9Var2 = ek9Var2.a;
                        if (fk9Var2 != null) {
                            fk9Var2.f(ek9Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
    }
}
