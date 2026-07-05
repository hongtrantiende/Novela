package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bqa  reason: default package */
/* loaded from: classes.dex */
public final class bqa implements rx1, Iterable, j76 {
    public boolean C;
    public int D;
    public HashMap F;
    public wu7 G;
    public int b;
    public int d;
    public int e;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public final Object f = new Object();
    public ArrayList E = new ArrayList();

    public static final void d(eqa eqaVar, int i) {
        while (eqaVar.v >= 0 && eqaVar.u <= i) {
            eqaVar.O();
            eqaVar.j();
        }
    }

    public final int a(lv4 lv4Var) {
        if (this.C) {
            ex1.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!lv4Var.a()) {
            e39.a("Anchor refers to a group that was removed");
        }
        return lv4Var.a;
    }

    public final void b() {
        this.F = new HashMap();
    }

    public final tv7 c(ny nyVar, kv7 kv7Var) {
        int i;
        Object[] objArr = kv7Var.a;
        int i2 = kv7Var.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            } else if (!g(zbe.m(((ls7) objArr[i3]).e))) {
                kv7 kv7Var2 = new kv7();
                Object[] objArr2 = kv7Var.a;
                int i4 = kv7Var.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object obj = objArr2[i5];
                    if (g(zbe.m(((ls7) obj).e))) {
                        kv7Var2.a(obj);
                    }
                }
                kv7Var = kv7Var2;
            } else {
                i3++;
            }
        }
        ux9 ux9Var = new ux9(this, 16);
        if (kv7Var.b > 1) {
            Comparable comparable = (Comparable) ux9Var.invoke(kv7Var.f(0));
            int i6 = kv7Var.b;
            int i7 = 1;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                Comparable comparable2 = (Comparable) ux9Var.invoke(kv7Var.f(i7));
                if (comparable.compareTo(comparable2) > 0) {
                    kv7 kv7Var3 = new kv7(kv7Var.b);
                    Object[] objArr3 = kv7Var.a;
                    int i8 = kv7Var.b;
                    for (int i9 = 0; i9 < i8; i9++) {
                        kv7Var3.a(objArr3[i9]);
                    }
                    iv7 iv7Var = kv7Var3.c;
                    if (iv7Var == null) {
                        iv7Var = new iv7(kv7Var3, 0);
                        kv7Var3.c = iv7Var;
                    }
                    if (((kv7) iv7Var.b).b > 1) {
                        wl1.O(new la3(ux9Var, 2), iv7Var);
                    }
                    kv7Var = kv7Var3;
                } else {
                    i7++;
                    comparable = comparable2;
                }
            }
        }
        if (kv7Var.h()) {
            tv7 tv7Var = tz9.b;
            tv7Var.getClass();
            return tv7Var;
        }
        long[] jArr = tz9.a;
        tv7 tv7Var2 = new tv7();
        eqa f = f();
        try {
            Object[] objArr4 = kv7Var.a;
            int i10 = kv7Var.b;
            for (int i11 = 0; i11 < i10; i11++) {
                ls7 ls7Var = (ls7) objArr4[i11];
                int c = f.c(zbe.m(ls7Var.e));
                int G = f.G(c, f.b);
                d(f, G);
                d(f, G);
                while (true) {
                    i = f.t;
                    if (i == G || i == f.u) {
                        break;
                    } else if (G < f.u(i) + i) {
                        f.R();
                    } else {
                        f.N();
                    }
                }
                if (i != G) {
                    ex1.a("Unexpected slot table structure");
                }
                f.R();
                f.a(c - f.t);
                tv7Var2.n(ls7Var, ex1.c(ls7Var.c, ls7Var, f, nyVar));
            }
            d(f, Integer.MAX_VALUE);
            f.e(true);
            return tv7Var2;
        } catch (Throwable th) {
            f.e(false);
            throw th;
        }
    }

    public final aqa e() {
        if (!this.C) {
            this.e++;
            return new aqa(this);
        }
        vs.k("Cannot read while a writer is pending");
        return null;
    }

    public final eqa f() {
        if (this.C) {
            ex1.a("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            ex1.a("Cannot start a writer when a reader is pending");
        }
        this.C = true;
        this.D++;
        return new eqa(this);
    }

    public final boolean g(lv4 lv4Var) {
        int e;
        if (lv4Var.a() && (e = dqa.e(this.E, lv4Var.a, this.b)) >= 0 && c16.i(this.E.get(e), lv4Var)) {
            return true;
        }
        return false;
    }

    public final uv4 h(int i) {
        lv4 lv4Var;
        int i2;
        ArrayList arrayList;
        int e;
        HashMap hashMap = this.F;
        if (hashMap != null) {
            if (this.C) {
                ex1.a("use active SlotWriter to crate an anchor for location instead");
            }
            if (i >= 0 && i < (i2 = this.b) && (e = dqa.e((arrayList = this.E), i, i2)) >= 0) {
                lv4Var = (lv4) arrayList.get(e);
            } else {
                lv4Var = null;
            }
            if (lv4Var != null) {
                return (uv4) hashMap.get(lv4Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s25(this, 0, this.b);
    }
}
