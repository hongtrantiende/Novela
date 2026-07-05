package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k5c  reason: default package */
/* loaded from: classes3.dex */
public final class k5c extends n42 {
    public /* synthetic */ Object C;
    public final /* synthetic */ y5c D;
    public int E;
    public exb a;
    public String b;
    public bw7 c;
    public Object d;
    public ls3 e;
    public exb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5c(y5c y5cVar, n42 n42Var) {
        super(n42Var);
        this.D = y5cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return y5c.M(this.D, this);
    }
}
