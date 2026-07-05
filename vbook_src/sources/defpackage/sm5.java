package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sm5 */
/* loaded from: classes3.dex */
public final class sm5 {
    public final kj6 a;
    public final List b;

    public sm5(kj6 kj6Var, List list) {
        kj6Var.getClass();
        list.getClass();
        this.a = kj6Var;
        this.b = list;
    }

    public static sm5 a(kj6 kj6Var, List list) {
        kj6Var.getClass();
        list.getClass();
        return new sm5(kj6Var, list);
    }

    public static /* synthetic */ sm5 b(sm5 sm5Var, kj6 kj6Var, List list, int i) {
        if ((i & 1) != 0) {
            kj6Var = sm5Var.a;
        }
        if ((i & 2) != 0) {
            list = sm5Var.b;
        }
        sm5Var.getClass();
        return a(kj6Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm5)) {
            return false;
        }
        sm5 sm5Var = (sm5) obj;
        if (c16.i(this.a, sm5Var.a) && c16.i(this.b, sm5Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageContentState(listState=" + this.a + ", pages=" + this.b + ")";
    }
}
