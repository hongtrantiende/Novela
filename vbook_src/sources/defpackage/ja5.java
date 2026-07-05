package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ja5  reason: default package */
/* loaded from: classes.dex */
public final class ja5 extends n42 {
    public ga5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ma5 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja5(ma5 ma5Var, n42 n42Var) {
        super(n42Var);
        this.c = ma5Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return ma5.H1(this.c, this);
    }
}
