package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: upc  reason: default package */
/* loaded from: classes3.dex */
public final class upc extends n42 {
    public xyb a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vpc c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upc(vpc vpcVar, n42 n42Var) {
        super(n42Var);
        this.c = vpcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(null, this);
    }
}
