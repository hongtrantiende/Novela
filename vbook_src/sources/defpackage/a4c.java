package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a4c  reason: default package */
/* loaded from: classes3.dex */
public final class a4c {
    public final boolean a;
    public final List b;

    public a4c(List list, boolean z) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a4c) {
                a4c a4cVar = (a4c) obj;
                if (this.a != a4cVar.a || !c16.i(this.b, a4cVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextTrashWordState(isLoading=" + this.a + ", trashWords=" + this.b + ")";
    }
}
