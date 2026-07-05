package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rg1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg1 implements xt4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rg1(yya yyaVar, yya yyaVar2, s4b s4bVar, yya yyaVar3, skc skcVar, skc skcVar2, s4b s4bVar2, og1 og1Var) {
        this.a = 0;
        this.b = yyaVar;
        this.c = yyaVar2;
        this.C = s4bVar;
        this.d = yyaVar3;
        this.e = skcVar;
        this.f = skcVar2;
        this.D = s4bVar2;
        this.E = og1Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        ak3 ak3Var;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.E;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        Object obj9 = this.b;
        switch (i) {
            case 0:
                s4b s4bVar = (s4b) obj4;
                yya yyaVar = (yya) obj7;
                yya yyaVar2 = (yya) obj6;
                yya yyaVar3 = (yya) obj5;
                s4b s4bVar2 = (s4b) obj3;
                og1 og1Var = (og1) obj2;
                ak3 ak3Var2 = (ak3) obj;
                long j = ((zl1) ((yya) obj9).getValue()).a;
                long j2 = ((zl1) ((yya) obj8).getValue()).a;
                float L0 = ak3Var2.L0(2.0f);
                float f = s4bVar.a;
                float f2 = f / 2.0f;
                float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var2.b() >> 32));
                boolean c = zl1.c(j, j2);
                ye4 ye4Var = ye4.a;
                if (c) {
                    ak3Var = ak3Var2;
                    ak3.Y(ak3Var, j, 0L, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(L0) << 32) | (Float.floatToRawIntBits(L0) & 4294967295L), ye4Var, nae.e, 226);
                } else {
                    ak3Var = ak3Var2;
                    long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
                    float f3 = intBitsToFloat - (f * 2.0f);
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                    float max = Math.max((float) nae.e, L0 - f);
                    ak3.Y(ak3Var, j, floatToRawIntBits, floatToRawIntBits2, (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L), ye4Var, nae.e, 224);
                    float f4 = intBitsToFloat - f;
                    float f5 = L0 - f2;
                    ak3.Y(ak3Var, j2, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), s4bVar, nae.e, 224);
                }
                long j3 = ((zl1) yyaVar.getValue()).a;
                float floatValue = ((Number) yyaVar2.getValue()).floatValue();
                float floatValue2 = ((Number) yyaVar3.getValue()).floatValue();
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ak3Var.b() >> 32));
                float o = b23.o(0.4f, 0.5f, floatValue2);
                float o2 = b23.o(0.7f, 0.5f, floatValue2);
                float o3 = b23.o(0.5f, 0.5f, floatValue2);
                float o4 = b23.o(0.3f, 0.5f, floatValue2);
                og1Var.a.m();
                yj yjVar = og1Var.a;
                yjVar.i(0.2f * intBitsToFloat2, o3 * intBitsToFloat2);
                yjVar.h(o * intBitsToFloat2, o2 * intBitsToFloat2);
                yjVar.h(0.8f * intBitsToFloat2, intBitsToFloat2 * o4);
                bk bkVar = og1Var.b;
                bkVar.b(yjVar);
                yj yjVar2 = og1Var.c;
                yjVar2.m();
                bkVar.a(nae.e, bkVar.a.getLength() * floatValue, yjVar2);
                ak3.t1(ak3Var, og1Var.c, j3, nae.e, s4bVar2, 52);
                return pvcVar;
            case 1:
                v43 v43Var = (v43) obj9;
                tra traVar = (tra) obj8;
                aw7 aw7Var = (aw7) obj4;
                aw7 aw7Var2 = (aw7) obj2;
                vf6 vf6Var = (vf6) obj;
                vf6Var.getClass();
                jub jubVar = (jub) aw7Var.getValue();
                int i2 = v43Var.e;
                int i3 = v43Var.i.k;
                List list = (List) ((aw7) obj3).getValue();
                oue.J(vf6Var, jubVar, i2, i3, ((Boolean) aw7Var2.getValue()).booleanValue(), v43Var.f, list, traVar, v43Var.g, new f43(traVar, 0), (vt4) obj7, new as1(aw7Var2, 10), (xt4) obj6, (vt4) obj5, new as1(aw7Var, 11));
                return pvcVar;
            case 2:
                xt4 xt4Var = (xt4) obj8;
                xt4 xt4Var2 = (xt4) obj7;
                xt4 xt4Var3 = (xt4) obj6;
                xt4 xt4Var4 = (xt4) obj5;
                xt4 xt4Var5 = (xt4) obj4;
                xt4 xt4Var6 = (xt4) obj3;
                xt4 xt4Var7 = (xt4) obj2;
                vf6 vf6Var2 = (vf6) obj;
                vf6Var2.getClass();
                List list2 = ((mg3) obj9).b;
                int size = list2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    kg3 kg3Var = (kg3) list2.get(i4);
                    vf6.y(vf6Var2, Long.valueOf(kg3Var.a), new u83(9), new tu1(new qo4(kg3Var, 14), true, -1466458184), 4);
                    List list3 = kg3Var.b;
                    vf6Var2.z(list3.size(), new x7(21, new u83(10), list3), null, new y7(23, list3), new tu1(new x52(list3, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7), true, -1117249557));
                }
                return pvcVar;
            case 3:
                String str = (String) obj9;
                List list4 = (List) obj8;
                List list5 = (List) obj7;
                xt4 xt4Var8 = (xt4) obj6;
                xt4 xt4Var9 = (xt4) obj5;
                xt4 xt4Var10 = (xt4) obj4;
                xt4 xt4Var11 = (xt4) obj3;
                xt4 xt4Var12 = (xt4) obj2;
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                if (str.length() == 0 && !list4.isEmpty()) {
                    ri6.y(ri6Var, null, sye.a, 3);
                }
                ri6Var.z(list4.size(), null, new w74(23, list4), new tu1(new bq0(list4, xt4Var8, xt4Var9, 3), true, 802480018));
                if (str.length() == 0 && !list5.isEmpty()) {
                    ri6.y(ri6Var, null, sye.b, 3);
                }
                ri6Var.z(list5.size(), null, new w74(24, list5), new tu1(new gr0(list5, xt4Var10, xt4Var11, xt4Var12, 4), true, 802480018));
                return pvcVar;
            default:
                sk8 sk8Var = (sk8) obj9;
                qi8 qi8Var = (qi8) obj8;
                si8 si8Var = (si8) obj5;
                ri8 ri8Var = (ri8) obj4;
                m82 m82Var = (m82) obj3;
                d19 d19Var = (d19) obj2;
                long j4 = ((y78) obj).a;
                float floatValue3 = ((Number) ((vt4) obj7).invoke()).floatValue();
                float floatValue4 = ((Number) ((vt4) obj6).invoke()).floatValue();
                float d = cj8.d(d19Var);
                float c2 = cj8.c(d19Var);
                sk8Var.getClass();
                m82Var.getClass();
                float f6 = d / 2.0f;
                float f7 = c2 / 2.0f;
                float min = Math.min(d / floatValue3, c2 / floatValue4);
                float floatValue5 = ((Number) ((imb) sk8Var.a).invoke()).floatValue();
                float h = qi8Var.a.h();
                float h2 = qi8Var.b.h();
                float h3 = qi8Var.c.h();
                float f8 = 1.0f;
                if (h >= 0.95f) {
                    if (h >= 0.95f && h < 2.0f) {
                        f8 = h + 1.0f;
                    } else if (2.0f <= h && h <= 3.0f) {
                        f8 = h + 2.0f;
                    }
                }
                float m = dce.m(f8, min, floatValue5);
                iya iyaVar = (iya) sk8Var.h;
                if (iyaVar != null) {
                    iyaVar.cancel(null);
                }
                sk8Var.h = null;
                sk8Var.h = z87.v(m82Var, null, null, new nk8(m, min, floatValue3, d, ri8Var, floatValue4, c2, si8Var, sk8Var, h, j4, f6, h2, f7, h3, qi8Var, null), 3);
                return pvcVar;
        }
    }

    public /* synthetic */ rg1(Object obj, Object obj2, Object obj3, hu4 hu4Var, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = hu4Var;
        this.f = obj4;
        this.C = obj5;
        this.D = obj6;
        this.E = obj7;
    }
}
