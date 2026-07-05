package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fad  reason: default package */
/* loaded from: classes3.dex */
public final class fad {
    public final Object a;
    public final String b;
    public final String c;

    public fad(Object obj, String str, String str2) {
        this.a = obj;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fad) {
                fad fadVar = (fad) obj;
                if (!this.a.equals(fadVar.a) || !this.b.equals(fadVar.b) || !this.c.equals(fadVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoRequest(data=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", uuid=");
        return s21.q(sb, this.c, ")");
    }
}
