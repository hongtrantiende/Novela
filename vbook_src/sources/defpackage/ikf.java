package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ikf  reason: default package */
/* loaded from: classes.dex */
public final class ikf implements njf {
    public final njf a;
    public final Object b;

    public ikf(njf njfVar, Object obj) {
        this.a = njfVar;
        uaf.D(obj, "log site qualifier");
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ikf)) {
            return false;
        }
        ikf ikfVar = (ikf) obj;
        if (!this.a.equals(ikfVar.a) || !this.b.equals(ikfVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String obj2 = this.b.toString();
        StringBuilder sb = new StringBuilder(length + 47 + obj2.length() + 3);
        nk2.C(sb, "SpecializedLogSiteKey{ delegate='", obj, "', qualifier='", obj2);
        sb.append("' }");
        return sb.toString();
    }
}
