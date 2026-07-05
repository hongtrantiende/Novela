package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t95  reason: default package */
/* loaded from: classes.dex */
public final class t95 extends fb6 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u95[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t95(u95[] u95VarArr, int i) {
        super(2);
        this.a = i;
        this.b = u95VarArr;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        u95[] u95VarArr = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(kue.c((lw8) obj, true, u95VarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(kue.c((lw8) obj, false, u95VarArr, ((Number) obj2).floatValue()));
        }
    }
}
