package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y6d  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6d extends xu4 implements xt4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6d(Object obj) {
        super(1, 0, ubd.class, obj, "changeSubtitlePadding", "changeSubtitlePadding(F)V");
        this.a = 10;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        Object value;
        fbd fbdVar;
        int i;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        switch (i2) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ubd ubdVar = (ubd) this.receiver;
                ubdVar.getClass();
                hk1 a = jdd.a(ubdVar);
                sw2 sw2Var = ab3.a;
                ubdVar.f(a, ru2.c, new nbd(ubdVar, booleanValue, null, 6));
                return pvcVar;
            case 1:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                ubd ubdVar2 = (ubd) this.receiver;
                ubdVar2.getClass();
                hk1 a2 = jdd.a(ubdVar2);
                sw2 sw2Var2 = ab3.a;
                ubdVar2.f(a2, ru2.c, new nbd(ubdVar2, booleanValue2, null, 4));
                return pvcVar;
            case 2:
                int intValue = ((Number) obj).intValue();
                cza czaVar = ((ubd) this.receiver).V;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                        fbdVar = (fbd) value;
                        if (intValue >= 0 && intValue < fbdVar.i.size()) {
                            i = intValue;
                        } else {
                            i = -1;
                        }
                    } while (!czaVar.l(value, fbd.a(fbdVar, false, false, null, null, 0, null, null, 0, null, i, 511)));
                    return pvcVar;
                }
                return pvcVar;
            case 3:
                ((ubd) this.receiver).k(((Number) obj).floatValue());
                return pvcVar;
            case 4:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                ubd ubdVar3 = (ubd) this.receiver;
                ubdVar3.getClass();
                hk1 a3 = jdd.a(ubdVar3);
                sw2 sw2Var3 = ab3.a;
                ubdVar3.f(a3, ru2.c, new nbd(ubdVar3, booleanValue3, null, 7));
                return pvcVar;
            case 5:
                float floatValue = ((Number) obj).floatValue();
                ubd ubdVar4 = (ubd) this.receiver;
                ubdVar4.getClass();
                hk1 a4 = jdd.a(ubdVar4);
                sw2 sw2Var4 = ab3.a;
                ubdVar4.f(a4, ru2.c, new obd(ubdVar4, floatValue, null, 3));
                return pvcVar;
            case 6:
                float floatValue2 = ((Number) obj).floatValue();
                ubd ubdVar5 = (ubd) this.receiver;
                ubdVar5.getClass();
                hk1 a5 = jdd.a(ubdVar5);
                sw2 sw2Var5 = ab3.a;
                ubdVar5.f(a5, ru2.c, new obd(ubdVar5, floatValue2, null, 1));
                return pvcVar;
            case 7:
                long longValue = ((Number) obj).longValue();
                ubd ubdVar6 = (ubd) this.receiver;
                ubdVar6.getClass();
                hk1 a6 = jdd.a(ubdVar6);
                sw2 sw2Var6 = ab3.a;
                ubdVar6.f(a6, ru2.c, new qbd(ubdVar6, longValue, null, 1));
                return pvcVar;
            case 8:
                long longValue2 = ((Number) obj).longValue();
                ubd ubdVar7 = (ubd) this.receiver;
                ubdVar7.getClass();
                hk1 a7 = jdd.a(ubdVar7);
                sw2 sw2Var7 = ab3.a;
                ubdVar7.f(a7, ru2.c, new qbd(ubdVar7, longValue2, null, 0));
                return pvcVar;
            case 9:
                int intValue2 = ((Number) obj).intValue();
                ubd ubdVar8 = (ubd) this.receiver;
                ubdVar8.getClass();
                hk1 a8 = jdd.a(ubdVar8);
                sw2 sw2Var8 = ab3.a;
                ubdVar8.f(a8, ru2.c, new pbd(ubdVar8, intValue2, null, 4));
                return pvcVar;
            case 10:
                float floatValue3 = ((Number) obj).floatValue();
                ubd ubdVar9 = (ubd) this.receiver;
                ubdVar9.getClass();
                hk1 a9 = jdd.a(ubdVar9);
                sw2 sw2Var9 = ab3.a;
                ubdVar9.f(a9, ru2.c, new obd(ubdVar9, floatValue3, null, 2));
                return pvcVar;
            default:
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6d(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }
}
