package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bxa  reason: default package */
/* loaded from: classes3.dex */
public final class bxa implements mo3 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;
    public final List g;

    public bxa(String str, int i, String str2, String str3, List list, String str4, List list2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = str4;
        this.g = list2;
    }

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        cm0 cm0Var;
        hn0 hn0Var;
        so3Var.getClass();
        String str = this.a;
        xl0 c = so3Var.c(str);
        if (c != null) {
            hn0 hn0Var2 = c.b;
            dm0 dm0Var = c.c;
            if (dm0Var instanceof cm0) {
                cm0Var = (cm0) dm0Var;
            } else {
                cm0Var = null;
            }
            if (cm0Var != null) {
                String str2 = cm0Var.a;
                int e = so3Var.e(str);
                int n = dce.n(this.b, 0, str2.length());
                String str3 = this.c;
                if (str3 == null) {
                    str3 = k4b.X(n, str2);
                }
                String str4 = this.f;
                if (str4 == null) {
                    str4 = k4b.L0(n, str2);
                }
                yk8 I = zbe.I(n, cm0Var.b);
                List list = (List) I.a;
                List list2 = (List) I.b;
                List list3 = this.g;
                if (list3 != null) {
                    list = list3;
                }
                List w = zbe.w(str4.length(), list);
                List list4 = this.e;
                if (list4 != null) {
                    list2 = list4;
                }
                List w2 = zbe.w(str3.length(), list2);
                if (hn0Var2 instanceof dn0) {
                    hn0Var = new dn0(((dn0) hn0Var2).a + 1);
                } else if (hn0Var2 instanceof zm0) {
                    hn0Var = zm0.a;
                } else if (hn0Var2 instanceof gn0) {
                    hn0Var = new gn0(false);
                } else {
                    hn0Var = en0.a;
                }
                cm0 cm0Var2 = new cm0(str3, w2);
                yl0 yl0Var = c.d;
                if (!hn0Var2.a() || !hn0Var.a()) {
                    yl0Var.getClass();
                    yl0Var = new yl0(0);
                }
                String str5 = this.d;
                xl0 xl0Var = new xl0(str5, hn0Var, cm0Var2, yl0Var);
                ArrayList E0 = sl1.E0(so3Var.a);
                E0.set(e, xl0.a(c, null, new cm0(str4, w), null, 11));
                E0.add(e + 1, xl0Var);
                return so3.a(so3Var, tl1.H(qwe.o(E0)), str5, null, null, null, 28);
            }
        }
        return so3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bxa) {
                bxa bxaVar = (bxa) obj;
                if (!c16.i(this.a, bxaVar.a) || this.b != bxaVar.b || !c16.i(this.c, bxaVar.c) || !this.d.equals(bxaVar.d) || !c16.i(this.e, bxaVar.e) || !c16.i(this.f, bxaVar.f) || !c16.i(this.g, bxaVar.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int a = hl5.a(this.b, this.a.hashCode() * 31, 31);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int j = eub.j((a + hashCode) * 31, 31, this.d);
        List list = this.e;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i2 = (j + hashCode2) * 31;
        String str2 = this.f;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        List list2 = this.g;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        String a = pm0.a(this.a);
        String a2 = pm0.a(this.d);
        StringBuilder s = s21.s("SplitBlock(blockId=", a, ", atPosition=", this.b, ", newBlockText=");
        nk2.C(s, this.c, ", newBlockId=", a2, ", newBlockSpans=");
        s.append(this.e);
        s.append(", sourceBlockText=");
        s.append(this.f);
        s.append(", sourceBlockSpans=");
        return rs8.n(s, this.g, ")");
    }
}
