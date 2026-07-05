package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c7b  reason: default package */
/* loaded from: classes3.dex */
public final class c7b extends uq7 {
    public final btd b;
    public final o7b c;

    public c7b(btd btdVar, o7b o7bVar) {
        o7bVar.getClass();
        this.b = btdVar;
        this.c = o7bVar;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new e7b(this.b, this.c);
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        e7b e7bVar = (e7b) mq7Var;
        e7bVar.getClass();
        o7b o7bVar = this.c;
        o7bVar.getClass();
        e7bVar.K = this.b;
        e7bVar.L = o7bVar;
        hud.o(e7bVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c7b) {
                c7b c7bVar = (c7b) obj;
                if (this.b == c7bVar.b && c16.i(this.c, c7bVar.c)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "SubsamplingDrawTilesElement(zoomable=" + this.b + ", subsampling=" + this.c + ")";
    }
}
