package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rqc  reason: default package */
/* loaded from: classes3.dex */
public final class rqc extends n42 {
    public /* synthetic */ Object C;
    public final /* synthetic */ tqc D;
    public int E;
    public String a;
    public zmc b;
    public boolean c;
    public int d;
    public int e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqc(tqc tqcVar, n42 n42Var) {
        super(n42Var);
        this.D = tqcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.u(null, false, this);
    }
}
