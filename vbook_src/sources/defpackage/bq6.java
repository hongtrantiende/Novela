package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bq6  reason: default package */
/* loaded from: classes3.dex */
public final class bq6 implements cq6 {
    public final String a;

    public bq6(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.cq6
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cq6
    public final zp6 b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bq6) && c16.i(this.a, ((bq6) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("Valid(normalizedUrl=", this.a, ")");
    }
}
