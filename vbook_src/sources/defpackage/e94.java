package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e94  reason: default package */
/* loaded from: classes3.dex */
public final class e94 extends n42 {
    public String a;
    public syb b;
    public /* synthetic */ Object c;
    public final /* synthetic */ h94 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e94(h94 h94Var, n42 n42Var) {
        super(n42Var);
        this.d = h94Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(null, this);
    }
}
