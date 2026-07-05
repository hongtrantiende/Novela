package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vgb  reason: default package */
/* loaded from: classes3.dex */
public final class vgb extends n42 {
    public int C;
    public String a;
    public wgb b;
    public int c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ wgb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgb(wgb wgbVar, n42 n42Var) {
        super(n42Var);
        this.f = wgbVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.u(null, 0, 0L, this);
    }
}
