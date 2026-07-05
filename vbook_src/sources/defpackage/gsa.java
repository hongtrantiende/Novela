package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gsa  reason: default package */
/* loaded from: classes3.dex */
public final class gsa {
    public final List a;
    public final List b;
    public final List c;

    public gsa(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gsa) {
                gsa gsaVar = (gsa) obj;
                if (!this.a.equals(gsaVar.a) || !this.b.equals(gsaVar.b) || !this.c.equals(gsaVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.l(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SolidDef(vertices=");
        sb.append(this.a);
        sb.append(", faces=");
        sb.append(this.b);
        sb.append(", edges=");
        return rs8.n(sb, this.c, ")");
    }
}
