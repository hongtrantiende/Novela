package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fmc  reason: default package */
/* loaded from: classes3.dex */
public final class fmc extends n42 {
    public String a;
    public sw7 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ rmc d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmc(rmc rmcVar, n42 n42Var) {
        super(n42Var);
        this.d = rmcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.t(null, this);
    }
}
