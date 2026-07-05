package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: isb  reason: default package */
/* loaded from: classes.dex */
public final class isb {
    public final lk0 a;
    public final lk0 b;

    public isb() {
        lk0 lk0Var = kh5.I;
        this.a = lk0Var;
        this.b = lk0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof isb) {
                isb isbVar = (isb) obj;
                if (!c16.i(this.a, isbVar.a) || !c16.i(this.b, isbVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + nk2.d(this.a.a, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.b + ")";
    }
}
