package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s4d  reason: default package */
/* loaded from: classes.dex */
public final class s4d {
    public final js a;
    public final mn3 b;

    public s4d(js jsVar, mn3 mn3Var) {
        this.a = jsVar;
        this.b = mn3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s4d) {
            s4d s4dVar = (s4d) obj;
            if (c16.i(this.a, s4dVar.a) && c16.i(this.b, s4dVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Integer.hashCode(0) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
