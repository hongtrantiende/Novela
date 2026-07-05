package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bt8  reason: default package */
/* loaded from: classes3.dex */
public final class bt8 extends aab implements lu4 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ss8 e;
    public final /* synthetic */ sk8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt8(int i, int i2, int i3, ss8 ss8Var, sk8 sk8Var, m42 m42Var) {
        super(2, m42Var);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = ss8Var;
        this.f = sk8Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new bt8(this.b, this.c, this.d, this.e, this.f, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((bt8) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.d;
        int i3 = this.c;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            int i4 = this.b;
            if (i4 >= 0 && i3 > i2) {
                this.a = 1;
                obj = this.e.n().a1(i4, i2, i3, this);
                n82 n82Var = n82.a;
                if (obj == n82Var) {
                    return n82Var;
                }
            }
            return pvcVar;
        }
        List list = (List) obj;
        if (!list.isEmpty()) {
            sk8 sk8Var = this.f;
            if (i2 == sk8Var.e() && i3 == sk8Var.a()) {
                ((hm8) sk8Var.g).setValue(Integer.valueOf(i2));
                ((hm8) sk8Var.h).setValue(Integer.valueOf(i3));
                ((hm8) sk8Var.f).setValue(list);
            }
        }
        return pvcVar;
    }
}
