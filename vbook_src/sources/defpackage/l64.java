package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l64  reason: default package */
/* loaded from: classes3.dex */
public final class l64 {
    public final boolean a;
    public final List b;

    public l64(List list, boolean z) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l64) {
                l64 l64Var = (l64) obj;
                if (this.a != l64Var.a || !c16.i(this.b, l64Var.b)) {
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
        return "ExtensionRepoState(isLoading=" + this.a + ", repoList=" + this.b + ")";
    }
}
