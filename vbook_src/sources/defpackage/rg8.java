package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rg8  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rg8 implements xt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ rg8(int i) {
        this.a = i;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = null;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                vx1 vx1Var = (vx1) obj;
                int i2 = qj.a;
                Context context = (Context) vx1Var.N0(gh.b);
                r13 r13Var = (r13) vx1Var.N0(dy1.h);
                pg8 pg8Var = (pg8) vx1Var.N0(qg8.a);
                if (pg8Var == null) {
                    return null;
                }
                return new xi(context, r13Var, pg8Var.a, pg8Var.b);
            case 1:
                ((lw8) obj).getClass();
                return pvcVar;
            case 2:
                List list = (List) obj;
                list.getClass();
                Object obj3 = list.get(0);
                obj3.getClass();
                int intValue = ((Integer) obj3).intValue();
                Object obj4 = list.get(1);
                obj4.getClass();
                float floatValue = ((Float) obj4).floatValue();
                Object obj5 = list.get(2);
                obj5.getClass();
                return new sj8(floatValue, intValue, ((Integer) obj5).intValue());
            case 3:
                wh8 wh8Var = (wh8) obj;
                wh8Var.getClass();
                return wh8Var.a;
            case 4:
                mm8 mm8Var = (mm8) obj;
                mm8Var.getClass();
                StringBuilder sb = new StringBuilder("position ");
                sb.append(mm8Var.a);
                sb.append(": '");
                return s21.p(sb, (String) mm8Var.b.invoke(), '\'');
            case 5:
                return hl5.h(4, (Integer) obj);
            case 6:
                return hl5.h(4, (Integer) obj);
            case 7:
                return hl5.h(4, (Integer) obj);
            case 8:
                return hl5.h(4, (Integer) obj);
            case 9:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 10:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 11:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 12:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 13:
                ((String) obj).getClass();
                return pvcVar;
            case 14:
                ((Boolean) obj).getClass();
                return pvcVar;
            case 15:
                ((Context) obj).getClass();
                return ks3.a;
            case 16:
                y36 y36Var = (y36) obj;
                y36Var.getClass();
                y36Var.c = true;
                y36Var.e = true;
                return pvcVar;
            case 17:
                List list2 = (List) obj;
                list2.getClass();
                p59 p59Var = new p59();
                Object obj6 = list2.get(0);
                obj6.getClass();
                p59Var.a.setValue((Boolean) obj6);
                p59Var.b.setValue((String) list2.get(1));
                Object obj7 = list2.get(2);
                obj7.getClass();
                p59Var.c.setValue((List) obj7);
                return p59Var;
            case 18:
                Context context2 = (Context) obj;
                List<ResolveInfo> queryIntentActivities = context2.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(queryIntentActivities.size());
                int size = queryIntentActivities.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i3);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context2.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context2.checkSelfPermission(str) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            case 19:
                d96 d96Var = (d96) obj;
                d96Var.a = 6000;
                Float valueOf = Float.valueOf(90.0f);
                d96Var.a(300, valueOf).b = vr7.b;
                d96Var.a(1500, valueOf);
                Float valueOf2 = Float.valueOf(180.0f);
                d96Var.a(1800, valueOf2);
                d96Var.a(3000, valueOf2);
                Float valueOf3 = Float.valueOf(270.0f);
                d96Var.a(3300, valueOf3);
                d96Var.a(4500, valueOf3);
                Float valueOf4 = Float.valueOf(360.0f);
                d96Var.a(4800, valueOf4);
                d96Var.a(6000, valueOf4);
                return pvcVar;
            case 20:
                j8a.h((l8a) obj, g79.d);
                return pvcVar;
            case 21:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                Object key = entry.getKey();
                return "xmlns:" + value + "=\"" + key + "\"";
            case 22:
                qd6 qd6Var = (qd6) obj;
                ij1 ij1Var = qd6Var.a.b;
                long G = ij1Var.G();
                ij1Var.w().i();
                try {
                    ((mu9) ij1Var.b).n(-3.4028235E38f, nae.e, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    qd6Var.a();
                    return pvcVar;
                } finally {
                    rs8.r(ij1Var, G);
                }
            case 23:
                Float f = (Float) obj;
                f.getClass();
                return new ya9(new lq(f, fca.f, null, 12));
            case 24:
                te9 te9Var = (te9) obj;
                te9Var.getClass();
                String str2 = te9Var.b;
                if (str2 == null) {
                    return te9Var.a;
                }
                return str2;
            case 25:
                wq7 wq7Var = (wq7) obj;
                wq7Var.getClass();
                vh9 vh9Var = new vh9(1);
                x3b x3bVar = oaa.E;
                gi1 a = cm9.a(t2c.class);
                l96 l96Var = l96.b;
                wq7Var.a(new yx5(new yj0(x3bVar, a, vh9Var, l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(a0c.class), new vh9(8), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(gj9.class), new vh9(9), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(op1.class), new vh9(10), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(j68.class), new vh9(11), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(bw3.class), new vh9(12), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(nqd.class), new vh9(13), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(kc3.class), new vh9(14), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(ee5.class), new vh9(15), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(kd7.class), new ec7(21), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(csc.class), new ec7(22), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(da4.class), new ec7(23), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(ss8.class), new ec7(24), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(w91.class), new ec7(25), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(erd.class), new ec7(26), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(c4c.class), new ec7(27), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(bx7.class), new ec7(28), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(cqb.class), new ec7(29), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(iz6.class), new vh9(0), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(vwb.class), new vh9(2), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(xwb.class), new vh9(3), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(wwb.class), new vh9(4), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(dxb.class), new vh9(5), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(bxb.class), new vh9(6), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(iaa.class), new vh9(7), l96Var)));
                return pvcVar;
            case 26:
                b27 b27Var = (b27) obj;
                b27Var.getClass();
                return new y17(b27Var.b().a, b27Var.b().b);
            case 27:
                aw7 aw7Var = (aw7) obj;
                if (aw7Var instanceof ira) {
                    ira iraVar = (ira) aw7Var;
                    if (iraVar.getValue() != null) {
                        Object value2 = iraVar.getValue();
                        value2.getClass();
                        obj2 = jub.d.b.invoke(value2);
                    }
                    kra d = iraVar.d();
                    d.getClass();
                    return new hm8(obj2, d);
                }
                vs.m("Failed requirement.");
                return null;
            case 28:
                cr9 cr9Var = (cr9) obj;
                cr9Var.getClass();
                return cr9Var.b;
            default:
                vpd vpdVar = (vpd) obj;
                vpdVar.getClass();
                hn8 hn8Var = xq9.f;
                return Boolean.valueOf(fn8.a(vpdVar.a));
        }
    }
}
