package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mg3  reason: default package */
/* loaded from: classes3.dex */
public final class mg3 {
    public final boolean a;
    public final List b;

    public mg3(List list, boolean z) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mg3) {
                mg3 mg3Var = (mg3) obj;
                if (this.a != mg3Var.a || !c16.i(this.b, mg3Var.b)) {
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
        return "DownloadState(isLoading=" + this.a + ", sections=" + this.b + ")";
    }
}
