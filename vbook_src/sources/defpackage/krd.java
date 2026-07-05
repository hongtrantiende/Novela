package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: krd  reason: default package */
/* loaded from: classes.dex */
public final class krd extends uq7 {
    public final btd b;
    public final t1a c;

    public krd(btd btdVar, t1a t1aVar) {
        t1aVar.getClass();
        this.b = btdVar;
        this.c = t1aVar;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new lrd(this.b, this.c);
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        lrd lrdVar = (lrd) mq7Var;
        lrdVar.getClass();
        t1a t1aVar = this.c;
        t1aVar.getClass();
        lrdVar.K = this.b;
        lrdVar.L = t1aVar;
        hud.o(lrdVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof krd) {
                krd krdVar = (krd) obj;
                if (this.b == krdVar.b && c16.i(this.c, krdVar.c)) {
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
        return "ZoomScrollBarElement(zoomable=" + this.b + ", scrollBarSpec=" + this.c + ")";
    }
}
