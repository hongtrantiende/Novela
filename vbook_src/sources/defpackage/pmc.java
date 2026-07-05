package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pmc  reason: default package */
/* loaded from: classes3.dex */
public final class pmc extends n42 {
    public String a;
    public rmc b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ rmc e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmc(rmc rmcVar, n42 n42Var) {
        super(n42Var);
        this.e = rmcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.B(null, false, this);
    }
}
