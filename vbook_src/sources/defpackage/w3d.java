package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w3d  reason: default package */
/* loaded from: classes3.dex */
public final class w3d {
    public final String a;
    public final Object b;

    public w3d(Object obj, String str) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3d)) {
            return false;
        }
        w3d w3dVar = (w3d) obj;
        if (c16.i(this.a, w3dVar.a) && c16.i(this.b, w3dVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ValueElement(name=" + this.a + ", value=" + this.b + ")";
    }
}
