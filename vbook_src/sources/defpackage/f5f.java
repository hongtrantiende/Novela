package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f5f  reason: default package */
/* loaded from: classes.dex */
public abstract class f5f extends v4f {
    public boolean c;

    public f5f(a6f a6fVar) {
        super(a6fVar);
        this.b.N++;
    }

    public final void Y() {
        if (this.c) {
            return;
        }
        vs.k("Not initialized");
    }

    public final void Z() {
        if (!this.c) {
            a0();
            this.b.O++;
            this.c = true;
            return;
        }
        vs.k("Can't initialize twice");
    }

    public abstract void a0();
}
