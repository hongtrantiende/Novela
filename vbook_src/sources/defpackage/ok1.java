package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ok1  reason: default package */
/* loaded from: classes.dex */
public final class ok1 extends n42 {
    public zg4 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zg4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok1(zg4 zg4Var, n42 n42Var) {
        super(n42Var);
        this.c = zg4Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return zg4.O(this.c, this);
    }
}
