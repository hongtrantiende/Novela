package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mmc  reason: default package */
/* loaded from: classes3.dex */
public final class mmc extends n42 {
    public rmc a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rmc c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmc(rmc rmcVar, n42 n42Var) {
        super(n42Var);
        this.c = rmcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return rmc.j(this.c, this);
    }
}
