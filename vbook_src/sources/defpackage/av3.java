package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: av3  reason: default package */
/* loaded from: classes.dex */
public final class av3 extends n42 {
    public String a;
    public j6d b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ov3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av3(ov3 ov3Var, n42 n42Var) {
        super(n42Var);
        this.e = ov3Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
