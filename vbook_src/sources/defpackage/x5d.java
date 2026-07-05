package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x5d  reason: default package */
/* loaded from: classes3.dex */
public final class x5d extends n42 {
    public Object a;
    public jy6 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yh d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5d(yh yhVar, n42 n42Var) {
        super(n42Var);
        this.d = yhVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return yh.v(this.d, null, null, this);
    }
}
