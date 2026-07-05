package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m29  reason: default package */
/* loaded from: classes.dex */
public final class m29 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public m29(boolean z, i4a i4aVar, boolean z2) {
        int i;
        boolean z3;
        ly1 ly1Var = tk.a;
        if (!z) {
            i = 262152;
        } else {
            i = 262144;
        }
        i = i4aVar == i4a.b ? i | 8192 : i;
        i = z2 ? i : i | 512;
        if (i4aVar == i4a.a) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.a = i;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = 1002;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m29) {
                m29 m29Var = (m29) obj;
                if (this.a != m29Var.a || this.b != m29Var.b || this.c != m29Var.c || this.d != m29Var.d || this.e != m29Var.e || this.f != m29Var.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (eub.k(eub.k(eub.k(eub.k(eub.k(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }

    public m29(int i) {
        this((i & 1) == 0, i4a.a, true);
    }
}
