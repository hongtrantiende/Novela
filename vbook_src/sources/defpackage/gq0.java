package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gq0  reason: default package */
/* loaded from: classes3.dex */
public final class gq0 {
    public final boolean a;
    public final boolean b;
    public final vl6 c;
    public final go0 d;
    public final String e;

    public gq0(boolean z, boolean z2, vl6 vl6Var, go0 go0Var, String str) {
        this.a = z;
        this.b = z2;
        this.c = vl6Var;
        this.d = go0Var;
        this.e = str;
    }

    public static gq0 a(gq0 gq0Var, boolean z, boolean z2, vl6 vl6Var, go0 go0Var, String str, int i) {
        if ((i & 1) != 0) {
            z = gq0Var.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = gq0Var.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            vl6Var = gq0Var.c;
        }
        vl6 vl6Var2 = vl6Var;
        if ((i & 8) != 0) {
            go0Var = gq0Var.d;
        }
        go0 go0Var2 = go0Var;
        if ((i & 16) != 0) {
            str = gq0Var.e;
        }
        String str2 = str;
        gq0Var.getClass();
        str2.getClass();
        return new gq0(z3, z4, vl6Var2, go0Var2, str2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gq0) {
                gq0 gq0Var = (gq0) obj;
                if (this.a != gq0Var.a || this.b != gq0Var.b || !c16.i(this.c, gq0Var.c) || !c16.i(this.d, gq0Var.d) || !this.e.equals(gq0Var.e)) {
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
        int k = eub.k(Boolean.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        vl6 vl6Var = this.c;
        if (vl6Var == null) {
            hashCode = 0;
        } else {
            hashCode = vl6Var.hashCode();
        }
        int i2 = (k + hashCode) * 31;
        go0 go0Var = this.d;
        if (go0Var != null) {
            i = go0Var.hashCode();
        }
        return this.e.hashCode() + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("BookMigrateState(isMigrating=", this.a, ", isMigrated=", this.b, ", currentBook=");
        p.append(this.c);
        p.append(", migrateBook=");
        p.append(this.d);
        p.append(", extensionId=");
        return s21.q(p, this.e, ")");
    }
}
