package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pxc  reason: default package */
/* loaded from: classes3.dex */
public final class pxc extends IllegalArgumentException implements c72 {
    public final at4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxc(at4 at4Var) {
        super("Unsupported frame type: " + at4Var);
        at4Var.getClass();
        this.a = at4Var;
    }

    @Override // defpackage.c72
    public final Throwable a() {
        pxc pxcVar = new pxc(this.a);
        pxcVar.initCause(this);
        return pxcVar;
    }
}
