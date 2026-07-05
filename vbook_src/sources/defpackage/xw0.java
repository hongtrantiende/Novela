package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xw0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xw0 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xw0(iw2 iw2Var, rj8 rj8Var, cz7 cz7Var, aw7 aw7Var) {
        this.a = 11;
        this.b = iw2Var;
        this.d = rj8Var;
        this.e = cz7Var;
        this.c = aw7Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        fg6 fg6Var;
        float f;
        ik6 ik6Var;
        float f2;
        List<xl0> list;
        Object value;
        Object value2;
        long j;
        Object value3;
        int i = this.a;
        int i2 = 2;
        float f3 = nae.e;
        boolean z = true;
        String str = null;
        Long l = null;
        Object obj = null;
        switch (i) {
            case 0:
                ((aw7) this.c).setValue(Boolean.FALSE);
                z87.v((m82) this.b, null, null, new ax0((lhd) this.d, (fy0) this.e, null, 0), 3);
                return pvc.a;
            case 1:
                m82 m82Var = (m82) this.b;
                aw7 aw7Var = (aw7) this.c;
                lhd lhdVar = (lhd) this.d;
                aw7 aw7Var2 = (aw7) this.e;
                pvc pvcVar = pvc.a;
                if (((Boolean) aw7Var.getValue()).booleanValue()) {
                    aw7Var.setValue(Boolean.FALSE);
                } else {
                    z87.v(m82Var, null, null, new bx0(lhdVar, aw7Var2, null, 0), 3);
                }
                return pvcVar;
            case 2:
                ng1 ng1Var = (ng1) this.b;
                ((aw7) this.c).setValue(Boolean.FALSE);
                String str2 = (String) ((aw7) this.d).getValue();
                f76 f76Var = (f76) ((aw7) this.e).getValue();
                str2.getClass();
                Long U = r4b.U(ng1Var.c);
                if (U != null) {
                    long longValue = U.longValue();
                    String obj2 = k4b.N0(str2).toString();
                    if (obj2.length() != 0 && !((cg1) ng1Var.C.getValue()).v) {
                        hk1 a = jdd.a(ng1Var);
                        sw2 sw2Var = ab3.a;
                        ng1Var.f(a, ru2.c, new lg1(ng1Var, longValue, obj2, f76Var, (m42) null));
                    }
                }
                return pvc.a;
            case 3:
                rv4 rv4Var = (rv4) this.b;
                pa1 pa1Var = (pa1) this.c;
                aqa aqaVar = (aqa) this.d;
                ls7 ls7Var = (ls7) this.e;
                bx1 bx1Var = rv4Var.M;
                pa1 pa1Var2 = bx1Var.b;
                try {
                    bx1Var.b = pa1Var;
                    aqa aqaVar2 = rv4Var.G;
                    int[] iArr = rv4Var.o;
                    wu7 wu7Var = rv4Var.v;
                    rv4Var.o = null;
                    rv4Var.v = null;
                    rv4Var.G = aqaVar;
                    boolean z2 = bx1Var.e;
                    try {
                        bx1Var.e = false;
                        rv4Var.G(ls7Var.a, ls7Var.g, ls7Var.b, true);
                        rv4Var.G = aqaVar2;
                        rv4Var.o = iArr;
                        rv4Var.v = wu7Var;
                        bx1Var.b = pa1Var2;
                        return pvc.a;
                    } finally {
                        bx1Var.e = z2;
                    }
                } catch (Throwable th) {
                    bx1Var.b = pa1Var2;
                    throw th;
                }
            case 4:
                yya yyaVar = (yya) this.d;
                qo3 qo3Var = (qo3) this.e;
                List list2 = (List) ((yya) this.b).getValue();
                pm0 pm0Var = (pm0) ((yya) this.c).getValue();
                if (pm0Var != null) {
                    str = pm0Var.a;
                }
                Set set = (Set) yyaVar.getValue();
                list2.getClass();
                set.getClass();
                qo3Var.getClass();
                List<Number> q = qwe.q(str, list2, set);
                if (q.isEmpty()) {
                    return vt5.d;
                }
                ArrayList arrayList = new ArrayList(tl1.s(q, 10));
                for (Number number : q) {
                    arrayList.add(new pm0(((xl0) list2.get(number.intValue())).a));
                }
                if (!qo3Var.b) {
                    return new vt5(false, false, arrayList);
                }
                return new vt5(qwe.k(list2, q, rt5.Forward), qwe.k(list2, q, rt5.Backward), arrayList);
            case 5:
                Float f4 = (Float) this.b;
                yu5 yu5Var = (yu5) this.c;
                Float f5 = (Float) this.d;
                xu5 xu5Var = (xu5) this.e;
                if (!f4.equals(yu5Var.a) || !f5.equals(yu5Var.b)) {
                    yu5Var.a = f4;
                    yu5Var.b = f5;
                    yu5Var.d = new xkb(xu5Var, fca.f, f4, f5, null);
                    yu5Var.D.b.setValue(Boolean.TRUE);
                    yu5Var.e = false;
                    yu5Var.f = true;
                }
                return pvc.a;
            case 6:
                xt4 xt4Var = (xt4) this.b;
                bsa bsaVar = (bsa) this.d;
                yya yyaVar2 = (yya) this.e;
                String str3 = ((jub) ((aw7) this.c).getValue()).a.b;
                Pattern compile = Pattern.compile("(https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF][a-zA-Z0-9-\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]\\.[^\\s]{2,}|www\\.[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF][a-zA-Z0-9-\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]\\.[^\\s]{2,}|https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+\\.[^\\s]{2,}|www\\.[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+\\.[^\\s]{2,})");
                compile.getClass();
                str3.getClass();
                if (compile.matcher(str3).matches()) {
                    if (r4b.Q(str3, "http", false)) {
                        xt4Var.invoke(str3);
                    } else {
                        xt4Var.invoke("https://".concat(str3));
                    }
                } else {
                    Iterator it = ((mx0) yyaVar2.getValue()).b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((kx0) next).a.equals(((mx0) yyaVar2.getValue()).a)) {
                                obj = next;
                            }
                        }
                    }
                    kx0 kx0Var = (kx0) obj;
                    if (kx0Var != null) {
                        xt4Var.invoke(rqe.h(kx0Var.c, str3));
                    }
                }
                if (bsaVar != null) {
                    ((w03) bsaVar).a();
                }
                return pvc.a;
            case 7:
                qg6 qg6Var = (qg6) this.b;
                yya yyaVar3 = (yya) this.c;
                yya yyaVar4 = (yya) this.d;
                yya yyaVar5 = (yya) this.e;
                eg6 j2 = qg6Var.j();
                int i3 = j2.p;
                List list3 = j2.m;
                if (i3 != 0 && (fg6Var = (fg6) yyaVar3.getValue()) != null) {
                    int i4 = qg6Var.i();
                    int i5 = (int) (fg6Var.w & 4294967295L);
                    if (i5 == 0) {
                        f = 0.0f;
                    } else {
                        f = i4 / i5;
                    }
                    fg6 fg6Var2 = (fg6) sl1.j0(list3);
                    int i6 = j2.o;
                    int i7 = (int) (fg6Var2.w & 4294967295L);
                    if (i7 != 0) {
                        f3 = (i6 - ((int) (4294967295L & fg6Var2.x))) / i7;
                    }
                    f3 = ((((list3.size() / ((Number) yyaVar4.getValue()).intValue()) - (((Boolean) yyaVar5.getValue()).booleanValue() ? 1 : 0)) - f) - (1.0f - f3)) / (j2.p / ((Number) yyaVar4.getValue()).intValue());
                }
                return Float.valueOf(f3);
            case 8:
                nk6 nk6Var = (nk6) this.b;
                yya yyaVar6 = (yya) this.c;
                yya yyaVar7 = (yya) this.d;
                yya yyaVar8 = (yya) this.e;
                gk6 g = nk6Var.g();
                int i8 = g.l;
                List list4 = g.m;
                if (i8 != 0 && (ik6Var = (ik6) yyaVar6.getValue()) != null) {
                    int h = ((em8) nk6Var.c.f).h();
                    int i9 = (int) (ik6Var.v & 4294967295L);
                    if (i9 == 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = h / i9;
                    }
                    ik6 ik6Var2 = (ik6) sl1.j0(list4);
                    int i10 = g.p;
                    int i11 = (int) (ik6Var2.v & 4294967295L);
                    if (i11 != 0) {
                        f3 = (i10 - ((int) (4294967295L & ik6Var2.w))) / i11;
                    }
                    f3 = ((((list4.size() / ((Number) yyaVar7.getValue()).intValue()) - (((Boolean) yyaVar8.getValue()).booleanValue() ? 1 : 0)) - f2) - (1.0f - f3)) / (g.l / ((Number) yyaVar7.getValue()).intValue());
                }
                return Float.valueOf(f3);
            case 9:
                ym0 ym0Var = (ym0) this.c;
                wm0 wm0Var = (wm0) this.d;
                uo3 uo3Var = (uo3) this.e;
                np6 np6Var = (np6) ((kp6) this.b).g.getValue();
                if (np6Var != null) {
                    if (np6Var.b == ym0Var.b.h() && np6Var.c == wm0Var.b.h() && ((list = uo3Var.e().a) == null || !list.isEmpty())) {
                        for (xl0 xl0Var : list) {
                            if (!c16.i(xl0Var.a, np6Var.a.a) || !xl0Var.b.d() || !(xl0Var.c instanceof cm0)) {
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            case 10:
                ae0 ae0Var = (ae0) this.b;
                sx6 sx6Var = (sx6) this.d;
                aw7 aw7Var3 = (aw7) this.c;
                aw7 aw7Var4 = (aw7) this.e;
                if (ae0Var != null) {
                    ((cf) ae0Var).a.a();
                }
                String str4 = (String) aw7Var3.getValue();
                String str5 = (String) aw7Var4.getValue();
                str4.getClass();
                str5.getClass();
                hk1 a2 = jdd.a(sx6Var);
                sw2 sw2Var2 = ab3.a;
                sx6Var.f(a2, ru2.c, new z45(sx6Var, str4, str5, (m42) null, 7));
                return pvc.a;
            case 11:
                rj8 rj8Var = (rj8) this.d;
                cz7 cz7Var = (cz7) this.e;
                aw7 aw7Var5 = (aw7) this.c;
                if (((iw2) this.b).k() == 2) {
                    if (rj8Var.k() == 0) {
                        i2 = 1;
                    }
                    cz7Var.getClass();
                    cz7Var.a.c(new zhc(i2, null));
                } else {
                    aw7Var5.setValue(Boolean.TRUE);
                }
                return pvc.a;
            case 12:
                rx5 rx5Var = (rx5) this.b;
                xt4 xt4Var2 = (xt4) this.d;
                o65 o65Var = new o65(2, (vt4) this.c, xt4Var2);
                o65 o65Var2 = new o65(3, (vt4) this.e, xt4Var2);
                cza czaVar = rx5Var.d;
                String str6 = ((ox5) czaVar.getValue()).a;
                if (!k4b.j0(str6)) {
                    if (czaVar != null) {
                        do {
                            value = czaVar.getValue();
                        } while (!czaVar.l(value, ox5.a((ox5) value, ux5.d, null, 5)));
                        hk1 a3 = jdd.a(rx5Var);
                        sw2 sw2Var3 = ab3.a;
                        rx5Var.f(a3, ru2.c, new r9(rx5Var, str6, o65Var, o65Var2, (m42) null, 15));
                    } else {
                        hk1 a32 = jdd.a(rx5Var);
                        sw2 sw2Var32 = ab3.a;
                        rx5Var.f(a32, ru2.c, new r9(rx5Var, str6, o65Var, o65Var2, (m42) null, 15));
                    }
                }
                return pvc.a;
            case 13:
                tx5 tx5Var = (tx5) this.b;
                xt4 xt4Var3 = (xt4) this.d;
                o65 o65Var3 = new o65(4, (vt4) this.c, xt4Var3);
                o65 o65Var4 = new o65(5, (vt4) this.e, xt4Var3);
                cza czaVar2 = tx5Var.e;
                String str7 = ((sx5) czaVar2.getValue()).a;
                if (!k4b.j0(str7)) {
                    if (czaVar2 != null) {
                        do {
                            value2 = czaVar2.getValue();
                        } while (!czaVar2.l(value2, sx5.a((sx5) value2, ux5.d, null, 5)));
                        hk1 a4 = jdd.a(tx5Var);
                        sw2 sw2Var4 = ab3.a;
                        tx5Var.f(a4, ru2.c, new r9(tx5Var, str7, o65Var3, o65Var4, (m42) null, 16));
                    } else {
                        hk1 a42 = jdd.a(tx5Var);
                        sw2 sw2Var42 = ab3.a;
                        tx5Var.f(a42, ru2.c, new r9(tx5Var, str7, o65Var3, o65Var4, (m42) null, 16));
                    }
                }
                return pvc.a;
            case 14:
                xt4 xt4Var4 = (xt4) this.b;
                Long[] lArr = (Long[]) this.d;
                aw7 aw7Var6 = (aw7) this.c;
                aw7 aw7Var7 = (aw7) this.e;
                if (((Number) aw7Var6.getValue()).intValue() == 5) {
                    Long U2 = r4b.U(((jub) aw7Var7.getValue()).a.b);
                    if (U2 != null) {
                        j = U2.longValue();
                    } else {
                        j = 0;
                    }
                    xt4Var4.invoke(Long.valueOf(j * 60));
                } else {
                    xt4Var4.invoke(lArr[((Number) aw7Var6.getValue()).intValue()]);
                }
                return pvc.a;
            case 15:
                String str8 = (String) this.d;
                aw7 aw7Var8 = (aw7) this.c;
                aw7 aw7Var9 = (aw7) this.e;
                for (pn1 pn1Var : (List) this.b) {
                    if (c16.i(pn1Var.a, str8)) {
                        aw7Var8.setValue(pn1Var);
                        aw7Var9.setValue(Boolean.TRUE);
                        return pvc.a;
                    }
                }
                p1a.l("Collection contains no element matching the predicate.");
                return null;
            case 16:
                g08 g08Var = (g08) this.b;
                g08Var.c.setValue((xz9) this.c);
                g08Var.b.setValue((List) this.d);
                g08Var.d.setValue((List) this.e);
                return pvc.a;
            case 17:
                ppb ppbVar = (ppb) this.c;
                zl0 zl0Var = (zl0) this.d;
                xl0 xl0Var2 = (xl0) this.e;
                if (((qo3) this.b).b) {
                    ppbVar.a();
                    zl0Var.a(xl0Var2.a);
                }
                return pvc.a;
            case 18:
                aw7 aw7Var10 = (aw7) this.b;
                aw7 aw7Var11 = (aw7) this.d;
                aw7 aw7Var12 = (aw7) this.e;
                if (!((Boolean) ((aw7) this.c).getValue()).booleanValue() && !((Boolean) aw7Var10.getValue()).booleanValue() && !((Boolean) aw7Var11.getValue()).booleanValue() && !((Boolean) aw7Var12.getValue()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                Boolean bool = Boolean.FALSE;
                ((aw7) this.c).setValue(bool);
                kwe.j((aw7) this.d, true);
                ((aw7) this.e).setValue(bool);
                ((y5c) this.b).X();
                return pvc.a;
            case 20:
                t2c t2cVar = (t2c) this.c;
                dm8 dm8Var = (dm8) this.d;
                float c = z4d.c(((c5d) this.b).b());
                tza tzaVar = e1c.a;
                if (dm8Var.h() <= ((dm8) this.e).h() * 0.25f && c <= 1500.0f) {
                    dm8Var.i(nae.e);
                } else {
                    t2cVar.k();
                }
                return pvc.a;
            case 21:
                StringBuilder o = a82.o("TileManager. updateTileSnapshotList:", (String) this.c, ". end. running=");
                o.append(((vl9) this.d).a);
                o.append(", active=");
                o.append(k27.v((m82) this.b));
                o.append(". '");
                return rs8.h(((z8c) this.e).b, o, '\'');
            case 22:
                shc shcVar = (shc) this.b;
                aw7 aw7Var13 = (aw7) this.e;
                String c2 = ((h81) this.d).c();
                cp9 cp9Var = (cp9) ((aw7) this.c).getValue();
                if (cp9Var != null) {
                    l = Long.valueOf(cp9Var.a);
                }
                Long l2 = l;
                List list5 = (List) aw7Var13.getValue();
                list5.getClass();
                cza czaVar3 = shcVar.C;
                w43 w43Var = ((phc) czaVar3.getValue()).g;
                if (w43Var != null && !((phc) czaVar3.getValue()).e) {
                    if (czaVar3 != null) {
                        do {
                            value3 = czaVar3.getValue();
                        } while (!czaVar3.l(value3, phc.a((phc) value3, false, false, false, false, true, false, null, null, null, null, 1007)));
                        hk1 a5 = jdd.a(shcVar);
                        sw2 sw2Var5 = ab3.a;
                        shcVar.f(a5, ru2.c, new da(shcVar, w43Var, c2, l2, list5, (m42) null, 21));
                    } else {
                        hk1 a52 = jdd.a(shcVar);
                        sw2 sw2Var52 = ab3.a;
                        shcVar.f(a52, ru2.c, new da(shcVar, w43Var, c2, l2, list5, (m42) null, 21));
                    }
                }
                return pvc.a;
            case 23:
                qzc qzcVar = (qzc) this.b;
                aw7 aw7Var14 = (aw7) this.d;
                aw7 aw7Var15 = (aw7) this.e;
                if (c16.i((String) ((aw7) this.c).getValue(), qzcVar.a) && c16.i((String) aw7Var14.getValue(), qzcVar.b) && ((nl5) aw7Var15.getValue()) == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                eg0.n((m82) this.b, (aw7) this.d, (qg6) this.e, ((Number) ((aw7) this.c).getValue()).intValue());
                return pvc.a;
            default:
                gmd gmdVar = (gmd) this.b;
                jq4 jq4Var = (jq4) this.d;
                Context context = (Context) this.e;
                String uuid = ((UUID) this.c).toString();
                ymd e = gmdVar.c.e(uuid);
                if (e != null && !e.b.a()) {
                    v69 v69Var = gmdVar.b;
                    synchronized (v69Var.k) {
                        try {
                            r95.n().p(v69.l, "Moving WorkSpec (" + uuid + ") to the foreground");
                            nnd nndVar = (nnd) v69Var.g.remove(uuid);
                            if (nndVar != null) {
                                if (v69Var.a == null) {
                                    PowerManager.WakeLock a6 = efd.a(v69Var.b);
                                    v69Var.a = a6;
                                    a6.acquire();
                                }
                                v69Var.f.put(uuid, nndVar);
                                eze.s(v69Var.b, egb.c(v69Var.b, dxe.s(nndVar.a), jq4Var));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    hmd s = dxe.s(e);
                    String str9 = egb.F;
                    Intent intent = new Intent(context, SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", jq4Var.a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", jq4Var.b);
                    intent.putExtra("KEY_NOTIFICATION", jq4Var.c);
                    intent.putExtra("KEY_WORKSPEC_ID", s.a);
                    intent.putExtra("KEY_GENERATION", s.b);
                    context.startService(intent);
                } else {
                    vs.k("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                return null;
        }
    }

    public /* synthetic */ xw0(aw7 aw7Var, Object obj, aw7 aw7Var2, Object obj2, int i) {
        this.a = i;
        this.c = aw7Var;
        this.b = obj;
        this.d = aw7Var2;
        this.e = obj2;
    }

    public /* synthetic */ xw0(Object obj, Object obj2, aw7 aw7Var, yya yyaVar, int i) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = aw7Var;
        this.e = yyaVar;
    }

    public /* synthetic */ xw0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ xw0(String str, vl9 vl9Var, m82 m82Var, z8c z8cVar) {
        this.a = 21;
        this.c = str;
        this.d = vl9Var;
        this.b = m82Var;
        this.e = z8cVar;
    }
}
