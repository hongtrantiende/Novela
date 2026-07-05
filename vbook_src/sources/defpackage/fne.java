package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fne  reason: default package */
/* loaded from: classes.dex */
public abstract class fne extends xke {
    public boolean b;

    public fne(lte lteVar) {
        super(lteVar);
        ((lte) this.a).W++;
    }

    public final void Y() {
        if (this.b) {
            return;
        }
        vs.k("Not initialized");
    }

    public final void Z() {
        if (!this.b) {
            if (!a0()) {
                ((lte) this.a).Y.incrementAndGet();
                this.b = true;
                return;
            }
            return;
        }
        vs.k("Can't initialize twice");
    }

    public abstract boolean a0();
}
