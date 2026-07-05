package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: te9  reason: default package */
/* loaded from: classes3.dex */
public final class te9 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public te9(int i, String str, String str2, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof te9) {
                te9 te9Var = (te9) obj;
                if (!c16.i(this.a, te9Var.a) || !c16.i(this.b, te9Var.b) || this.c != te9Var.c || this.d != te9Var.d) {
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
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.d) + hl5.a(this.c, (hashCode2 + hashCode) * 31, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Word(chinese=", this.a, ", vietnamese=", this.b, ", type=");
        y.append(this.c);
        y.append(", isPriv=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
