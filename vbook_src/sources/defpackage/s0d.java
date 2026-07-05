package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s0d  reason: default package */
/* loaded from: classes3.dex */
public final class s0d extends n42 {
    public int C;
    public String a;
    public mce b;
    public String c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ x0d f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0d(x0d x0dVar, n42 n42Var) {
        super(n42Var);
        this.f = x0dVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.f(null, this);
    }
}
