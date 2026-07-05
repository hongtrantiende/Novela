package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xw5  reason: default package */
/* loaded from: classes3.dex */
public final class xw5 implements mo3 {
    public final xl0 a;
    public final String b;

    public xw5(xl0 xl0Var, String str) {
        this.a = xl0Var;
        this.b = str;
    }

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        int e;
        so3Var.getClass();
        List list = so3Var.a;
        String str = this.b;
        if (str == null) {
            e = list.size();
        } else {
            e = so3Var.e(str);
            if (e == -1) {
                e = list.size();
            }
        }
        ArrayList E0 = sl1.E0(list);
        E0.add(e, this.a);
        return so3.a(so3Var, tl1.H(qwe.o(E0)), null, null, null, null, 30);
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof xw5) {
                xw5 xw5Var = (xw5) obj;
                if (this.a.equals(xw5Var.a)) {
                    String str = xw5Var.b;
                    String str2 = this.b;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        String a;
        String str = this.b;
        if (str == null) {
            a = "null";
        } else {
            a = pm0.a(str);
        }
        return "InsertBlockBefore(block=" + this.a + ", beforeBlockId=" + a + ")";
    }
}
