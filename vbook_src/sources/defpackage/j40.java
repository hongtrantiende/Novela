package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j40  reason: default package */
/* loaded from: classes.dex */
public final class j40 implements Iterable, j76 {
    public int a;
    public String[] b = new String[3];
    public Object[] c = new Object[3];

    public final void a(j40 j40Var) {
        boolean z;
        j40Var.getClass();
        int size = j40Var.size();
        if (size != 0) {
            d(this.a + size);
            if (this.a != 0) {
                z = true;
            } else {
                z = false;
            }
            i40 i40Var = new i40(j40Var);
            while (i40Var.hasNext()) {
                g40 g40Var = (g40) i40Var.next();
                String str = g40Var.a;
                if (z) {
                    n(str, g40Var.getValue());
                    g40Var.c = this;
                } else {
                    b(str, g40Var.getValue());
                }
            }
        }
    }

    public final void b(String str, Serializable serializable) {
        d(this.a + 1);
        String[] strArr = this.b;
        int i = this.a;
        strArr[i] = str;
        this.c[i] = serializable;
        this.a = i + 1;
    }

    public final List c() {
        ArrayList arrayList = new ArrayList(this.a);
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.b[i2];
            str.getClass();
            if (!uwe.l(str)) {
                arrayList.add(new g40(str, (String) this.c[i2], this));
            }
        }
        return sl1.C0(arrayList);
    }

    public final void d(int i) {
        int i2 = this.a;
        if (i >= i2) {
            String[] strArr = this.b;
            int length = strArr.length;
            if (length >= i) {
                return;
            }
            int i3 = 3;
            if (length >= 3) {
                i3 = i2 * 2;
            }
            if (i <= i3) {
                i = i3;
            }
            this.b = (String[]) Arrays.copyOf(strArr, i);
            this.c = Arrays.copyOf(this.c, i);
            return;
        }
        cy7.i("Must be true");
    }

    /* renamed from: e */
    public final j40 clone() {
        j40 j40Var = new j40();
        j40Var.a(this);
        j40Var.a = this.a;
        j40Var.b = (String[]) Arrays.copyOf(this.b, this.a);
        j40Var.c = Arrays.copyOf(this.c, this.a);
        int l = l("/ksoup.userdata");
        if (l != -1) {
            Object[] objArr = this.c;
            Object obj = this.c[l];
            obj.getClass();
            objArr[l] = new HashMap(jsc.s(obj));
        }
        return j40Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j40.class == obj.getClass()) {
                j40 j40Var = (j40) obj;
                int i = this.a;
                if (i == j40Var.a) {
                    for (int i2 = 0; i2 < i; i2++) {
                        String str = this.b[i2];
                        str.getClass();
                        int l = j40Var.l(str);
                        if (l != -1 && c16.i(this.c[i2], j40Var.c[l])) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int f(qm8 qm8Var) {
        int i = this.a;
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        boolean z = qm8Var.b;
        int i3 = 0;
        while (i2 < i) {
            String str = this.b[i2];
            i2++;
            int i4 = i2;
            while (i4 < this.a) {
                if ((z && c16.i(str, this.b[i4])) || (!z && r4b.J(str, this.b[i4], true))) {
                    i3++;
                    p(i4);
                    i4--;
                }
                i4++;
            }
        }
        return i3;
    }

    public final String g(String str) {
        Object obj;
        str.getClass();
        int l = l(str);
        if (l == -1 || (obj = this.c[l]) == null) {
            return "";
        }
        return (String) obj;
    }

    public final String h(String str) {
        Object obj;
        str.getClass();
        int m = m(str);
        if (m == -1 || (obj = this.c[m]) == null) {
            return "";
        }
        return (String) obj;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b.hashCode()) * 31);
    }

    public final boolean i(String str) {
        str.getClass();
        if (l(str) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new i40(this);
    }

    public final boolean j(String str) {
        str.getClass();
        if (m(str) != -1) {
            return true;
        }
        return false;
    }

    public final void k(bp3 bp3Var, sc3 sc3Var) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.b[i2];
            str.getClass();
            if (!uwe.l(str)) {
                String[] strArr = g40.d;
                String k = twe.k(str, sc3Var.g);
                if (k != null) {
                    bp3Var.b(' ');
                    twe.l(k, (String) this.c[i2], bp3Var, sc3Var);
                }
            }
        }
    }

    public final int l(String str) {
        str.getClass();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (str.equals(this.b[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final int m(String str) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (r4b.J(str, this.b[i2], true)) {
                return i2;
            }
        }
        return -1;
    }

    public final void n(String str, String str2) {
        str.getClass();
        int l = l(str);
        if (l != -1) {
            this.c[l] = str2;
        } else {
            b(str, str2);
        }
    }

    public final void p(int i) {
        int i2 = this.a;
        if (i < i2) {
            int i3 = (i2 - i) - 1;
            if (i3 > 0) {
                String[] strArr = this.b;
                int i4 = i + 1;
                int i5 = i3 + i4;
                b00.W(i, i4, i5, strArr, strArr);
                Object[] objArr = this.c;
                b00.W(i, i4, i5, objArr, objArr);
            }
            int i6 = this.a - 1;
            this.a = i6;
            this.b[i6] = null;
            this.c[i6] = null;
            return;
        }
        cy7.i("Must be false");
    }

    public final Map r() {
        int l = l("/ksoup.userdata");
        if (l == -1) {
            HashMap hashMap = new HashMap();
            b("/ksoup.userdata", hashMap);
            return hashMap;
        }
        Object obj = this.c[l];
        obj.getClass();
        return jsc.s(obj);
    }

    public final void s(Object obj, String str) {
        str.getClass();
        if (obj == null && !i("/ksoup.userdata")) {
            return;
        }
        Map r = r();
        if (obj == null) {
            r.remove(str);
        } else {
            r.put(str, obj);
        }
    }

    public final int size() {
        int i = this.a;
        if (i == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            String str = this.b[i3];
            str.getClass();
            if (!uwe.l(str)) {
                i2++;
            }
        }
        return i2;
    }

    public final String toString() {
        StringBuilder b = d4b.b();
        b.getClass();
        k(new bp3(1, b), new sc3());
        String sb = b.toString();
        d4b.m(b);
        return sb;
    }
}
