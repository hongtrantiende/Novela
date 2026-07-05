package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xfa  reason: default package */
/* loaded from: classes3.dex */
public final class xfa {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final vl6 f;
    public final jo3 g;
    public final String h;
    public final float i;
    public final boolean j;

    public xfa(String str, boolean z, boolean z2, boolean z3, List list, vl6 vl6Var, jo3 jo3Var, String str2, float f, boolean z4) {
        list.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = list;
        this.f = vl6Var;
        this.g = jo3Var;
        this.h = str2;
        this.i = f;
        this.j = z4;
    }

    public static xfa a(xfa xfaVar, String str, boolean z, boolean z2, List list, vl6 vl6Var, jo3 jo3Var, String str2, float f, boolean z3, int i) {
        vl6 vl6Var2;
        jo3 jo3Var2;
        String str3;
        float f2;
        boolean z4;
        if ((i & 1) != 0) {
            str = xfaVar.a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            z = xfaVar.b;
        }
        boolean z5 = z;
        boolean z6 = xfaVar.c;
        if ((i & 8) != 0) {
            z2 = xfaVar.d;
        }
        boolean z7 = z2;
        if ((i & 16) != 0) {
            list = xfaVar.e;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            vl6Var2 = xfaVar.f;
        } else {
            vl6Var2 = vl6Var;
        }
        if ((i & 64) != 0) {
            jo3Var2 = xfaVar.g;
        } else {
            jo3Var2 = jo3Var;
        }
        if ((i & Token.CASE) != 0) {
            str3 = xfaVar.h;
        } else {
            str3 = str2;
        }
        if ((i & 256) != 0) {
            f2 = xfaVar.i;
        } else {
            f2 = f;
        }
        if ((i & 512) != 0) {
            z4 = xfaVar.j;
        } else {
            z4 = z3;
        }
        xfaVar.getClass();
        str4.getClass();
        list2.getClass();
        str3.getClass();
        return new xfa(str4, z5, z6, z7, list2, vl6Var2, jo3Var2, str3, f2, z4);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xfa) {
                xfa xfaVar = (xfa) obj;
                if (!this.a.equals(xfaVar.a) || this.b != xfaVar.b || this.c != xfaVar.c || this.d != xfaVar.d || !c16.i(this.e, xfaVar.e) || !c16.i(this.f, xfaVar.f) || !c16.i(this.g, xfaVar.g) || !this.h.equals(xfaVar.h) || Float.compare(this.i, xfaVar.i) != 0 || this.j != xfaVar.j) {
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
        int l = eub.l(eub.k(eub.k(eub.k(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31);
        int i = 0;
        vl6 vl6Var = this.f;
        if (vl6Var == null) {
            hashCode = 0;
        } else {
            hashCode = vl6Var.hashCode();
        }
        int i2 = (l + hashCode) * 31;
        jo3 jo3Var = this.g;
        if (jo3Var != null) {
            i = jo3Var.hashCode();
        }
        return Boolean.hashCode(this.j) + nk2.d(this.i, eub.j((i2 + i) * 31, 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareBookState(query=");
        sb.append(this.a);
        sb.append(", isSearching=");
        sb.append(this.b);
        sb.append(", isEditing=");
        rs8.z(sb, this.c, ", isLoading=", this.d, ", books=");
        sb.append(this.e);
        sb.append(", selectedBook=");
        sb.append(this.f);
        sb.append(", editingBook=");
        sb.append(this.g);
        sb.append(", message=");
        sb.append(this.h);
        sb.append(", rate=");
        sb.append(this.i);
        sb.append(", isPublishing=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
