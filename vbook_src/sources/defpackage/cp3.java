package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cp3  reason: default package */
/* loaded from: classes.dex */
public class cp3 extends y28 implements Iterable, j76 {
    public static final ap3 E = new ap3(0);
    public static final String F;
    public ap3 C;
    public j40 D;
    public final Object d;
    public wjb e;
    public final String f;

    static {
        Pattern.compile("\\s+").getClass();
        F = "/".concat("baseUri");
    }

    public cp3(wjb wjbVar, String str, j40 j40Var) {
        wjbVar.getClass();
        this.d = new Object();
        this.C = E;
        this.D = j40Var;
        this.e = wjbVar;
        this.f = str;
        if (!d4b.e(str)) {
            str.getClass();
            N(str);
        }
    }

    public static cp3 I(cp3 cp3Var, String str) {
        t6f t6fVar;
        String str2 = cp3Var.e.c;
        str2.getClass();
        uc3 z = cp3Var.z();
        if (z == null || (t6fVar = z.I) == null) {
            t6fVar = new t6f(new ed5());
        }
        fkb n = t6fVar.n();
        qm8 qm8Var = (qm8) t6fVar.e;
        qm8Var.getClass();
        cp3 cp3Var2 = new cp3(n.c(str, qm8Var.a, null, str2), cp3Var.f(), null);
        cp3Var.H(cp3Var2);
        return cp3Var2;
    }

    @Override // defpackage.y28
    public final cp3 A() {
        cp3 cp3Var = this.a;
        if (cp3Var != null) {
            return cp3Var;
        }
        return null;
    }

    public final void H(y28 y28Var) {
        y28Var.getClass();
        cp3 cp3Var = y28Var.a;
        if (cp3Var != null) {
            cp3Var.E(y28Var);
        }
        y28Var.a = this;
        l();
        ap3 ap3Var = this.C;
        ap3Var.getClass();
        ap3Var.c++;
        ap3Var.b.add(y28Var);
        y28Var.b = this.C.b.size() - 1;
    }

    public final List J() {
        Object invoke;
        if (g() == 0) {
            return ks3.a;
        }
        Object obj = this.d;
        t42 t42Var = new t42(this, 14);
        synchronized (obj) {
            invoke = t42Var.invoke();
        }
        return (List) invoke;
    }

    public final hp3 K() {
        List J = J();
        hp3 hp3Var = new hp3();
        hp3Var.a.addAll(J);
        return hp3Var;
    }

    public final void L() {
        if (this.D != null) {
            if (p()) {
                i40 i40Var = new i40(e());
                while (i40Var.hasNext()) {
                    i40Var.next();
                    i40Var.remove();
                }
            }
            j40 j40Var = this.D;
            j40Var.getClass();
            if (j40Var.a == 0) {
                this.D = null;
            }
        }
    }

    @Override // defpackage.y28
    /* renamed from: M */
    public cp3 i() {
        return (cp3) super.clone();
    }

    public final void N(String str) {
        e().n(F, str);
    }

    public final int O() {
        cp3 cp3Var = this.a;
        if (cp3Var == null) {
            cp3Var = null;
        }
        if (cp3Var != null) {
            List J = cp3Var.J();
            int size = J.size();
            for (int i = 0; i < size; i++) {
                if (J.get(i) == this) {
                    return i;
                }
            }
        }
        return 0;
    }

    public final cp3 P() {
        int size = this.C.b.size();
        for (int i = 0; i < size; i++) {
            y28 y28Var = this.C.get(i);
            if (y28Var instanceof cp3) {
                return (cp3) y28Var;
            }
        }
        return null;
    }

    public final hp3 Q() {
        return sue.l(new ww3(tte.r("title"), 9), this);
    }

