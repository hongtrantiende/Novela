package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q6f  reason: default package */
/* loaded from: classes.dex */
public final class q6f extends m6f {
    public final Object a;

    public q6f(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.m6f
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.m6f
    public final m6f b(h6f h6fVar) {
        Object apply = h6fVar.apply(this.a);
        if (apply != null) {
            return new q6f(apply);
        }
        xk5.k("the Function passed to Optional.transform() must not return null.");
        return null;
    }

    @Override // defpackage.m6f
    public final boolean equals(Object obj) {
        if (obj instanceof q6f) {
            return this.a.equals(((q6f) obj).a);
        }
        return false;
    }

    @Override // defpackage.m6f
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.a.toString();
        return nk2.v(new StringBuilder(obj.length() + 13), "Optional.of(", obj, ")");
    }
}
