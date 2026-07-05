package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lr5  reason: default package */
/* loaded from: classes3.dex */
public final class lr5 extends n42 {
    public int a;
    public boolean b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ur5 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr5(ur5 ur5Var, n42 n42Var) {
        super(n42Var);
        this.e = ur5Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.r(0, false, this);
    }
}
