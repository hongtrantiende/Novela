package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mx8  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mx8 implements lu4 {
    public final /* synthetic */ int a;

    public /* synthetic */ mx8(int i) {
        this.a = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                q0a q0aVar = (q0a) obj;
                q0aVar.getClass();
                ((wl8) obj2).getClass();
                return new gy7(zpe.d(q0aVar));
            case 1:
                q0a q0aVar2 = (q0a) obj;
                q0aVar2.getClass();
                ((wl8) obj2).getClass();
                zpe.d(q0aVar2);
                return new Object();
            case 2:
                ((q0a) obj).getClass();
                ((wl8) obj2).getClass();
                return new zf();
            case 3:
                q0a q0aVar3 = (q0a) obj;
                q0aVar3.getClass();
                ((wl8) obj2).getClass();
                return new zk(zpe.d(q0aVar3));
            case 4:
                y78 y78Var = (y78) obj2;
                ((i59) obj).getClass();
                return pvc.a;
            case 5:
                p59 p59Var = (p59) obj2;
                ((rx9) obj).getClass();
                p59Var.getClass();
                Boolean bool = (Boolean) p59Var.a.getValue();
                bool.booleanValue();
                return tl1.B(bool, (String) p59Var.b.getValue(), (List) p59Var.c.getValue());
            case 6:
                ((Integer) obj).intValue();
                Integer num = (Integer) obj2;
                num.intValue();
                return num;
            case 7:
                ((Integer) obj).intValue();
                j62 j62Var = (j62) obj2;
                j62Var.getClass();
                return Long.valueOf(j62Var.a);
            case 8:
                rx9 rx9Var = (rx9) obj;
                return (Float) ((ya9) obj2).a.e();
            case 9:
                ((Integer) obj).intValue();
                ac9 ac9Var = (ac9) obj2;
                ac9Var.getClass();
                return Long.valueOf(ac9Var.c);
            case 10:
                ((Integer) obj).intValue();
                gc9 gc9Var = (gc9) obj2;
                gc9Var.getClass();
                return gc9Var.a;
            case 11:
                yl1 yl1Var = (yl1) obj2;
                ((mg9) obj).getClass();
                yl1Var.getClass();
                return yl1Var.b();
            case 12:
                mg9 mg9Var = (mg9) obj;
                yl1 yl1Var2 = (yl1) obj2;
                mg9Var.getClass();
                yl1Var2.getClass();
                if (yl1Var2 instanceof ig9) {
                    return ((ig9) yl1Var2).c(mg9Var);
                }
                return yl1Var2.a().c(mg9Var);
            case 13:
                rx9 rx9Var2 = (rx9) obj;
                aw7 aw7Var = (aw7) obj2;
                if (aw7Var instanceof ira) {
                    ira iraVar = (ira) aw7Var;
                    Object invoke = jub.d.a.invoke(rx9Var2, iraVar.getValue());
                    if (invoke == null) {
                        return null;
                    }
                    kra d = iraVar.d();
                    d.getClass();
                    return new hm8(invoke, d);
                }
                vs.m("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                return null;
            case 14:
                b82 b82Var = (b82) obj2;
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 15:
                rx9 rx9Var3 = (rx9) obj;
                tx9 tx9Var = (tx9) obj2;
                Map map = tx9Var.a;
                tv7 tv7Var = tx9Var.b;
                Object[] objArr = tv7Var.b;
                Object[] objArr2 = tv7Var.c;
                long[] jArr = tv7Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map d2 = ((xx9) objArr2[i4]).d();
                                    if (d2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, d2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                            }
                        }
                        if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 16:
                rx9 rx9Var4 = (rx9) obj;
                return obj2;
            case 17:
                ps psVar = (ps) obj2;
                return tl1.m(psVar.b, cz9.a(psVar.a, cz9.b, (rx9) obj));
            case 18:
                rx9 rx9Var5 = (rx9) obj;
                return Integer.valueOf(((gpb) obj2).a);
            case 19:
                rx9 rx9Var6 = (rx9) obj;
                nub nubVar = (nub) obj2;
                return tl1.m(Float.valueOf(nubVar.a), Float.valueOf(nubVar.b));
            case 20:
                rx9 rx9Var7 = (rx9) obj;
                rub rubVar = (rub) obj2;
                e4c e4cVar = new e4c(rubVar.a);
                bz9 bz9Var = cz9.x;
                return tl1.m(cz9.a(e4cVar, bz9Var, rx9Var7), cz9.a(new e4c(rubVar.b), bz9Var, rx9Var7));
            case 21:
                rx9 rx9Var8 = (rx9) obj;
                return Integer.valueOf(((dq4) obj2).a);
            case 22:
                ep6 ep6Var = (ep6) obj2;
                return tl1.m(ep6Var.a, cz9.a(ep6Var.b, cz9.j, (rx9) obj));
            case 23:
                rx9 rx9Var9 = (rx9) obj;
                return Float.valueOf(((oi0) obj2).a);
            case 24:
                rx9 rx9Var10 = (rx9) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(cz9.a((os) list.get(i5), cz9.c, rx9Var10));
                }
                return arrayList;
            case 25:
                rx9 rx9Var11 = (rx9) obj;
                fxb fxbVar = (fxb) obj2;
                return tl1.m(Integer.valueOf((int) (fxbVar.a >> 32)), Integer.valueOf((int) (fxbVar.a & 4294967295L)));
            case 26:
                rx9 rx9Var12 = (rx9) obj;
                nea neaVar = (nea) obj2;
                return tl1.m(cz9.a(new zl1(neaVar.a), cz9.r, rx9Var12), cz9.a(new y78(neaVar.b), cz9.z, rx9Var12), Float.valueOf(neaVar.c));
            case 27:
                rx9 rx9Var13 = (rx9) obj;
                return Integer.valueOf(((tlb) obj2).a);
            case 28:
                rx9 rx9Var14 = (rx9) obj;
                return Integer.valueOf(((mpb) obj2).a);
            default:
                rx9 rx9Var15 = (rx9) obj;
                return Integer.valueOf(((hj5) obj2).a);
        }
    }
}
