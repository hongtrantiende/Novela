package defpackage;

import android.content.ClipData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wr9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wr9 implements xt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ wr9(fu9 fu9Var) {
        this.a = 3;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        sy5 sy5Var;
        uva uvaVar;
        uva uvaVar2;
        uva uvaVar3;
        List list;
        e4c e4cVar;
        Integer num;
        zl1 zl1Var;
        y78 y78Var;
        String str;
        lvb lvbVar;
        os osVar;
        Float f;
        Float f2;
        nv6 nv6Var;
        int i = this.a;
        pvc pvcVar = pvc.a;
        uva uvaVar4 = null;
        Float f3 = null;
        f4c f4cVar = null;
        Float f4 = null;
        Integer num2 = null;
        e4c e4cVar2 = null;
        String str2 = null;
        uvaVar4 = null;
        boolean z = true;
        int i2 = 0;
        switch (i) {
            case 0:
                hj1 hj1Var = (hj1) obj;
                hj1Var.getClass();
                vr9 vr9Var = (vr9) hj1Var.b;
                hj1Var.a(zj1.b, new zr9(vr9Var.b, hj1Var, vr9Var.a, null));
                return pvcVar;
            case 1:
                tm4 tm4Var = (tm4) obj;
                tm4Var.getClass();
                tm4Var.d(false);
                return pvcVar;
            case 2:
                vx1 vx1Var = (vx1) obj;
                return new ft9();
            case 3:
                ((hi2) obj).getClass();
                throw new g48(0);
            case 4:
                bh3 bh3Var = (bh3) obj;
                bh3Var.getClass();
                ClipData clipData = bh3Var.a.getClipData();
                if (clipData != null && clipData.getItemCount() != 0) {
                    ty5 F = dce.F(0, clipData.getItemCount());
                    if (!(F instanceof Collection) || !((Collection) F).isEmpty()) {
                        Iterator it = F.iterator();
                        do {
                            sy5Var = (sy5) it;
                            if (sy5Var.hasNext()) {
                            }
                        } while (clipData.getItemAt(sy5Var.nextInt()).getUri() == null);
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 5:
                return new tx9((Map) obj);
            case 6:
                List list2 = (List) obj;
                list2.getClass();
                return new cw7((s76) sl1.c0(list2), 0);
            case 7:
                List list3 = (List) obj;
                list3.getClass();
                return new cw7((s76) sl1.c0(list3), 1);
            case 8:
                return obj;
            case 9:
                obj.getClass();
                List list4 = (List) obj;
                Object obj2 = list4.get(0);
                xt4 xt4Var = cz9.i.b;
                Boolean bool = Boolean.FALSE;
                if (c16.i(obj2, bool) || obj2 == null) {
                    uvaVar = null;
                } else {
                    uvaVar = (uva) xt4Var.invoke(obj2);
                }
                Object obj3 = list4.get(1);
                if (c16.i(obj3, bool) || obj3 == null) {
                    uvaVar2 = null;
                } else {
                    uvaVar2 = (uva) xt4Var.invoke(obj3);
                }
                Object obj4 = list4.get(2);
                if (c16.i(obj4, bool) || obj4 == null) {
                    uvaVar3 = null;
                } else {
                    uvaVar3 = (uva) xt4Var.invoke(obj4);
                }
                Object obj5 = list4.get(3);
                if (!c16.i(obj5, bool) && obj5 != null) {
                    uvaVar4 = (uva) xt4Var.invoke(obj5);
                }
                return new lvb(uvaVar, uvaVar2, uvaVar3, uvaVar4);
            case 10:
                obj.getClass();
                List list5 = (List) obj;
                Object obj6 = list5.get(1);
                yy9 yy9Var = cz9.b;
                if (c16.i(obj6, Boolean.FALSE) || obj6 == null) {
                    list = null;
                } else {
                    list = (List) yy9Var.b.invoke(obj6);
                }
                Object obj7 = list5.get(0);
                if (obj7 != null) {
                    str2 = (String) obj7;
                }
                str2.getClass();
                return new ps(list, str2);
            case 11:
                obj.getClass();
                return new gpb(((Integer) obj).intValue());
            case 12:
                obj.getClass();
                List list6 = (List) obj;
                return new nub(((Number) list6.get(0)).floatValue(), ((Number) list6.get(1)).floatValue());
            case 13:
                obj.getClass();
                List list7 = (List) obj;
                Object obj8 = list7.get(0);
                f4c[] f4cVarArr = e4c.b;
                xt4 xt4Var2 = cz9.x.b;
                Boolean bool2 = Boolean.FALSE;
                c16.i(obj8, bool2);
                if (obj8 != null) {
                    e4cVar = (e4c) xt4Var2.invoke(obj8);
                } else {
                    e4cVar = null;
                }
                e4cVar.getClass();
                long j = e4cVar.a;
                Object obj9 = list7.get(1);
                c16.i(obj9, bool2);
                if (obj9 != null) {
                    e4cVar2 = (e4c) xt4Var2.invoke(obj9);
                }
                e4cVar2.getClass();
                return new rub(j, e4cVar2.a);
            case 14:
                obj.getClass();
                return new dq4(((Integer) obj).intValue());
            case 15:
                obj.getClass();
                return new oi0(((Float) obj).floatValue());
            case 16:
                obj.getClass();
                List list8 = (List) obj;
                Object obj10 = list8.get(0);
                if (obj10 != null) {
                    num = (Integer) obj10;
                } else {
                    num = null;
                }
                num.getClass();
                int intValue = num.intValue();
                Object obj11 = list8.get(1);
                if (obj11 != null) {
                    num2 = (Integer) obj11;
                }
                num2.getClass();
                return new fxb(sze.a(intValue, num2.intValue()));
            case 17:
                obj.getClass();
                List list9 = (List) obj;
                Object obj12 = list9.get(0);
                int i3 = zl1.j;
                Boolean bool3 = Boolean.FALSE;
                c16.i(obj12, bool3);
                if (obj12 != null) {
                    if (obj12.equals(bool3)) {
                        zl1Var = new zl1(zl1.i);
                    } else {
                        zl1Var = new zl1(sve.b(((Integer) obj12).intValue()));
                    }
                } else {
                    zl1Var = null;
                }
                zl1Var.getClass();
                long j2 = zl1Var.a;
                Object obj13 = list9.get(1);
                bz9 bz9Var = cz9.z;
                c16.i(obj13, bool3);
                if (obj13 != null) {
                    y78Var = (y78) bz9Var.b.invoke(obj13);
                } else {
                    y78Var = null;
                }
                y78Var.getClass();
                long j3 = y78Var.a;
                Object obj14 = list9.get(2);
                if (obj14 != null) {
                    f4 = (Float) obj14;
                }
                f4.getClass();
                return new nea(f4.floatValue(), j2, j3);
            case 18:
                obj.getClass();
                return new tlb(((Integer) obj).intValue());
            case 19:
                obj.getClass();
                List list10 = (List) obj;
                Object obj15 = list10.get(0);
                if (obj15 != null) {
                    str = (String) obj15;
                } else {
                    str = null;
                }
                str.getClass();
                Object obj16 = list10.get(1);
                yy9 yy9Var2 = cz9.j;
                if (c16.i(obj16, Boolean.FALSE) || obj16 == null) {
                    lvbVar = null;
                } else {
                    lvbVar = (lvb) yy9Var2.b.invoke(obj16);
                }
                return new ep6(str, lvbVar, null);
            case 20:
                obj.getClass();
                return new mpb(((Integer) obj).intValue());
            case 21:
                obj.getClass();
                return new hj5(((Integer) obj).intValue());
            case 22:
                obj.getClass();
                List list11 = (List) obj;
                ArrayList arrayList = new ArrayList(list11.size());
                int size = list11.size();
                while (i2 < size) {
                    Object obj17 = list11.get(i2);
                    yy9 yy9Var3 = cz9.c;
                    if (c16.i(obj17, Boolean.FALSE) || obj17 == null) {
                        osVar = null;
                    } else {
                        osVar = (os) yy9Var3.b.invoke(obj17);
                    }
                    osVar.getClass();
                    arrayList.add(osVar);
                    i2++;
                }
                return arrayList;
            case 23:
                obj.getClass();
                return new wp4(((Integer) obj).intValue());
            case 24:
                obj.getClass();
                return new xp4(((Integer) obj).intValue());
            case 25:
                Boolean bool4 = Boolean.FALSE;
                if (c16.i(obj, bool4)) {
                    return new e4c(e4c.c);
                }
                obj.getClass();
                List list12 = (List) obj;
                Object obj18 = list12.get(0);
                if (obj18 != null) {
                    f = (Float) obj18;
                } else {
                    f = null;
                }
                f.getClass();
                float floatValue = f.floatValue();
                Object obj19 = list12.get(1);
                bz9 bz9Var2 = cz9.y;
                c16.i(obj19, bool4);
                if (obj19 != null) {
                    f4cVar = (f4c) bz9Var2.b.invoke(obj19);
                }
                f4cVar.getClass();
                return new e4c(zr1.x(floatValue, f4cVar.a));
            case 26:
                if (c16.i(obj, 0)) {
                    return new f4c(8589934592L);
                }
                if (c16.i(obj, 1)) {
                    return new f4c(4294967296L);
                }
                return new f4c(0L);
            case 27:
                if (c16.i(obj, Boolean.FALSE)) {
                    return new y78(9205357640488583168L);
                }
                obj.getClass();
                List list13 = (List) obj;
                Object obj20 = list13.get(0);
                if (obj20 != null) {
                    f2 = (Float) obj20;
                } else {
                    f2 = null;
                }
                f2.getClass();
                float floatValue2 = f2.floatValue();
                Object obj21 = list13.get(1);
                if (obj21 != null) {
                    f3 = (Float) obj21;
                }
                f3.getClass();
                float floatValue3 = f3.floatValue();
                return new y78((Float.floatToRawIntBits(floatValue3) & 4294967295L) | (Float.floatToRawIntBits(floatValue2) << 32));
            case 28:
                obj.getClass();
                List list14 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list14.size());
                int size2 = list14.size();
                while (i2 < size2) {
                    Object obj22 = list14.get(i2);
                    yy9 yy9Var4 = cz9.B;
                    if (c16.i(obj22, Boolean.FALSE) || obj22 == null) {
                        nv6Var = null;
                    } else {
                        nv6Var = (nv6) yy9Var4.b.invoke(obj22);
                    }
                    nv6Var.getClass();
                    arrayList2.add(nv6Var);
                    i2++;
                }
                return new ov6(arrayList2);
            default:
                obj.getClass();
                return new nv6((String) obj);
        }
    }

    public /* synthetic */ wr9(int i) {
        this.a = i;
    }
}
