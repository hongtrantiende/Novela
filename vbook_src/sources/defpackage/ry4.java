package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ry4  reason: default package */
/* loaded from: classes.dex */
public final class ry4 extends n42 {
    public sy4 a;
    public sy4 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sy4 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry4(sy4 sy4Var, n42 n42Var) {
        super(n42Var);
        this.d = sy4Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
