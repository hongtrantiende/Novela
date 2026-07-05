package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o1c  reason: default package */
/* loaded from: classes3.dex */
public final class o1c {
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final String e;

    public o1c(int i, int i2, String str, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o1c) {
                o1c o1cVar = (o1c) obj;
                if (this.a != o1cVar.a || this.b != o1cVar.b || this.c != o1cVar.c || this.d != o1cVar.d || !this.e.equals(o1cVar.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.k(hl5.a(this.c, eub.k(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TtsInfo(preload=");
        sb.append(this.a);
        sb.append(", preloadParallel=");
        sb.append(this.b);
        sb.append(", maxLength=");
        eub.w(sb, this.c, ", requiredApiKey=", this.d, ", supportUrl=");
        return s21.q(sb, this.e, ")");
    }
}
