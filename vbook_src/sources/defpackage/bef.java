package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bef  reason: default package */
/* loaded from: classes.dex */
public final class bef {
    public final o3f a;
    public final h0e b;

    public bef(o3f o3fVar, h0e h0eVar) {
        this.a = o3fVar;
        if (h0eVar != null) {
            this.b = h0eVar;
        } else {
            xk5.k("Null extensionRegistryLite");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof bef) {
                bef befVar = (bef) obj;
                if (this.a.equals(befVar.a) && this.b.equals(befVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String o0eVar = this.a.toString();
        int length = o0eVar.length();
        String obj = this.b.toString();
        StringBuilder sb = new StringBuilder(length + 53 + obj.length() + 1);
        nk2.C(sb, "ProtoSerializer{defaultValue=", o0eVar, ", extensionRegistryLite=", obj);
        sb.append("}");
        return sb.toString();
    }
}
