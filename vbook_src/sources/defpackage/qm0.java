package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qm0  reason: default package */
/* loaded from: classes3.dex */
public final class qm0 {
    public final String a;
    public final String b;
    public final List c;

    public qm0(String str, String str2, List list) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qm0) {
                qm0 qm0Var = (qm0) obj;
                if (!c16.i(this.a, qm0Var.a) || !c16.i(this.b, qm0Var.b) || !this.c.equals(qm0Var.c)) {
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
        return rs8.n(nk2.y("BlockLocalizedStrings(displayName=", this.a, ", description=", this.b, ", keywords="), this.c, ")");
    }
}
