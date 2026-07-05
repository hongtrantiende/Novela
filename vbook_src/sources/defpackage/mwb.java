package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mwb  reason: default package */
/* loaded from: classes3.dex */
public final class mwb {
    public final rk9 a;
    public final String b;
    public final String c;

    public mwb(rk9 rk9Var, String str, String str2) {
        this.a = rk9Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mwb) {
                mwb mwbVar = (mwb) obj;
                if (!this.a.equals(mwbVar.a) || !this.b.equals(mwbVar.b) || !this.c.equals(mwbVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Placeholder(rect=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", data=");
        return s21.q(sb, this.c, ")");
    }
}
