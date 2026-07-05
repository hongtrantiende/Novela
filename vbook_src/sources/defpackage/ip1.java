package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ip1  reason: default package */
/* loaded from: classes3.dex */
public final class ip1 extends n42 {
    public int C;
    public int a;
    public String b;
    public xm2 c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ lp1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip1(lp1 lp1Var, n42 n42Var) {
        super(n42Var);
        this.f = lp1Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.u(0, null, false, this);
    }
}
