package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h20  reason: default package */
/* loaded from: classes3.dex */
public final class h20 extends n42 {
    public int C;
    public l20 a;
    public byte[] b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ l20 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h20(l20 l20Var, n42 n42Var) {
        super(n42Var);
        this.f = l20Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.g(null, 0, 0, this);
    }
}
