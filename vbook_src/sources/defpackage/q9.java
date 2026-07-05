package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q9  reason: default package */
/* loaded from: classes3.dex */
public final class q9 {
    public final f76 a;
    public final f76 b;
    public final String c;
    public final String d;
    public final m9 e;
    public final boolean f;

    public q9(f76 f76Var, f76 f76Var2, String str, String str2, m9 m9Var, boolean z) {
        m9Var.getClass();
        this.a = f76Var;
        this.b = f76Var2;
        this.c = str;
        this.d = str2;
        this.e = m9Var;
        this.f = z;
    }

    public static q9 a(q9 q9Var, f76 f76Var, f76 f76Var2, String str, String str2, m9 m9Var, boolean z, int i) {
        if ((i & 1) != 0) {
            f76Var = q9Var.a;
        }
        f76 f76Var3 = f76Var;
        if ((i & 2) != 0) {
            f76Var2 = q9Var.b;
        }
        f76 f76Var4 = f76Var2;
        if ((i & 4) != 0) {
            str = q9Var.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = q9Var.d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            m9Var = q9Var.e;
        }
        m9 m9Var2 = m9Var;
        if ((i & 32) != 0) {
            z = q9Var.f;
        }
        q9Var.getClass();
        str3.getClass();
        str4.getClass();
        m9Var2.getClass();
        return new q9(f76Var3, f76Var4, str3, str4, m9Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q9) {
                q9 q9Var = (q9) obj;
                if (!c16.i(this.a, q9Var.a) || !c16.i(this.b, q9Var.b) || !this.c.equals(q9Var.c) || !this.d.equals(q9Var.d) || this.e != q9Var.e || this.f != q9Var.f) {
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
        int i = 0;
        f76 f76Var = this.a;
        if (f76Var == null) {
            hashCode = 0;
        } else {
            hashCode = f76Var.hashCode();
        }
        int i2 = hashCode * 31;
        f76 f76Var2 = this.b;
        if (f76Var2 != null) {
            i = f76Var2.hashCode();
        }
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + eub.j(eub.j((i2 + i) * 31, 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AiTtsImportState(modelFile=");
        sb.append(this.a);
        sb.append(", tokensFile=");
        sb.append(this.b);
        sb.append(", name=");
        nk2.C(sb, this.c, ", language=", this.d, ", gender=");
        sb.append(this.e);
        sb.append(", isImporting=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
