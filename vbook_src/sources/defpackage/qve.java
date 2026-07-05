package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qve  reason: default package */
/* loaded from: classes.dex */
public abstract class qve extends c3e {
    public boolean b;

    public qve(lte lteVar) {
        super(lteVar);
        ((lte) this.a).W++;
    }

    public abstract boolean Y();

    public final void Z() {
        if (this.b) {
            return;
        }
        vs.k("Not initialized");
    }

    public final void a0() {
        if (!this.b) {
            if (!Y()) {
                ((lte) this.a).Y.incrementAndGet();
                this.b = true;
                return;
            }
            return;
        }
        vs.k("Can't initialize twice");
    }
}
