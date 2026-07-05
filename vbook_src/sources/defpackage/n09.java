package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n09  reason: default package */
/* loaded from: classes3.dex */
public class n09 implements o9a, h51 {
    public final String a;
    public final rw4 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final ye6 i;
    public final ye6 j;
    public final ye6 k;

    public n09(String str, rw4 rw4Var, int i) {
        this.a = str;
        this.b = rw4Var;
        this.c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = ls3.a;
        vt4 vt4Var = new vt4(this) { // from class: m09
            public final /* synthetic */ n09 b;

            {
                this.b = this;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                ArrayList arrayList;
                int i4 = r2;
                n09 n09Var = this.b;
                switch (i4) {
                    case 0:
                        rw4 rw4Var2 = n09Var.b;
                        if (rw4Var2 != null) {
                            return rw4Var2.d();
                        }
                        return r1d.c;
                    case 1:
                        rw4 rw4Var3 = n09Var.b;
                        if (rw4Var3 != null) {
                            s76[] b = rw4Var3.b();
                            arrayList = new ArrayList(b.length);
                            for (s76 s76Var : b) {
                                arrayList.add(s76Var.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return q1d.f(arrayList);
                    default:
                        return Integer.valueOf(hc2.m(n09Var, (o9a[]) n09Var.j.getValue()));
                }
            }
        };
        sk6 sk6Var = sk6.b;
        this.i = ipe.x(sk6Var, vt4Var);
        this.j = ipe.x(sk6Var, new vt4(this) { // from class: m09
            public final /* synthetic */ n09 b;

            {
                this.b = this;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                ArrayList arrayList;
                int i4 = r2;
                n09 n09Var = this.b;
                switch (i4) {
                    case 0:
                        rw4 rw4Var2 = n09Var.b;
                        if (rw4Var2 != null) {
                            return rw4Var2.d();
                        }
                        return r1d.c;
                    case 1:
                        rw4 rw4Var3 = n09Var.b;
                        if (rw4Var3 != null) {
                            s76[] b = rw4Var3.b();
                            arrayList = new ArrayList(b.length);
                            for (s76 s76Var : b) {
                                arrayList.add(s76Var.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return q1d.f(arrayList);
                    default:
                        return Integer.valueOf(hc2.m(n09Var, (o9a[]) n09Var.j.getValue()));
                }
            }
        });
        this.k = ipe.x(sk6Var, new vt4(this) { // from class: m09
            public final /* synthetic */ n09 b;

            {
                this.b = this;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                ArrayList arrayList;
                int i4 = r2;
                n09 n09Var = this.b;
                switch (i4) {
                    case 0:
                        rw4 rw4Var2 = n09Var.b;
                        if (rw4Var2 != null) {
                            return rw4Var2.d();
                        }
                        return r1d.c;
                    case 1:
                        rw4 rw4Var3 = n09Var.b;
                        if (rw4Var3 != null) {
                            s76[] b = rw4Var3.b();
                            arrayList = new ArrayList(b.length);
                            for (s76 s76Var : b) {
                                arrayList.add(s76Var.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return q1d.f(arrayList);
                    default:
                        return Integer.valueOf(hc2.m(n09Var, (o9a[]) n09Var.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.o9a
    public final String a() {
        return this.a;
    }

    @Override // defpackage.h51
    public final Set b() {
        return this.h.keySet();
    }

    @Override // defpackage.o9a
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.o9a
    public bze e() {
        return a5b.f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n09) {
                o9a o9aVar = (o9a) obj;
                if (this.a.equals(o9aVar.a()) && Arrays.equals((o9a[]) this.j.getValue(), (o9a[]) ((n09) obj).j.getValue())) {
                    int f = o9aVar.f();
                    int i = this.c;
                    if (i == f) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (c16.i(i(i2).a(), o9aVar.i(i2).a()) && c16.i(i(i2).e(), o9aVar.i(i2).e())) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.o9a
    public final int f() {
        return this.c;
    }

    @Override // defpackage.o9a
    public final String g(int i) {
        return this.e[i];
    }

    @Override // defpackage.o9a
    public final List getAnnotations() {
        return ks3.a;
    }

    @Override // defpackage.o9a
    public final List h(int i) {
        List list = this.f[i];
        if (list == null) {
            return ks3.a;
        }
        return list;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.o9a
    public o9a i(int i) {
        return ((s76[]) this.i.getValue())[i].e();
    }

    @Override // defpackage.o9a
    public final boolean j(int i) {
        return this.g[i];
    }

    public final void k(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = hashMap;
        }
    }

    public String toString() {
        return hc2.t(this);
    }
}
