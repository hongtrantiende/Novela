package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y28  reason: default package */
/* loaded from: classes.dex */
public abstract class y28 {
    public static final ArrayList c = new ArrayList();
    public cp3 a;
    public int b;

    public abstract cp3 A();

    public final y28 B() {
        if (this.a == null || G() <= 0) {
            return null;
        }
        cp3 cp3Var = this.a;
        cp3Var.getClass();
        return ((ap3) cp3Var.l()).get(this.b - 1);
    }

    public final void D() {
        cp3 cp3Var = this.a;
        if (cp3Var != null) {
            cp3Var.E(this);
        }
    }

    public void E(y28 y28Var) {
        y28Var.getClass();
        if (y28Var.a == this) {
            cp3 cp3Var = (cp3) this;
            if (cp3Var.C.a) {
                ((ap3) cp3Var.l()).remove(y28Var.b);
            } else {
                ((ap3) cp3Var.l()).remove(y28Var);
            }
            cp3Var.C.a = false;
            y28Var.a = null;
            return;
        }
        cy7.i("Must be true");
    }

    public final void F(y28 y28Var) {
        y28Var.getClass();
        if (this.a == null) {
            this.a = y28Var.a;
        }
        cp3 cp3Var = this.a;
        cp3Var.getClass();
        if (this.a == cp3Var) {
            if (this == y28Var) {
                return;
            }
            cp3 cp3Var2 = y28Var.a;
            if (cp3Var2 != null) {
                cp3Var2.E(y28Var);
            }
            int G = G();
            ((ap3) cp3Var.l()).set(G, y28Var);
            y28Var.a = cp3Var;
            y28Var.b = G;
            this.a = null;
            cp3Var.C.c++;
            return;
        }
        cy7.i("Must be true");
    }

    public final int G() {
        ap3 ap3Var;
        cp3 cp3Var = this.a;
        if (cp3Var != null && !cp3Var.C.a) {
            cp3Var.getClass();
            int size = cp3Var.C.b.size();
            int i = 0;
            while (true) {
                ap3Var = cp3Var.C;
                if (i >= size) {
                    break;
                }
                ap3Var.get(i).b = i;
                i++;
            }
            ap3Var.a = true;
        }
        return this.b;
    }

