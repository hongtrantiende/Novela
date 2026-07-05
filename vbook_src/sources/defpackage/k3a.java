package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k3a  reason: default package */
/* loaded from: classes3.dex */
public final class k3a {
    public static final k3a e = new k3a(i3a.b, nae.e, zx1.X, new aab(1, null));
    public final i3a a;
    public final float b;
    public final vt4 c;
    public final xt4 d;

    public k3a(i3a i3aVar, float f, vt4 vt4Var, xt4 xt4Var) {
        this.a = i3aVar;
        this.b = f;
        this.c = vt4Var;
        this.d = xt4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k3a) {
                k3a k3aVar = (k3a) obj;
                if (this.a != k3aVar.a || Float.compare(this.b, k3aVar.b) != 0 || !this.c.equals(k3aVar.c) || !this.d.equals(k3aVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int d = nk2.d(this.b, this.a.hashCode() * 31, 31);
        return this.d.hashCode() + ((this.c.hashCode() + d) * 31);
    }

    public final String toString() {
        return "ScrollInfo(direction=" + this.a + ", speedMultiplier=" + this.b + ", maxScrollDistanceProvider=" + this.c + ", onScroll=" + this.d + ')';
    }
}
