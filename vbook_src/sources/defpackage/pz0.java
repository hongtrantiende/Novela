package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pz0  reason: default package */
/* loaded from: classes3.dex */
public final class pz0 {
    public final oz0 a;
    public final String b;

    public pz0(oz0 oz0Var) {
        this.a = oz0Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        boolean i;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz0)) {
            return false;
        }
        pz0 pz0Var = (pz0) obj;
        if (!c16.i(this.a, pz0Var.a)) {
            return false;
        }
        String str = pz0Var.b;
        String str2 = this.b;
        if (str2 == null) {
            if (str == null) {
                i = true;
            }
            i = false;
        } else {
            if (str != null) {
                i = c16.i(str2, str);
            }
            i = false;
        }
        if (i) {
            return true;
        }
        return false;
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
        String n;
        String str = this.b;
        if (str == null) {
            n = "null";
        } else {
            n = hl5.n("SlashCommandIconKey(value=", str, ")");
        }
        return "BuiltInSlashCommandSpec(behavior=" + this.a + ", icon=" + n + ")";
    }

    public pz0(oz0 oz0Var, String str) {
        this.a = oz0Var;
        this.b = str;
    }
}
