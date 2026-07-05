package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iw1  reason: default package */
/* loaded from: classes.dex */
public final class iw1 extends n42 {
    public int C;
    public Object a;
    public uy5 b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ kw1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw1(kw1 kw1Var, n42 n42Var) {
        super(n42Var);
        this.f = kw1Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return kw1.a(this.f, null, null, this);
    }
}
