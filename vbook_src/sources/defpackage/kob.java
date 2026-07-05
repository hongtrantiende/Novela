package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kob  reason: default package */
/* loaded from: classes3.dex */
public final class kob {
    public final kj6 a;
    public final List b;

    public kob(kj6 kj6Var, List list) {
        kj6Var.getClass();
        list.getClass();
        this.a = kj6Var;
        this.b = list;
    }

    public static kob a(kj6 kj6Var, List list) {
        kj6Var.getClass();
        list.getClass();
        return new kob(kj6Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kob)) {
            return false;
        }
        kob kobVar = (kob) obj;
        if (c16.i(this.a, kobVar.a) && c16.i(this.b, kobVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextContentState(listState=" + this.a + ", pages=" + this.b + ")";
    }
}
