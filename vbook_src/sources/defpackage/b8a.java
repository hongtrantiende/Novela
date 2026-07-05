package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b8a */
/* loaded from: classes.dex */
public final class b8a {
    public final mq7 a;
    public final boolean b;
    public final od6 c;
    public final u7a d;
    public b8a e;
    public final int f;

    public b8a(mq7 mq7Var, boolean z, od6 od6Var, u7a u7aVar) {
        this.a = mq7Var;
        this.b = z;
        this.c = od6Var;
        this.d = u7aVar;
        this.f = od6Var.b;
    }

    public static /* synthetic */ List j(int i, b8a b8aVar) {
        boolean z;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = !b8aVar.b;
        } else {
            z = false;
        }
        if ((i & 2) == 0) {
            z2 = true;
        }
        return b8aVar.i(z, z2);
    }

    public final rk9 a(i38 i38Var) {
        mq7 mq7Var;
        b8a l = l();
        if (l == null) {
            return rk9.e;
        }
        mq7 mq7Var2 = (mq7) l.c.c0.C;
        i38 i38Var2 = null;
        if ((mq7Var2.d & 8) != 0) {
            loop0: while (mq7Var2 != null) {
                if ((mq7Var2.c & 8) != 0) {
                    mq7Var = mq7Var2;
                    gw7 gw7Var = null;
                    while (mq7Var != null) {
                        if (mq7Var instanceof z7a) {
                            if (((z7a) mq7Var).F()) {
                                break loop0;
                            }
                        } else if ((mq7Var.c & 8) != 0 && (mq7Var instanceof m03)) {
                            int i = 0;
                            for (mq7 mq7Var3 = ((m03) mq7Var).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                if ((mq7Var3.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        mq7Var = mq7Var3;
                                    } else {
                                        if (gw7Var == null) {
                                            gw7Var = new gw7(new mq7[16], 0);
                                        }
                                        if (mq7Var != null) {
                                            gw7Var.b(mq7Var);
                                            mq7Var = null;
                                        }
                                        gw7Var.b(mq7Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        mq7Var = voe.h(gw7Var);
                    }
                }
                if ((mq7Var2.d & 8) == 0) {
                    break;
                }
                mq7Var2 = mq7Var2.f;
            }
        }
        mq7Var = null;
        z7a z7aVar = (z7a) mq7Var;
        if (z7aVar != null) {
            i38Var2 = voe.s(z7aVar, 8);
        }
        if (i38Var2 == null) {
            return l.a(i38Var);
        }
        return i38Var2.g0(i38Var, true);
    }

    public final b8a b(xt9 xt9Var, xt4 xt4Var) {
        int i;
        u7a u7aVar = new u7a();
        u7aVar.c = false;
        u7aVar.d = false;
        xt4Var.invoke(u7aVar);
        a8a a8aVar = new a8a(xt4Var);
        int i2 = this.f;
        if (xt9Var != null) {
            i = 1000000000;
        } else {
            i = 2000000000;
        }
        b8a b8aVar = new b8a(a8aVar, false, new od6(i2 + i, true), u7aVar);
        b8aVar.e = this;
        return b8aVar;
    }

    public final void c(od6 od6Var, ArrayList arrayList) {
        gw7 y = od6Var.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            od6 od6Var2 = (od6) objArr[i2];
            if (od6Var2.J() && !od6Var2.n0) {
                if (od6Var2.c0.j(8)) {
                    arrayList.add(sye.d(od6Var2, this.b));
                } else {
                    c(od6Var2, arrayList);
                }
            }
        }
    }

    public final i38 d() {
        if (o()) {
            b8a l = l();
            if (l != null) {
                return l.d();
            }
            return null;
        }
        z7a f = f();
        if (f != null) {
            return voe.s(f, 8);
        }
        return (wv5) this.c.c0.d;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            b8a b8aVar = (b8a) arrayList.get(size2);
            if (b8aVar.p()) {
                arrayList2.add(b8aVar);
            } else if (!b8aVar.d.d) {
                b8aVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final z7a f() {
        mq7 mq7Var;
        boolean z;
        boolean z2 = this.d.c;
        z7a z7aVar = null;
        od6 od6Var = this.c;
        if (z2) {
            mq7 mq7Var2 = (mq7) od6Var.c0.C;
            if ((mq7Var2.d & 8) != 0) {
                mq7Var = null;
                while (mq7Var2 != null) {
                    if ((mq7Var2.c & 8) != 0) {
                        mq7 mq7Var3 = mq7Var2;
                        gw7 gw7Var = null;
                        while (mq7Var3 != null) {
                            if (mq7Var3 instanceof z7a) {
                                z7a z7aVar2 = (z7a) mq7Var3;
                                if (z7aVar2.F()) {
                                    if (z7aVar2.o1()) {
                                        return z7aVar2;
                                    }
                                    if (mq7Var == null) {
                                        mq7Var = z7aVar2;
                                    }
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z && (mq7Var3.c & 8) != 0 && (mq7Var3 instanceof m03)) {
                                int i = 0;
                                for (mq7 mq7Var4 = ((m03) mq7Var3).L; mq7Var4 != null; mq7Var4 = mq7Var4.f) {
                                    if ((mq7Var4.c & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            mq7Var3 = mq7Var4;
                                        } else {
                                            if (gw7Var == null) {
                                                gw7Var = new gw7(new mq7[16], 0);
                                            }
                                            if (mq7Var3 != null) {
                                                gw7Var.b(mq7Var3);
                                                mq7Var3 = null;
                                            }
                                            gw7Var.b(mq7Var4);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            mq7Var3 = voe.h(gw7Var);
                        }
                    }
                    if ((mq7Var2.d & 8) == 0) {
                        break;
                    }
                    mq7Var2 = mq7Var2.f;
                }
                z7aVar = mq7Var;
            }
            return z7aVar;
        }
        mq7 mq7Var5 = (mq7) od6Var.c0.C;
        if ((mq7Var5.d & 8) != 0) {
            loop3: while (mq7Var5 != null) {
                if ((mq7Var5.c & 8) != 0) {
                    mq7Var = mq7Var5;
                    gw7 gw7Var2 = null;
                    while (mq7Var != null) {
                        if (mq7Var instanceof z7a) {
                            if (((z7a) mq7Var).F()) {
                                z7aVar = mq7Var;
                            }
                        } else if ((mq7Var.c & 8) != 0 && (mq7Var instanceof m03)) {
                            int i2 = 0;
                            for (mq7 mq7Var6 = ((m03) mq7Var).L; mq7Var6 != null; mq7Var6 = mq7Var6.f) {
                                if ((mq7Var6.c & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        mq7Var = mq7Var6;
                                    } else {
                                        if (gw7Var2 == null) {
                                            gw7Var2 = new gw7(new mq7[16], 0);
                                        }
                                        if (mq7Var != null) {
                                            gw7Var2.b(mq7Var);
                                            mq7Var = null;
                                        }
                                        gw7Var2.b(mq7Var6);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        mq7Var = voe.h(gw7Var2);
                    }
                }
                if ((mq7Var5.d & 8) == 0) {
                    break;
                }
                mq7Var5 = mq7Var5.f;
            }
        }
        return z7aVar;
    }

    public final rk9 g() {
        i38 d = d();
        if (d != null) {
            if (!d.E1().J) {
                d = null;
            }
            if (d != null) {
                return obe.t(d).g0(d, true);
            }
        }
        return rk9.e;
    }

    public final rk9 h() {
        i38 d = d();
        if (d != null) {
            if (!d.E1().J) {
                d = null;
            }
            if (d != null) {
                return obe.q(d, true);
            }
        }
        return rk9.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.d) {
            return ks3.a;
        }
        ArrayList arrayList = new ArrayList();
        if (p()) {
            ArrayList arrayList2 = new ArrayList();
            e(arrayList, arrayList2);
            return arrayList2;
        }
        return s(arrayList, z2);
    }

    public final u7a k() {
        boolean p = p();
        u7a u7aVar = this.d;
        if (p) {
            u7a u7aVar2 = new u7a();
            u7aVar2.c = u7aVar.c;
            u7aVar2.d = u7aVar.d;
            u7aVar2.a.k(u7aVar.a);
            r(new ArrayList(), u7aVar2);
            return u7aVar2;
        }
        return u7aVar;
    }

    public final b8a l() {
        od6 od6Var;
        b8a b8aVar = this.e;
        if (b8aVar != null) {
            return b8aVar;
        }
        od6 od6Var2 = this.c;
        boolean z = this.b;
        if (z) {
            od6Var = od6Var2.v();
            while (od6Var != null) {
                u7a x = od6Var.x();
                if (x != null && x.c) {
                    break;
                }
                od6Var = od6Var.v();
            }
        }
        od6Var = null;
        if (od6Var == null) {
            od6 v = od6Var2.v();
            while (true) {
                if (v != null) {
                    if (v.c0.j(8)) {
                        od6Var = v;
                        break;
                    }
                    v = v.v();
                } else {
                    od6Var = null;
                    break;
                }
            }
        }
        if (od6Var == null) {
            return null;
        }
        return sye.d(od6Var, z);
    }

    public final rk9 m() {
        boolean z;
        z7a f = f();
        if (f == null) {
            return ((wv5) this.c.c0.d).a2();
        }
        mq7 mq7Var = ((mq7) f).a;
        Object g = this.d.a.g(s7a.b);
        if (g == null) {
            g = null;
        }
        if (g != null) {
            z = true;
        } else {
            z = false;
        }
        return ak0.p(mq7Var, z, true);
    }

    public final u7a n() {
        return this.d;
    }

    public final boolean o() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if (this.b && this.d.c) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if (!o() && j(4, this).isEmpty()) {
            od6 v = this.c.v();
            while (true) {
                if (v != null) {
                    u7a x = v.x();
                    if (x != null && x.c) {
                        break;
                    }
                    v = v.v();
                } else {
                    v = null;
                    break;
                }
            }
            if (v == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r(ArrayList arrayList, u7a u7aVar) {
        if (!this.d.d) {
            s(arrayList, false);
            int size = arrayList.size();
            for (int size2 = arrayList.size(); size2 < size; size2++) {
                b8a b8aVar = (b8a) arrayList.get(size2);
                if (!b8aVar.p()) {
                    u7aVar.c(b8aVar.d);
                    b8aVar.r(arrayList, u7aVar);
                }
            }
        }
    }

    public final List s(ArrayList arrayList, boolean z) {
        String str;
        if (o()) {
            return ks3.a;
        }
        c(this.c, arrayList);
        if (z) {
            u7a u7aVar = this.d;
            tv7 tv7Var = u7aVar.a;
            Object g = tv7Var.g(h8a.z);
            if (g == null) {
                g = null;
            }
            xt9 xt9Var = (xt9) g;
            if (xt9Var != null && u7aVar.c && !arrayList.isEmpty()) {
                arrayList.add(b(xt9Var, new ko9(xt9Var, 1)));
            }
            k8a k8aVar = h8a.a;
            if (tv7Var.c(k8aVar) && !arrayList.isEmpty() && u7aVar.c) {
                Object g2 = tv7Var.g(k8aVar);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null) {
                    str = (String) sl1.e0(list);
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(0, b(null, new bo5(str, 1)));
                }
            }
        }
        return arrayList;
    }
}
