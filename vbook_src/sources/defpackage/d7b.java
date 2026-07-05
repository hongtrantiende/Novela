package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d7b  reason: default package */
/* loaded from: classes3.dex */
public final class d7b extends uq7 {
    public final btd b;
    public final o7b c;

    public d7b(btd btdVar, o7b o7bVar) {
        o7bVar.getClass();
        this.b = btdVar;
        this.c = o7bVar;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new f7b(this.b, this.c);
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        f7b f7bVar = (f7b) mq7Var;
        f7bVar.getClass();
        o7b o7bVar = this.c;
        o7bVar.getClass();
        f7bVar.K = this.b;
        f7bVar.L = o7bVar;
        hud.o(f7bVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d7b) {
                d7b d7bVar = (d7b) obj;
                if (this.b == d7bVar.b && c16.i(this.c, d7bVar.c)) {
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
