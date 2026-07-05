package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ioc  reason: default package */
/* loaded from: classes.dex */
public final class ioc extends n42 {
    public final /* synthetic */ koc C;
    public int D;
    public p19 a;
    public String b;
    public String[] c;
    public int d;
    public int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioc(koc kocVar, n42 n42Var) {
        super(n42Var);
        this.C = kocVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return koc.d(this.C, null, 0, this);
    }
}
