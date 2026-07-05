package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yja  reason: default package */
/* loaded from: classes3.dex */
public final class yja {
    public final hka a;
    public final fka b;
    public final cza c;

    public yja(hka hkaVar, fka fkaVar, rk9 rk9Var) {
        fkaVar.getClass();
        this.a = hkaVar;
        this.b = fkaVar;
        this.c = dza.a(rk9Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && yja.class == obj.getClass()) {
                yja yjaVar = (yja) obj;
                if (this.a.equals(yjaVar.a) && c16.i(this.b, yjaVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
