package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m54  reason: default package */
/* loaded from: classes3.dex */
public final class m54 {
    public final boolean a;
    public final List b;

    public m54(List list, boolean z) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m54) {
                m54 m54Var = (m54) obj;
                if (this.a != m54Var.a || !c16.i(this.b, m54Var.b)) {
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
        return "ExtensionListState(isLoading=" + this.a + ", extensions=" + this.b + ")";
    }
}
