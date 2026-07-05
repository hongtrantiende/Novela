package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tr8  reason: default package */
/* loaded from: classes3.dex */
public final class tr8 extends n42 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zr8 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr8(zr8 zr8Var, m42 m42Var) {
        super(m42Var);
        this.c = zr8Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.L0(0, this);
    }
}
