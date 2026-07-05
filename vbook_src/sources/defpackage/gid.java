package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gid  reason: default package */
/* loaded from: classes.dex */
public final class gid {
    public final String a;
    public final fud b;

    public gid(String str, fud fudVar) {
        this.a = str;
        this.b = fudVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gid) {
                gid gidVar = (gid) obj;
                if (!this.a.equals(gidVar.a) || !this.b.equals(gidVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a;
    }
}
