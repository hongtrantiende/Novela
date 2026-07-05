package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hr1  reason: default package */
/* loaded from: classes3.dex */
public final class hr1 extends n42 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qr1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr1(qr1 qr1Var, n42 n42Var) {
        super(n42Var);
        this.c = qr1Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(0, 0, 0, false, this);
    }
}
