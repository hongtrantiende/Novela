package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zpb  reason: default package */
/* loaded from: classes3.dex */
public final class zpb {
    public final boolean a;
    public final List b;

    public zpb(List list, boolean z) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zpb) {
                zpb zpbVar = (zpb) obj;
                if (this.a != zpbVar.a || !c16.i(this.b, zpbVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + eub.k(Boolean.hashCode(false) * 31, 31, this.a);
    }

    public final String toString() {
        return "TextEditWordState(isLoading=false, isGeneral=" + this.a + ", words=" + this.b + ")";
    }
}
