package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jl1  reason: default package */
/* loaded from: classes.dex */
public final class jl1 implements bq5 {
    public final String a;
    public final vt4 b;
    public final String c;

    public jl1(String str, vt4 vt4Var) {
        str.getClass();
        this.a = str;
        this.b = vt4Var;
        this.c = str;
    }

    @Override // defpackage.bq5
    public final osa a() {
        return (osa) this.b.invoke();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jl1.class == obj.getClass()) {
            return c16.i(this.a, ((jl1) obj).a);
        }
        return false;
    }

    @Override // defpackage.bq5
    public final String getKey() {
        return this.c;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return s21.q(new StringBuilder("CoilHttpImageSource('"), this.a, "')");
    }
}
