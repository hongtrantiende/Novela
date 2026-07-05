package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w0d  reason: default package */
/* loaded from: classes3.dex */
public final class w0d extends n42 {
    public x0d a;
    public /* synthetic */ Object b;
    public final /* synthetic */ x0d c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0d(x0d x0dVar, n42 n42Var) {
        super(n42Var);
        this.c = x0dVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object a = x0d.a(this.c, null, this);
        if (a == n82.a) {
            return a;
        }
        return new hs9(a);
    }
}
