package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l4a  reason: default package */
/* loaded from: classes.dex */
public final class l4a {
    public final p4a a;
    public final p4a b;

    public l4a(p4a p4aVar, p4a p4aVar2) {
        this.a = p4aVar;
        this.b = p4aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l4a.class == obj.getClass()) {
            l4a l4aVar = (l4a) obj;
            if (this.a.equals(l4aVar.a) && this.b.equals(l4aVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        p4a p4aVar = this.a;
        sb.append(p4aVar);
        p4a p4aVar2 = this.b;
        if (p4aVar.equals(p4aVar2)) {
            str = "";
        } else {
            str = ", " + p4aVar2;
        }
        return s21.q(sb, str, "]");
    }
}
