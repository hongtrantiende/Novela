package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eq1  reason: default package */
/* loaded from: classes3.dex */
public final class eq1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final List d;

    public eq1(List list, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
    }

    public static eq1 a(eq1 eq1Var, boolean z, boolean z2, List list, int i) {
        if ((i & 1) != 0) {
            z = eq1Var.a;
        }
        boolean z3 = eq1Var.b;
        if ((i & 4) != 0) {
            z2 = eq1Var.c;
        }
        if ((i & 8) != 0) {
            list = eq1Var.d;
        }
        eq1Var.getClass();
        return new eq1(list, z, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq1)) {
            return false;
        }
        eq1 eq1Var = (eq1) obj;
        if (this.a == eq1Var.a && this.b == eq1Var.b && this.c == eq1Var.c && c16.i(this.d, eq1Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        List list = this.d;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return k + hashCode;
    }

    public final String toString() {
        StringBuilder p = rs8.p("CommentEditorState(isPublishing=", this.a, ", isEditing=", this.b, ", isLoading=");
        p.append(this.c);
        p.append(", initialBlocks=");
        p.append(this.d);
        p.append(")");
        return p.toString();
    }
}
