package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kl  reason: default package */
/* loaded from: classes3.dex */
public final class kl extends n42 {
    public ql a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ql d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl(ql qlVar, n42 n42Var) {
        super(n42Var);
        this.d = qlVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.l(null, this);
    }
}
