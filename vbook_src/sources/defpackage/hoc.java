package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hoc  reason: default package */
/* loaded from: classes.dex */
public final class hoc extends n42 {
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ koc E;
    public int F;
    public koc a;
    public p19 b;
    public String c;
    public String[] d;
    public int e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoc(koc kocVar, n42 n42Var) {
        super(n42Var);
        this.E = kocVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return koc.c(this.E, null, 0, this);
    }
}
