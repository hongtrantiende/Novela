package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t20  reason: default package */
/* loaded from: classes3.dex */
public final class t20 extends n42 {
    public Object a;
    public byte[] b;
    public sw7 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ v20 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(v20 v20Var, n42 n42Var) {
        super(n42Var);
        this.e = v20Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.f(null, 0, 0, this);
    }
}
