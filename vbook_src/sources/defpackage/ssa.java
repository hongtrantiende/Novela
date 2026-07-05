package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ssa  reason: default package */
/* loaded from: classes3.dex */
public final class ssa {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ssa(String str, String str2, String str3, String str4) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ssa) {
                ssa ssaVar = (ssa) obj;
                if (this.a.equals(ssaVar.a) && this.b.equals(ssaVar.b) && c16.i(this.c, ssaVar.c) && this.d.equals(ssaVar.d)) {
                    ks3 ks3Var = ks3.a;
                    if (!ks3Var.equals(ks3Var)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.d.hashCode() + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31) + 1;
    }

    public final String toString() {
        StringBuilder y = nk2.y("SourceComment(userName=", this.a, ", userAvatar=", this.b, ", content=");
        nk2.C(y, this.c, ", description=", this.d, ", subSourceComments=");
        y.append(ks3.a);
        y.append(")");
        return y.toString();
    }
}
