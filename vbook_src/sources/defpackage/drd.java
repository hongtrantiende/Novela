package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: drd  reason: default package */
/* loaded from: classes3.dex */
public final class drd extends n42 {
    public final /* synthetic */ erd C;
    public int D;
    public yk8[] a;
    public xs5 b;
    public String c;
    public yk8[] d;
    public String e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drd(erd erdVar, n42 n42Var) {
        super(n42Var);
        this.C = erdVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return erd.A(this.C, null, null, null, this);
    }
}
