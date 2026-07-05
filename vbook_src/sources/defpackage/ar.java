package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ar  reason: default package */
/* loaded from: classes.dex */
public final class ar extends fb6 implements xt4 {
    public final /* synthetic */ br a;
    public final /* synthetic */ mw8 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(br brVar, mw8 mw8Var, long j) {
        super(1);
        this.a = brVar;
        this.b = mw8Var;
        this.c = j;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        dc dcVar = this.a.N.b;
        mw8 mw8Var = this.b;
        int i = mw8Var.a;
        lw8.t((lw8) obj, mw8Var, dcVar.a((mw8Var.b & 4294967295L) | (i << 32), this.c, tc6.a));
        return pvc.a;
    }
}
