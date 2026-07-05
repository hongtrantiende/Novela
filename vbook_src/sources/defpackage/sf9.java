package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sf9  reason: default package */
/* loaded from: classes3.dex */
public final class sf9 implements uf9 {
    public final xt4 b;

    public final boolean equals(Object obj) {
        if (obj instanceof sf9) {
            if (!this.b.equals(((sf9) obj).b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.uf9
    public final Object getValue() {
        throw new IllegalStateException("The driver used with SQLDelight is asynchronous, so SQLDelight should be configured for\nasynchronous usage:\n\nsqldelight {\n  databases {\n    MyDatabase {\n      generateAsync = true\n    }\n  }\n}");
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "AsyncValue(getter=" + this.b + ')';
    }
}
