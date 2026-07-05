package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: umc  reason: default package */
/* loaded from: classes3.dex */
public final class umc {
    public final boolean a;
    public final int b;
    public final int c;
    public final boolean d;
    public final String e;

    public umc(int i, int i2, String str, boolean z, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof umc) {
                umc umcVar = (umc) obj;
                if (this.a != umcVar.a || this.b != umcVar.b || this.c != umcVar.c || this.d != umcVar.d || !this.e.equals(umcVar.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.k(eub.k(hl5.a(this.c, hl5.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31, true), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Info(supportAutoDetect=");
        sb.append(this.a);
        sb.append(", maxInputLine=");
        sb.append(this.b);
        sb.append(", maxInputLength=");
        eub.w(sb, this.c, ", isNetworkRequired=true, hasApiKey=", this.d, ", supportUrl=");
        return s21.q(sb, this.e, ")");
    }
}
