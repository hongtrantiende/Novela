package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mx3  reason: default package */
/* loaded from: classes3.dex */
public final class mx3 extends ox3 {
    public final f61 c;
    public final /* synthetic */ qx3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx3(qx3 qx3Var, long j, f61 f61Var) {
        super(j);
        this.d = qx3Var;
        this.c = f61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.E(this.d);
    }

    @Override // defpackage.ox3
    public final String toString() {
        return super.toString() + this.c;
    }
}
