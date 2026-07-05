package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g3d  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3d extends xu4 implements xt4 {
    public final /* synthetic */ qw7 a;
    public final /* synthetic */ xl9 b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3d(qw7 qw7Var, xl9 xl9Var, xt4 xt4Var, int i) {
        super(1, b16.class, "advanceExportStep", "exportBackup$advanceExportStep(Lkotlinx/coroutines/sync/Mutex;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/functions/Function1;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = qw7Var;
        this.b = xl9Var;
        this.c = xt4Var;
        this.d = i;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        xt4 xt4Var = this.c;
        int i = this.d;
        return s3d.e(this.a, this.b, xt4Var, i, (m42) obj);
    }
}