    public final String R() {
        sc3 sc3Var;
        int i;
        boolean z;
        sc3 sc3Var2;
        t38 zg4Var;
        StringBuilder b = d4b.b();
        b.getClass();
        y28 m = m();
        if (m != null) {
            bp3 bp3Var = new bp3(1, b);
            uc3 z2 = m.z();
            if (z2 == null || (sc3Var2 = z2.J) == null) {
                sc3Var2 = new uc3("").J;
            }
            if (sc3Var2.d) {
                zg4Var = new b69(m, bp3Var, sc3Var2);
            } else if (sc3Var2.c) {
                zg4Var = new b69(m, bp3Var, sc3Var2);
            } else {
                zg4Var = new zg4(26, m, bp3Var, sc3Var2);
            }
            while (m != null) {
                zg4Var.u(m);
                m = m.t();
            }
        }
        String[] strArr = d4b.a;
        String sb = b.toString();
        d4b.m(b);
        uc3 z3 = z();
        if (z3 == null || (sc3Var = z3.J) == null) {
            sc3Var = new uc3("").J;
        }
        if (sc3Var.c) {
            int length = sb.length() - 1;
            int i2 = 0;
            boolean z4 = false;
            while (i2 <= length) {
                if (!z4) {
                    i = i2;
                } else {
                    i = length;
                }
                if (c16.l(sb.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z4) {
                    if (!z) {
                        z4 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            return sb.subSequence(i2, length + 1).toString();
        }
        return sb;
    }

    public final void T(Collection collection) {
        boolean z;
        int g = g();
        if (g >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            y28[] y28VarArr = (y28[]) collection.toArray(new y28[0]);
            b(g, (y28[]) Arrays.copyOf(y28VarArr, y28VarArr.length));
            return;
        }
        cy7.i("Insert position out of bounds.");
    }

    public void U(bp3 bp3Var, sc3 sc3Var) {
        String str;
        if (!this.C.b.isEmpty()) {
            bp3Var.c("</");
            rc3 rc3Var = sc3Var.g;
            wjb wjbVar = this.e;
            rc3 rc3Var2 = rc3.b;
            if (rc3Var == rc3Var2) {
                String str2 = wjbVar.a;
                str2.getClass();
                String[] strArr = g40.d;
                str = twe.k(str2, rc3Var2);
            } else {
                str = wjbVar.a;
            }
            bp3Var.c(str);
            bp3Var.b('>');
        }
    }

    public final String V() {
        StringBuilder b = d4b.b();
        int g = g();
        for (int i = 0; i < g; i++) {
            y28 y28Var = this.C.get(i);
            if (y28Var instanceof fwb) {
                cne.d(b, (fwb) y28Var);
            } else if (y28Var.r("br")) {
                b.getClass();
                if (b.length() <= 0 || b.charAt(b.length() - 1) != ' ') {
                    b.append(" ");
                }
            }
        }
        return k4b.N0(d4b.l(b)).toString();
    }

    public final hp3 W(String str) {
        if (str.length() != 0) {
            char[] cArr = rf9.d;
            return sue.l(xbe.I(str), this);
        }
        cy7.i("String must not be empty");
        return null;
    }

    public final cp3 X(String str) {
        if (str.length() != 0) {
            char[] cArr = rf9.d;
            ex3 I = xbe.I(str);
            I.e();
            cp3 cp3Var = (cp3) g9a.c0(new ff4(g9a.b0(new n38(this, cm9.a(cp3.class))), true, new uw3(I, this, 1)));
            I.e();
            return cp3Var;
        }
        cy7.i("String must not be empty");
        return null;
    }

    public cp3 Y() {
        String f = f();
        j40 j40Var = null;
        if (f.length() == 0) {
            f = null;
        }
        wjb wjbVar = this.e;
        j40 j40Var2 = this.D;
        if (j40Var2 != null) {
            j40Var = j40Var2.clone();
        }
        return new cp3(wjbVar, f, j40Var);
    }

    public final String Z() {
        StringBuilder b = d4b.b();
        new bp3(0, b).u(this);
        String sb = b.toString();
        d4b.m(b);
        return k4b.N0(sb).toString();
    }

    @Override // defpackage.y28
    public final j40 e() {
        if (this.D == null) {
            this.D = new j40();
        }
        j40 j40Var = this.D;
        j40Var.getClass();
        return j40Var;
    }

    @Override // defpackage.y28
    public final String f() {
        String str;
        String str2 = F;
        str2.getClass();
        while (true) {
            str = null;
            if (this != null) {
                j40 j40Var = this.D;
                if (j40Var != null && j40Var.i(str2)) {
                    j40 j40Var2 = this.D;
                    j40Var2.getClass();
                    str = j40Var2.g(str2);
                    break;
                }
                this = this.a;
                if (this == null) {
                    this = null;
                }
            } else {
                break;
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // defpackage.y28
    public final int g() {
        return this.C.b.size();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new n38(this, cm9.a(cp3.class));
    }

    @Override // defpackage.y28
    public y28 j() {
        cp3 cp3Var = new cp3(this.e, this.f);
        cp3Var.D = this.D;
        cp3Var.C = this.C;
        return cp3Var;
    }

    @Override // defpackage.y28
    public final y28 k(y28 y28Var) {
        cp3 cp3Var = (cp3) super.k(y28Var);
        ap3 ap3Var = new ap3(this.C.b.size());
        cp3Var.C = ap3Var;
        ap3Var.addAll(this.C);
        j40 j40Var = this.D;
        if (j40Var != null) {
            j40 clone = j40Var.clone();
            cp3Var.D = clone;
            clone.s(null, "ksoup.childEls");
        }
        return cp3Var;
    }

    @Override // defpackage.y28
    public final List l() {
        if (c16.i(this.C, E)) {
            this.C = new ap3(4);
        }
        return this.C;
    }

    @Override // defpackage.y28
    public final boolean p() {
        if (this.D != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.y28
    public String u() {
        return this.e.a;
    }

    @Override // defpackage.y28
    public final String v() {
        return g9a.d0(new ki4(3, sl1.V(h()), new u83(21)), "");
    }

    @Override // defpackage.y28
    public final String w() {
        return this.e.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r5.e.d() != false) goto L23;
     */
    @Override // defpackage.y28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(defpackage.bp3 r6, defpackage.sc3 r7) {
        /*
            r5 = this;
            rc3 r0 = r7.g
            wjb r1 = r5.e
            rc3 r2 = defpackage.rc3.b
            if (r0 != r2) goto L14
            java.lang.String r0 = r1.a
            r0.getClass()
            java.lang.String[] r1 = defpackage.g40.d
            java.lang.String r0 = defpackage.twe.k(r0, r2)
            goto L16
        L14:
            java.lang.String r0 = r1.a
        L16:
            r1 = 60
            r6.b(r1)
            r6.c(r0)
            j40 r1 = r5.D
            if (r1 == 0) goto L25
            r1.k(r6, r7)
        L25:
            ap3 r1 = r5.C
            java.util.ArrayList r1 = r1.b
            boolean r1 = r1.isEmpty()
            r3 = 62
            if (r1 == 0) goto L87
            rc3 r7 = r7.g
            r1 = 1
            if (r7 == r2) goto L45
            wjb r7 = r5.e
            java.lang.String r7 = r7.c
            java.lang.String r2 = "http://www.w3.org/1999/xhtml"
            boolean r7 = defpackage.c16.i(r7, r2)
            if (r7 != 0) goto L43
            goto L45
        L43:
            r7 = 0
            goto L46
        L45:
            r7 = r1
        L46:
            if (r7 == 0) goto L6d
            wjb r2 = r5.e
            r4 = 32
            boolean r2 = r2.b(r4)
            if (r2 != 0) goto L67
            wjb r2 = r5.e
            int r4 = r2.d
            r1 = r1 & r4
            if (r1 == 0) goto L6d
            boolean r1 = r2.c()
            if (r1 != 0) goto L67
            wjb r1 = r5.e
            boolean r1 = r1.d()
            if (r1 == 0) goto L6d
        L67:
            java.lang.String r5 = " />"
            r6.c(r5)
            return
        L6d:
            if (r7 != 0) goto L7b
            wjb r5 = r5.e
            boolean r5 = r5.c()
            if (r5 == 0) goto L7b
            r6.b(r3)
            return
        L7b:
            java.lang.String r5 = "></"
            r6.c(r5)
            r6.c(r0)
            r6.b(r3)
            return
        L87:
            r6.b(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cp3.y(bp3, sc3):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cp3(wjb wjbVar, String str) {
        this(wjbVar, str, null);
        wjbVar.getClass();
    }
}
