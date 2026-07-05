package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hua  reason: default package */
/* loaded from: classes3.dex */
public final class hua {
    public final String a;
    public final String b;
    public final String c;

    public hua(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hua) {
            hua huaVar = (hua) obj;
            if (this.a.equals(huaVar.a) && this.b.equals(huaVar.b) && this.c.equals(huaVar.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return s21.q(nk2.y("SourceScript(name=", this.a, ", input=", this.b, ", script="), this.c, ", style=0)");
    }
}
