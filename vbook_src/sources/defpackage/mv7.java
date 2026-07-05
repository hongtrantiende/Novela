package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mv7  reason: default package */
/* loaded from: classes3.dex */
public final class mv7 extends fs9 implements lu4 {
    public /* synthetic */ Object C;
    public final /* synthetic */ nv7 D;
    public final /* synthetic */ sw4 E;
    public sw4 b;
    public nv7 c;
    public long[] d;
    public int e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv7(nv7 nv7Var, sw4 sw4Var, m42 m42Var) {
        super(2, m42Var);
        this.D = nv7Var;
        this.E = sw4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        mv7 mv7Var = new mv7(this.D, this.E, m42Var);
        mv7Var.C = obj;
        return mv7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((mv7) create((c9a) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        c9a c9aVar;
        nv7 nv7Var;
        long[] jArr;
        int i;
        sw4 sw4Var;
        int i2 = this.f;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.e;
                jArr = this.d;
                nv7Var = this.c;
                sw4Var = this.b;
                c9aVar = (c9a) this.C;
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            c9aVar = (c9a) this.C;
            nv7Var = this.D;
            lv7 lv7Var = nv7Var.b;
            jArr = lv7Var.c;
            i = lv7Var.e;
            sw4Var = this.E;
        }
        if (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            sw4Var.b = i;
            Object obj2 = nv7Var.b.b[i];
            this.C = c9aVar;
            this.b = sw4Var;
            this.c = nv7Var;
            this.d = jArr;
            this.e = i3;
            this.f = 1;
            c9aVar.c(this, obj2);
            return n82.a;
        }
        return pvc.a;
    }
}
