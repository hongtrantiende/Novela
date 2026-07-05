package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wc4  reason: default package */
/* loaded from: classes3.dex */
public final class wc4 implements bq5 {
    public final hn8 a;
    public final String b;

    public wc4(hn8 hn8Var) {
        hn8Var.getClass();
        this.a = hn8Var;
        this.b = "file://" + hn8Var;
    }

    @Override // defpackage.bq5
    public final osa a() {
        return pe4.a.k1(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wc4.class == obj.getClass()) {
            return c16.i(this.a, ((wc4) obj).a);
        }
        return false;
    }

    @Override // defpackage.bq5
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "FileImageSource('" + this.a + "')";
    }
}
