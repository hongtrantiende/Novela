package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ew8  reason: default package */
/* loaded from: classes3.dex */
public final class ew8 extends aab implements nu4 {
    public int a;
    public /* synthetic */ String b;
    public final /* synthetic */ gw8 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ double e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew8(gw8 gw8Var, int i, double d, m42 m42Var) {
        super(4, m42Var);
        this.c = gw8Var;
        this.d = i;
        this.e = d;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj2).floatValue();
        ((Number) obj3).floatValue();
        int i = this.d;
        double d = this.e;
        ew8 ew8Var = new ew8(this.c, i, d, (m42) obj4);
        ew8Var.b = (String) obj;
        return ew8Var.invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        String str = this.b;
        int i = this.a;
        gw8 gw8Var = this.c;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            this.b = null;
            this.a = 1;
            obj = gw8Var.d(str, this.d, this.e, this);
            n82 n82Var = n82.a;
            if (obj == n82Var) {
                return n82Var;
            }
        }
        short[] sArr = (short[]) obj;
        int length = sArr.length;
        float[] fArr = new float[length];
        for (int i2 = 0; i2 < length; i2++) {
            fArr[i2] = sArr[i2] / 32768.0f;
        }
        return new cw4(fArr, gw8Var.e);
    }
}
