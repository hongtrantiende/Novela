package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tf9  reason: default package */
/* loaded from: classes3.dex */
public final class tf9 implements uf9 {
    public final Object b;

    public final boolean equals(Object obj) {
        if (obj instanceof tf9) {
            if (!c16.i(this.b, ((tf9) obj).b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.uf9
    public final Object getValue() {
        return this.b;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Value(value=" + this.b + ')';
    }
}
