package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: le1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class le1 implements vt4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ le1(xt4 xt4Var, String str, vt4 vt4Var, m82 m82Var, aw7 aw7Var, kb kbVar) {
        this.a = 2;
        this.e = xt4Var;
        this.f = str;
        this.C = vt4Var;
        this.c = m82Var;
        this.b = aw7Var;
        this.d = kbVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        boolean z;
        boolean z2;
        int i = this.a;
        String str = null;
        pvc pvcVar = pvc.a;
        Object obj = this.C;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                h81 h81Var = (h81) obj5;
                aw7 aw7Var = (aw7) obj4;
                ((lu4) obj6).invoke(h81Var.c(), (List) aw7Var.getValue());
                h81Var.a();
                aw7Var.setValue(ks3.a);
                Boolean bool = Boolean.FALSE;
                ((aw7) obj3).setValue(bool);
                ((aw7) obj2).setValue(bool);
                ((z86) obj).b();
                return pvcVar;
            case 1:
                Boolean bool2 = (Boolean) ((aw7) obj4).getValue();
                bool2.booleanValue();
                Boolean bool3 = (Boolean) ((aw7) obj3).getValue();
                bool3.booleanValue();
                Boolean bool4 = (Boolean) ((aw7) obj2).getValue();
                bool4.booleanValue();
                Boolean bool5 = (Boolean) ((aw7) obj5).getValue();
                bool5.booleanValue();
                Boolean bool6 = (Boolean) ((aw7) obj).getValue();
                bool6.booleanValue();
                ((ou4) obj6).l(bool2, bool3, bool4, bool5, bool6);
                return pvcVar;
            case 2:
                xt4 xt4Var = (xt4) obj6;
                String str2 = (String) obj5;
                vt4 vt4Var = (vt4) obj;
                m82 m82Var = (m82) obj3;
                kb kbVar = (kb) obj2;
                if (((y0d) ((aw7) obj4).getValue()).f) {
                    xt4Var.invoke(str2);
                    vt4Var.invoke();
                } else {
                    z87.v(m82Var, null, null, new kl7(0, kbVar, null), 3);
                }
                return pvcVar;
            case 3:
                sk8 sk8Var = (sk8) obj2;
                ((wl9) obj6).a = nae.e;
                ((vl9) obj5).a = false;
                ((c5d) obj).d();
                ((yl9) obj4).a = 0L;
                w26 w26Var = (w26) ((zl9) obj3).a;
                if (w26Var != null) {
                    w26Var.cancel(null);
                }
                iya iyaVar = (iya) sk8Var.h;
                if (iyaVar != null) {
                    iyaVar.cancel(null);
                }
                sk8Var.h = null;
                return pvcVar;
            case 4:
                rx9 rx9Var = (rx9) obj6;
                xy9 xy9Var = (xy9) obj5;
                xx9 xx9Var = (xx9) obj;
                String str3 = (String) obj4;
                Object[] objArr = (Object[]) obj2;
                if (rx9Var.b != xx9Var) {
                    rx9Var.b = xx9Var;
                    z = true;
                } else {
                    z = false;
                }
                if (!c16.i(rx9Var.c, str3)) {
                    rx9Var.c = str3;
                    z2 = true;
                } else {
                    z2 = z;
                }
                rx9Var.a = xy9Var;
                rx9Var.d = obj3;
                rx9Var.e = objArr;
                wx9 wx9Var = rx9Var.f;
                if (wx9Var != null && z2) {
                    ((yx9) wx9Var).o();
                    rx9Var.f = null;
                    rx9Var.d();
                }
                return pvcVar;
            case 5:
                yda ydaVar = (yda) obj6;
                m82 m82Var2 = (m82) obj5;
                aw7 aw7Var2 = (aw7) obj4;
                aw7 aw7Var3 = (aw7) obj3;
                kb kbVar2 = (kb) obj;
                sac sacVar = (sac) obj2;
                yj1 yj1Var = by5.a;
                if (yj1Var.k().b() - ((Number) aw7Var2.getValue()).longValue() < 1000) {
                    aw7Var3.setValue(Integer.valueOf(((Number) aw7Var3.getValue()).intValue() + 1));
                } else {
                    aw7Var3.setValue(1);
                }
                if (((Number) aw7Var3.getValue()).intValue() == 7) {
                    hk1 a = jdd.a(ydaVar);
                    sw2 sw2Var = ab3.a;
                    ydaVar.f(a, ru2.c, new wda(ydaVar, null, 0));
                    z87.v(m82Var2, null, null, new kl7(1, kbVar2, null), 3);
                } else if (((Number) aw7Var3.getValue()).intValue() > 2) {
                    z87.v(m82Var2, null, null, new jk8(sacVar, aw7Var3, (m42) null, 21), 3);
                }
                aw7Var2.setValue(Long.valueOf(yj1Var.k().b()));
                return pvcVar;
            case 6:
                int size = ((List) obj6).size();
                int i2 = ((xl9) obj5).a;
                int i3 = ((xl9) obj).a;
                int i4 = ((xl9) obj4).a;
                int i5 = ((xl9) obj3).a;
                g7b g7bVar = ((e7b) obj2).L.e.o;
                if (g7bVar != null) {
                    str = g7bVar.a();
                }
                StringBuilder r = hl5.r(size, i2, "SubsamplingState. drawTiles. tiles=", ", insideLoadCount=", ", outsideLoadCount=");
                rs8.q(i3, i4, ", realDrawCount=", ", backgroundCount=", r);
                r.append(i5);
                r.append(". '");
                r.append(str);
                r.append("'");
                return r.toString();
            case 7:
                int size2 = ((List) obj6).size();
                int i6 = ((xl9) obj5).a;
                int i7 = ((xl9) obj).a;
                int i8 = ((xl9) obj4).a;
                int i9 = ((xl9) obj3).a;
                g7b g7bVar2 = ((f7b) obj2).L.e.o;
                if (g7bVar2 != null) {
                    str = g7bVar2.a();
                }
                StringBuilder r2 = hl5.r(size2, i6, "SubsamplingState. drawTiles. tiles=", ", insideLoadCount=", ", outsideLoadCount=");
                rs8.q(i7, i8, ", realDrawCount=", ", backgroundCount=", r2);
                r2.append(i9);
                r2.append(". '");
                r2.append(str);
                r2.append("'");
                return r2.toString();
            case 8:
                xt4 xt4Var2 = (xt4) obj6;
                xt4 xt4Var3 = (xt4) obj5;
                String obj7 = k4b.N0((String) ((aw7) obj4).getValue()).toString();
                String obj8 = k4b.N0((String) ((aw7) obj3).getValue()).toString();
                String str4 = (String) ((aw7) obj2).getValue();
                String obj9 = k4b.N0((String) ((aw7) obj).getValue()).toString();
                if (k4b.j0(obj9)) {
                    obj9 = "vbook_backup";
                }
                xt4Var2.invoke(new xfd(obj7, obj8, str4, obj9));
                xt4Var3.invoke(Boolean.FALSE);
                return pvcVar;
            default:
                ((ou4) obj6).l((String) ((aw7) obj4).getValue(), (String) ((aw7) obj3).getValue(), (String) ((aw7) obj2).getValue(), (f76) ((aw7) obj).getValue(), (List) obj5);
                return pvcVar;
        }
    }

    public /* synthetic */ le1(hu4 hu4Var, Object obj, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, aw7 aw7Var4, int i) {
        this.a = i;
        this.e = hu4Var;
        this.f = obj;
        this.b = aw7Var;
        this.c = aw7Var2;
        this.d = aw7Var3;
        this.C = aw7Var4;
    }

    public /* synthetic */ le1(ou4 ou4Var, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, aw7 aw7Var4, aw7 aw7Var5) {
        this.a = 1;
        this.e = ou4Var;
        this.b = aw7Var;
        this.c = aw7Var2;
        this.d = aw7Var3;
        this.f = aw7Var4;
        this.C = aw7Var5;
    }

    public /* synthetic */ le1(yda ydaVar, m82 m82Var, aw7 aw7Var, aw7 aw7Var2, kb kbVar, sac sacVar) {
        this.a = 5;
        this.e = ydaVar;
        this.f = m82Var;
        this.b = aw7Var;
        this.c = aw7Var2;
        this.C = kbVar;
        this.d = sacVar;
    }

    public /* synthetic */ le1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.e = obj;
        this.f = obj2;
        this.C = obj3;
        this.b = obj4;
        this.c = obj5;
        this.d = obj6;
    }
}
