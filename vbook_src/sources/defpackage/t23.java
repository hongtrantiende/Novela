package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t23  reason: default package */
/* loaded from: classes3.dex */
public final class t23 {
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final long e;
    public final boolean f;
    public final boolean g;

    public t23(int i, String str, int i2, String str2, long j, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = j;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t23) {
                t23 t23Var = (t23) obj;
                if (this.a != t23Var.a || !this.b.equals(t23Var.b) || this.c != t23Var.c || !this.d.equals(t23Var.d) || this.e != t23Var.e || this.f != t23Var.f || this.g != t23Var.g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + eub.k(hl5.c(eub.j(hl5.a(this.c, eub.j(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), this.e, 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder r = s21.r("DetailChapter(index=", this.a, ", name=", this.b, ", type=");
        nk2.z(this.c, ", description=", this.d, ", lastRead=", r);
        r.append(this.e);
        r.append(", isLock=");
        r.append(this.f);
        r.append(", isPay=");
        r.append(this.g);
        r.append(")");
        return r.toString();
    }
}
