package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dqc  reason: default package */
/* loaded from: classes3.dex */
public final class dqc extends n42 {
    public final /* synthetic */ tqc C;
    public int D;
    public int a;
    public int b;
    public tqc c;
    public String d;
    public boolean e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqc(tqc tqcVar, n42 n42Var) {
        super(n42Var);
        this.C = tqcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.j(0, this);
    }
}
