package defpackage;

import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kb2  reason: default package */
/* loaded from: classes3.dex */
public final class kb2 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final Set h;
    public final List i;

    public kb2(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, Set set, List list) {
        set.getClass();
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = str;
        this.g = str2;
        this.h = set;
        this.i = list;
    }

    public static kb2 a(kb2 kb2Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, Set set, List list, int i) {
        String str3;
        String str4;
        Set set2;
        List list2;
        if ((i & 1) != 0) {
            z = kb2Var.a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = kb2Var.b;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = kb2Var.c;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = kb2Var.d;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = kb2Var.e;
        }
        boolean z10 = z5;
        if ((i & 32) != 0) {
            str3 = kb2Var.f;
        } else {
            str3 = str;
        }
        if ((i & 64) != 0) {
            str4 = kb2Var.g;
        } else {
            str4 = str2;
        }
        if ((i & Token.CASE) != 0) {
            set2 = kb2Var.h;
        } else {
            set2 = set;
        }
        if ((i & 256) != 0) {
            list2 = kb2Var.i;
        } else {
            list2 = list;
        }
        kb2Var.getClass();
        str3.getClass();
        str4.getClass();
        set2.getClass();
        list2.getClass();
        return new kb2(z6, z7, z8, z9, z10, str3, str4, set2, list2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kb2) {
                kb2 kb2Var = (kb2) obj;
                if (this.a != kb2Var.a || this.b != kb2Var.b || this.c != kb2Var.c || this.d != kb2Var.d || this.e != kb2Var.e || !this.f.equals(kb2Var.f) || !this.g.equals(kb2Var.g) || !c16.i(this.h, kb2Var.h) || !c16.i(this.i, kb2Var.i)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.i.hashCode() + s21.b(this.h, eub.j(eub.j(eub.k(eub.k(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("CreateGroupConversationState(isLoading=", this.a, ", isError=", this.b, ", isCreating=");
        rs8.z(p, this.c, ", hasMore=", this.d, ", isAdmin=");
        p.append(this.e);
        p.append(", groupName=");
        p.append(this.f);
        p.append(", visibility=");
        p.append(this.g);
        p.append(", selectedUserIds=");
        p.append(this.h);
        p.append(", users=");
        return rs8.n(p, this.i, ")");
    }
}
