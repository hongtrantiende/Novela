package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w7  reason: default package */
/* loaded from: classes3.dex */
public final class w7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        Object value;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                b8 b8Var = (b8) obj2;
                String str = ((bzc) obj).a;
                str.getClass();
                if (!((a8) b8Var.e.getValue()).c) {
                    hk1 a = jdd.a(b8Var);
                    sw2 sw2Var = ab3.a;
                    b8Var.f(a, ru2.c, new n0(b8Var, str, null, 1));
                }
                return pvcVar;
            case 1:
                ((xt4) obj2).invoke(((t9) obj).a);
                return pvcVar;
            case 2:
                ((xt4) obj2).invoke((fb) obj);
                return pvcVar;
            case 3:
                ((xt4) ((aw7) obj).getValue()).invoke(((s81) obj2).a);
                return pvcVar;
            case 4:
                ((aw7) obj).setValue(((o62) obj2).a.a);
                return pvcVar;
            case 5:
                ((xt4) obj2).invoke(((bzc) obj).a);
                return pvcVar;
            case 6:
                ((xt4) obj2).invoke(String.valueOf(((j62) obj).a));
                return pvcVar;
            case 7:
                String str2 = ((bzc) obj).a;
                str2.getClass();
                cza czaVar = ((lb2) obj2).e;
                Set G0 = sl1.G0(((kb2) czaVar.getValue()).h);
                if (!G0.add(str2)) {
                    G0.remove(str2);
                }
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, kb2.a((kb2) value, false, false, false, false, false, null, null, G0, null, 383)));
                    return pvcVar;
                }
                return pvcVar;
            case 8:
                xfc xfcVar = ((crc) obj2).n;
                float floatValue = ((Number) ((vt4) obj).invoke()).floatValue();
                return new zl1(sve.q(on3.c.f(floatValue), xfcVar.a, xfcVar.b));
            case 9:
                kd3 kd3Var = (kd3) obj;
                ((lu4) obj2).invoke(kd3Var.b, kd3Var.c);
                return pvcVar;
            case 10:
                ((xt4) obj2).invoke(((wp3) obj).a);
                return pvcVar;
            case 11:
                ((xt4) obj2).invoke(((b84) obj).a);
                return pvcVar;
            case 12:
                ((xt4) obj2).invoke(((f84) obj).b);
                return pvcVar;
            case 13:
                ((xt4) obj2).invoke(((qn4) obj).a);
                return pvcVar;
            case 14:
                ((xt4) obj2).invoke(((ju6) obj).b);
                return pvcVar;
            case 15:
                mvb mvbVar = (mvb) obj;
                ((mu4) obj2).c(mvbVar.a, mvbVar.b, mvbVar.c);
                return pvcVar;
            case 16:
                ((xt4) obj2).invoke(Long.valueOf(((ff1) obj).a.b()));
                return pvcVar;
            case 17:
                ((xt4) obj2).invoke((mv) obj);
                return pvcVar;
            case 18:
                mq5 mq5Var = (mq5) obj;
                ((lu4) obj2).invoke(Integer.valueOf(mq5Var.c), Float.valueOf(mq5Var.d));
                return pvcVar;
            case 19:
                ((xt4) obj2).invoke((lb6) obj);
                return pvcVar;
            case 20:
                ((xt4) obj2).invoke(((oc9) obj).a);
                return pvcVar;
            case 21:
                ((xt4) obj2).invoke((rxb) obj);
                return pvcVar;
            case 22:
                ((xt4) obj2).invoke(Integer.valueOf(((u2c) obj).c));
                return pvcVar;
            case 23:
                ((xt4) obj2).invoke((c6c) obj);
                return pvcVar;
            case 24:
                zr1.u((cz7) obj2, String.valueOf(((j62) obj).a));
                return pvcVar;
            case 25:
                gc9 gc9Var = (gc9) obj;
                ((mu4) obj2).c(gc9Var.a, gc9Var.b, gc9Var.c);
                return pvcVar;
            case 26:
                ((xt4) obj2).invoke((ida) obj);
                return pvcVar;
            case 27:
                ((loa) obj).a((ioa) obj2);
                return pvcVar;
            case 28:
                lq1 lq1Var = (lq1) obj;
                ((lu4) obj2).invoke(lq1Var.b, lq1Var.c);
                return pvcVar;
            default:
                ((xt4) obj2).invoke(((u8b) obj).c);
                return pvcVar;
        }
    }
}