    public String a(String str) {
        String str2;
        String str3;
        int i;
        String str4;
        int length;
        int length2;
        int length3;
        String str5;
        String str6;
        String str7;
        boolean z;
        str.getClass();
        if (str.length() != 0) {
            String str8 = "";
            if (p() && e().j(str)) {
                String[] strArr = d4b.a;
                String f = f();
                String h = e().h(str);
                gm9 gm9Var = d4b.b;
                String i2 = gm9Var.i(f, "");
                String i3 = gm9Var.i(h, "");
                if (i3.length() == 0) {
                    return i2;
                }
                int i4 = 0;
                if (i3.length() > 2 && k4b.V(i3, ":", false)) {
                    return i3;
                }
                if (i2.length() > 2 && k4b.V(i2, ":", false)) {
                    int g0 = k4b.g0(i2, ":", 0, false, 6);
                    if (g0 != -1) {
                        if (k4b.g0(i2, "://", 0, false, 6) != -1) {
                            str3 = "//";
                        } else if (k4b.g0(i2, ":/", 0, false, 6) == -1) {
                            str3 = "";
                        } else {
                            str3 = "/";
                        }
                        str2 = i2.substring(0, g0);
                        i2 = i2.substring(str3.length() + g0 + 1);
                    } else {
                        str2 = "https";
                        str3 = "//";
                    }
                    if (!str3.equals("/")) {
                        int f0 = k4b.f0(i2, '/', 0, 6);
                        Integer valueOf = Integer.valueOf(f0);
                        if (f0 == -1) {
                            valueOf = null;
                        }
                        if (valueOf == null) {
                            int f02 = k4b.f0(i2, '?', 0, 6);
                            valueOf = Integer.valueOf(f02);
                            if (f02 == -1) {
                                valueOf = null;
                            }
                            if (valueOf == null) {
                                int f03 = k4b.f0(i2, '#', 0, 6);
                                valueOf = Integer.valueOf(f03);
                                if (f03 == -1) {
                                    valueOf = null;
                                }
                                if (valueOf == null) {
                                    i = i2.length();
                                }
                            }
                        }
                        i = valueOf.intValue();
                    } else {
                        i = -1;
                    }
                    if (i != -1) {
                        str4 = i2.substring(0, i);
                    } else {
                        str4 = null;
                    }
                    if (i != -1) {
                        i2 = i2.substring(i);
                    }
                    int i0 = k4b.i0(i2, new char[]{'?', '#'}, 0, 6);
                    Integer valueOf2 = Integer.valueOf(i0);
                    if (i0 == -1) {
                        valueOf2 = null;
                    }
                    if (valueOf2 != null) {
                        length = valueOf2.intValue();
                    } else {
                        length = i2.length();
                    }
                    String substring = i2.substring(0, length);
                    int f04 = k4b.f0(i2, '?', 0, 6);
                    Integer valueOf3 = Integer.valueOf(f04);
                    if (f04 == -1) {
                        valueOf3 = null;
                    }
                    if (valueOf3 != null) {
                        length2 = valueOf3.intValue();
                    } else {
                        length2 = i2.length();
                    }
                    int f05 = k4b.f0(i2, '#', 0, 6);
                    Integer valueOf4 = Integer.valueOf(f05);
                    if (f05 == -1) {
                        valueOf4 = null;
                    }
                    if (valueOf4 != null) {
                        length3 = valueOf4.intValue();
                    } else {
                        length3 = i2.length();
                    }
                    if (length2 != i2.length()) {
                        str5 = i2.substring(length2, length3);
                    } else {
                        str5 = null;
                    }
                    if (length3 != i2.length()) {
                        i2.substring(length3);
                    }
                    if (str4 == null) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (r4b.Q(i3, "//", false)) {
                        return eub.o(str2, ":", i3);
                    }
                    if (r4b.Q(i3, "?", false)) {
                        return str2 + ":" + str3 + str6 + substring + i3;
                    } else if (r4b.Q(i3, "#", false)) {
                        if (str5 != null) {
                            str8 = str5;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(":");
                        sb.append(str3);
                        sb.append(str6);
                        sb.append(substring);
                        return s21.q(sb, str8, i3);
                    } else {
                        if (!r4b.Q(i3, "/", false)) {
                            int f06 = k4b.f0(substring, '?', 0, 6);
                            int f07 = k4b.f0(substring, '#', 0, 6);
                            if (f06 != -1) {
                                substring = substring.substring(0, f06);
                            } else if (f07 != -1) {
                                substring = substring.substring(0, f07);
                            }
                            if (!r4b.I(substring, "/", false)) {
                                substring = substring.substring(0, k4b.l0(substring, '/', 0, 6) + 1);
                            }
                            i3 = substring.concat(i3);
                        }
                        int g02 = k4b.g0(i3, "?", 0, false, 6);
                        int g03 = k4b.g0(i3, "#", 0, false, 6);
                        if (g02 != -1 && g03 != -1) {
                            g02 = Math.min(g02, g03);
                        } else if (g03 != -1) {
                            g02 = g03;
                        }
                        if (g02 != -1) {
                            str7 = i3.substring(g02);
                            i3 = i3.substring(0, g02);
                        } else {
                            str7 = null;
                        }
                        if (str6.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ArrayList arrayList = new ArrayList(k4b.z0(i3, new String[]{"/"}));
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj = arrayList.get(i5);
                            i5++;
                            int i6 = i4 + 1;
                            if (i4 >= 0) {
                                String str9 = (String) obj;
                                if (str9.length() == 0 || str9.equals(".")) {
                                    if (i4 == arrayList.size() - 1) {
                                        arrayList2.add("");
                                    }
                                } else if (str9.equals("..")) {
                                    if (!arrayList2.isEmpty()) {
                                        arrayList2.remove(arrayList2.size() - 1);
                                    }
                                } else {
                                    arrayList2.add(str9);
                                }
                                i4 = i6;
                            } else {
                                tl1.M();
                                throw null;
                            }
                        }
                        if (z) {
                            str8 = "/";
                        }
                        String concat = str8.concat(sl1.i0(arrayList2, "/", null, null, null, 62));
                        if (str7 != null) {
                            concat = concat.concat(str7);
                        }
                        return str2 + ":" + str3 + str6 + concat;
                    }
                }
            }
            return "";
        }
        cy7.i("String must not be empty");
        return null;
    }

    public final void b(int i, y28... y28VarArr) {
        ap3 ap3Var;
        if (y28VarArr.length == 0) {
            return;
        }
        List l = l();
        cp3 A = y28VarArr[0].A();
        if (A != null && A.g() == y28VarArr.length) {
            List l2 = A.l();
            int length = y28VarArr.length;
            while (true) {
                int i2 = length - 1;
                if (length > 0) {
                    if (!c16.i(y28VarArr[i2], ((ap3) l2).get(i2))) {
                        break;
                    }
                    length = i2;
                } else {
                    int size = A.C.b.size();
                    int i3 = 0;
                    while (true) {
                        ap3Var = A.C;
                        if (i3 >= size) {
                            break;
                        }
                        ap3Var.get(i3).a = null;
                        i3++;
                    }
                    ap3Var.clear();
                    ((ap3) l).addAll(i, tl1.B(Arrays.copyOf(y28VarArr, y28VarArr.length)));
                    int length2 = y28VarArr.length;
                    while (true) {
                        int i4 = length2 - 1;
                        if (length2 > 0) {
                            y28VarArr[i4].a = (cp3) this;
                            length2 = i4;
                        } else {
                            ((cp3) this).C.a = false;
                            return;
                        }
                    }
                }
            }
        }
        for (y28 y28Var : y28VarArr) {
            y28Var.getClass();
            cp3 cp3Var = y28Var.a;
            if (cp3Var != null) {
                cp3Var.E(y28Var);
            }
            y28Var.a = (cp3) this;
        }
        ((ap3) l).addAll(i, tl1.B(Arrays.copyOf(y28VarArr, y28VarArr.length)));
        ((cp3) this).C.a = false;
    }

    public String c(String str) {
        str.getClass();
        if (p()) {
            String h = e().h(str);
            if (h.length() > 0) {
                return h;
            }
            if (r4b.Q(str, "abs:", false)) {
                return a(str.substring(4));
            }
            return "";
        }
        return "";
    }

    public void d(String str, String str2) {
        qm8 qm8Var;
        int i;
        boolean z;
        uc3 z2 = z();
        if (z2 != null) {
            t6f t6fVar = z2.I;
            if (t6fVar != null) {
                qm8Var = (qm8) t6fVar.e;
            } else {
                qm8Var = null;
            }
        } else {
            qm8Var = qm8.c;
        }
        qm8Var.getClass();
        int length = str.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length) {
            if (!z3) {
                i = i2;
            } else {
                i = length;
            }
            if (c16.l(str.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z3) {
                if (!z) {
                    z3 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        String obj = str.subSequence(i2, length + 1).toString();
        if (!qm8Var.b) {
            if (obj != null) {
                obj = obj.toLowerCase(Locale.ROOT);
                obj.getClass();
            } else {
                obj = "";
            }
        }
        j40 e = e();
        obj.getClass();
        int m = e.m(obj);
        if (m != -1) {
            e.c[m] = str2;
            String str3 = e.b[m];
            if (str3 != null && !str3.equals(obj)) {
                e.b[m] = obj;
                return;
            }
            return;
        }
        e.b(obj, str2);
    }

    public abstract j40 e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public abstract String f();

    public abstract int g();

    public final ArrayList h() {
        if (g() == 0) {
            return c;
        }
        List l = l();
        ArrayList arrayList = new ArrayList(l.size());
        arrayList.addAll(l);
        return arrayList;
    }

    @Override // 
    /* renamed from: i */
    public y28 clone() {
        y28 k = k(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(k);
        while (!arrayList.isEmpty()) {
            y28 y28Var = (y28) arrayList.remove(0);
            int g = y28Var.g();
            for (int i = 0; i < g; i++) {
                List l = y28Var.l();
                y28 k2 = ((y28) l.get(i)).k(y28Var);
                l.set(i, k2);
                arrayList.add(k2);
            }
        }
        return k;
    }

    public abstract y28 j();

    public y28 k(y28 y28Var) {
        cp3 cp3Var;
        int G;
        uc3 z;
        y28 j = j();
        if (y28Var instanceof cp3) {
            cp3Var = (cp3) y28Var;
        } else {
            cp3Var = null;
        }
        j.a = cp3Var;
        if (y28Var == null) {
            G = 0;
        } else {
            G = G();
        }
        j.b = G;
        if (y28Var == null && !(this instanceof uc3) && (z = z()) != null) {
            uc3 Y = z.Y();
            j.a = Y;
            ap3 ap3Var = (ap3) Y.l();
            ap3Var.getClass();
            ap3Var.c++;
            ap3Var.b.add(j);
        }
        return j;
    }

    public abstract List l();

    public final y28 m() {
        if (g() == 0) {
            return null;
        }
        return ((ap3) l()).get(0);
    }

    public final boolean n(String str) {
        str.getClass();
        if (!p()) {
            return false;
        }
        if (r4b.Q(str, "abs:", false)) {
            String substring = str.substring(4);
            if (e().j(substring) && a(substring).length() > 0) {
                return true;
            }
        }
        return e().j(str);
    }

    public abstract boolean p();

    public final boolean r(String str) {
        return c16.i(w(), str);
    }

    public final cp3 s() {
        do {
            this = this.t();
            if (this == null) {
                return null;
            }
        } while (!(this instanceof cp3));
        return (cp3) this;
    }

    public final y28 t() {
        cp3 cp3Var = this.a;
        if (cp3Var == null) {
            return null;
        }
        cp3Var.getClass();
        List l = cp3Var.l();
        int G = G() + 1;
        if (((ap3) l).b.size() <= G) {
            return null;
        }
        return ((ap3) l).get(G);
    }

    public String toString() {
        return x();
    }

    public abstract String u();

    public abstract String v();

    public String w() {
        return u();
    }

    public String x() {
        sc3 sc3Var;
        t38 zg4Var;
        StringBuilder b = d4b.b();
        b.getClass();
        bp3 bp3Var = new bp3(1, b);
        uc3 z = z();
        if (z == null || (sc3Var = z.J) == null) {
            sc3Var = new uc3("").J;
        }
        if (sc3Var.d) {
            zg4Var = new b69(this, bp3Var, sc3Var);
        } else if (sc3Var.c) {
            zg4Var = new b69(this, bp3Var, sc3Var);
        } else {
            zg4Var = new zg4(26, this, bp3Var, sc3Var);
        }
        zg4Var.u(this);
        String sb = b.toString();
        d4b.m(b);
        return sb;
    }

    public abstract void y(bp3 bp3Var, sc3 sc3Var);

    public final uc3 z() {
        while (this != null) {
            if (this instanceof uc3) {
                return (uc3) this;
            }
            this = this.a;
        }
        return null;
    }
}
