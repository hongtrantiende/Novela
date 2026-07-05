package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aq5  reason: default package */
/* loaded from: classes3.dex */
public final class aq5 implements zp5 {
    public final bq5 a;
    public final String b;

    public aq5(bq5 bq5Var) {
        bq5Var.getClass();
        this.a = bq5Var;
        this.b = bq5Var.getKey();
    }

    @Override // defpackage.zp5
    public final Object a(m42 m42Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aq5.class == obj.getClass()) {
            return c16.i(this.a, ((aq5) obj).a);
        }
        return false;
    }

    @Override // defpackage.zp5
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WrapperFactory(" + this.a + ')';
    }
}
