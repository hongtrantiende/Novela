package defpackage;

import java.util.Collection;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hla  reason: default package */
/* loaded from: classes.dex */
public final class hla {
    public final List a;
    public final List b;
    public final Collection c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public hla(List list, List list2, Collection collection, int i, boolean z, boolean z2) {
        this.a = list;
        this.b = list2;
        this.c = collection;
        this.d = i;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hla) {
                hla hlaVar = (hla) obj;
                if (this.a.equals(hlaVar.a) && this.b.equals(hlaVar.b) && this.c.equals(hlaVar.c) && this.d == hlaVar.d && this.e == hlaVar.e && this.f == hlaVar.f) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + eub.k((((this.c.hashCode() + eub.l(this.a.hashCode() * 31, this.b, 31)) * 31) + this.d) * 31, 31, this.e);
    }
}
