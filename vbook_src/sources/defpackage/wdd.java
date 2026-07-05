package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wdd  reason: default package */
/* loaded from: classes.dex */
public final class wdd {
    public final Object a;
    public final qdd b;
    public int c;
    public boolean d;

    public wdd(Object obj) {
        qdd qddVar = new qdd();
        this.a = obj;
        this.b = qddVar;
        this.c = 0;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wdd) {
                wdd wddVar = (wdd) obj;
                if (!c16.i(this.a, wddVar.a) || !c16.i(this.b, wddVar.b) || this.c != wddVar.c || this.d != wddVar.d) {
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
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int hashCode2 = this.b.hashCode();
        return Boolean.hashCode(this.d) + hl5.a(this.c, (hashCode2 + (hashCode * 31)) * 31, 31);
    }

    public final String toString() {
        int i = this.c;
        boolean z = this.d;
        return "Entry(key=" + this.a + ", store=" + this.b + ", refCount=" + i + ", isDisposable=" + z + ")";
    }
}
