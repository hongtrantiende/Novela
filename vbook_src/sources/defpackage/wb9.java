package defpackage;

import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wb9  reason: default package */
/* loaded from: classes3.dex */
public final class wb9 {
    public final List a;
    public final String b;
    public final ce9 c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Set i;
    public final boolean j;

    public wb9(List list, String str, ce9 ce9Var, int i, boolean z, boolean z2, boolean z3, boolean z4, Set set, boolean z5) {
        list.getClass();
        set.getClass();
        this.a = list;
        this.b = str;
        this.c = ce9Var;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = set;
        this.j = z5;
    }

    public static wb9 a(wb9 wb9Var, List list, String str, ce9 ce9Var, int i, boolean z, boolean z2, boolean z3, boolean z4, Set set, boolean z5, int i2) {
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Set set2;
        boolean z10;
        if ((i2 & 1) != 0) {
            list = wb9Var.a;
        }
        List list2 = list;
        if ((i2 & 2) != 0) {
            str = wb9Var.b;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            ce9Var = wb9Var.c;
        }
        ce9 ce9Var2 = ce9Var;
        if ((i2 & 8) != 0) {
            i = wb9Var.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z6 = wb9Var.e;
        } else {
            z6 = z;
        }
        if ((i2 & 32) != 0) {
            z7 = wb9Var.f;
        } else {
            z7 = z2;
        }
        if ((i2 & 64) != 0) {
            z8 = wb9Var.g;
        } else {
            z8 = z3;
        }
        if ((i2 & Token.CASE) != 0) {
            z9 = wb9Var.h;
        } else {
            z9 = z4;
        }
        if ((i2 & 256) != 0) {
            set2 = wb9Var.i;
        } else {
            set2 = set;
        }
        if ((i2 & 512) != 0) {
            z10 = wb9Var.j;
        } else {
            z10 = z5;
        }
        wb9Var.getClass();
        list2.getClass();
        str2.getClass();
        set2.getClass();
        return new wb9(list2, str2, ce9Var2, i3, z6, z7, z8, z9, set2, z10);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wb9) {
                wb9 wb9Var = (wb9) obj;
                if (!c16.i(this.a, wb9Var.a) || !this.b.equals(wb9Var.b) || this.c != wb9Var.c || this.d != wb9Var.d || this.e != wb9Var.e || this.f != wb9Var.f || this.g != wb9Var.g || this.h != wb9Var.h || !c16.i(this.i, wb9Var.i) || this.j != wb9Var.j) {
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
        int j = eub.j(this.a.hashCode() * 31, 31, this.b);
        ce9 ce9Var = this.c;
        if (ce9Var == null) {
            hashCode = 0;
        } else {
            hashCode = ce9Var.hashCode();
        }
        return Boolean.hashCode(this.j) + s21.b(this.i, eub.k(eub.k(eub.k(eub.k(hl5.a(this.d, (j + hashCode) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QtDictionaryEditState(items=");
        sb.append(this.a);
        sb.append(", query=");
        sb.append(this.b);
        sb.append(", searchMode=");
        sb.append(this.c);
        sb.append(", totalCount=");
        sb.append(this.d);
        sb.append(", isLoading=");
        rs8.z(sb, this.e, ", isSearching=", this.f, ", isSaving=");
        rs8.z(sb, this.g, ", hasChanges=", this.h, ", selectedWords=");
        sb.append(this.i);
        sb.append(", isSelectionMode=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
