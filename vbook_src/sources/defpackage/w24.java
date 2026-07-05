package defpackage;

import android.os.Trace;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w24  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w24 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w24(xt4 xt4Var, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, aw7 aw7Var4) {
        this.a = 5;
        this.b = xt4Var;
        this.c = aw7Var;
        this.d = aw7Var2;
        this.f = aw7Var3;
        this.e = aw7Var4;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        String str;
        long j;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj = this.f;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                mu4 mu4Var = (mu4) obj5;
                xt4 xt4Var = (xt4) obj4;
                aw7 aw7Var = (aw7) obj2;
                aw7 aw7Var2 = (aw7) obj;
                String str2 = (String) ((aw7) obj3).getValue();
                if (k4b.j0(str2)) {
                    str2 = "1";
                }
                String str3 = (String) aw7Var.getValue();
                if (k4b.j0(str3)) {
                    str3 = str2;
                }
                mu4Var.c((f24) aw7Var2.getValue(), str2, str3);
                xt4Var.invoke(Boolean.FALSE);
                return pvcVar;
            case 1:
                pc9 pc9Var = (pc9) obj5;
                lu4 lu4Var = (lu4) obj;
                xt4 xt4Var2 = (xt4) obj4;
                aw7 aw7Var3 = (aw7) obj3;
                aw7 aw7Var4 = (aw7) obj2;
                if (pc9Var != null && (str = pc9Var.a) != null && ((String) aw7Var3.getValue()) == null && !k4b.j0(((jub) aw7Var4.getValue()).a.b)) {
                    lu4Var.invoke(str, ((jub) aw7Var4.getValue()).a.b);
                    xt4Var2.invoke(Boolean.FALSE);
                }
                return pvcVar;
            case 2:
                lu4 lu4Var2 = (lu4) obj5;
                Long[] lArr = (Long[]) obj4;
                aw7 aw7Var5 = (aw7) obj3;
                aw7 aw7Var6 = (aw7) obj2;
                aw7 aw7Var7 = (aw7) obj;
                if (((Number) aw7Var5.getValue()).intValue() == 5) {
                    Long U = r4b.U(((jub) aw7Var6.getValue()).a.b);
                    if (U != null) {
                        j = U.longValue();
                    } else {
                        j = 0;
                    }
                    Long valueOf = Long.valueOf(j * 60);
                    Boolean bool = (Boolean) aw7Var7.getValue();
                    bool.booleanValue();
                    lu4Var2.invoke(valueOf, bool);
                } else {
                    Long l = lArr[((Number) aw7Var5.getValue()).intValue()];
                    Boolean bool2 = (Boolean) aw7Var7.getValue();
                    bool2.booleanValue();
                    lu4Var2.invoke(l, bool2);
                }
                return pvcVar;
            case 3:
                ae0 ae0Var = (ae0) obj5;
                fla flaVar = (fla) obj4;
                aw7 aw7Var8 = (aw7) obj3;
                aw7 aw7Var9 = (aw7) obj2;
                aw7 aw7Var10 = (aw7) obj;
                if (ae0Var != null) {
                    ((cf) ae0Var).a.a();
                }
                String str4 = (String) aw7Var8.getValue();
                String str5 = (String) aw7Var9.getValue();
                String str6 = (String) aw7Var10.getValue();
                str4.getClass();
                str5.getClass();
                str6.getClass();
                fdd.g(flaVar, jdd.a(flaVar), new lc9(flaVar, str5, str6, str4, (m42) null, 6));
                return pvcVar;
            case 4:
                w5b w5bVar = (w5b) obj5;
                r13 r13Var = (r13) obj4;
                x5b x5bVar = (x5b) obj3;
                x5b x5bVar2 = (x5b) obj2;
                xl9 xl9Var = (xl9) obj;
                mq9 mq9Var = w5bVar.O;
                n5b n5bVar = w5bVar.N;
                mq9Var.getClass();
                Trace.beginSection("Compose:Styles:build");
                try {
                    mq9Var.b = w5bVar;
                    mq9Var.a = r13Var.f();
                    x5b x5bVar3 = mq9Var.c;
                    x5b x5bVar4 = mq9Var.d;
                    if (x5bVar4 != null) {
                        y5b.n.f(x5bVar4);
                    } else {
                        x5bVar4 = new x5b();
                    }
                    mq9Var.c = x5bVar4;
                    mq9Var.d = x5bVar3;
                    mq9Var.E = null;
                    n5bVar.a(mq9Var);
                    mq9Var.j();
                    Trace.endSection();
                    mq9Var.p(0, x5bVar);
                    w5bVar.P = x5bVar;
                    w5bVar.Q = x5bVar2;
                    xl9Var.a = mq9Var.m();
                    return pvcVar;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 5:
                xt4 xt4Var3 = (xt4) obj4;
                String obj6 = k4b.N0((String) ((aw7) obj3).getValue()).toString();
                String obj7 = k4b.N0((String) ((aw7) obj2).getValue()).toString();
                String str7 = (String) ((aw7) obj).getValue();
                String obj8 = k4b.N0((String) ((aw7) obj5).getValue()).toString();
                if (k4b.j0(obj8)) {
                    obj8 = "vbook_backup";
                }
                xt4Var3.invoke(new xfd(obj6, obj7, str7, obj8));
                return pvcVar;
            default:
                z8c z8cVar = (z8c) obj2;
                StringBuilder o = a82.o("TileManager. refreshTiles:", (String) obj5, ". interrupted, imageLoadRect is empty. imageLoadRect=");
                o.append(fca.E((vy5) obj4));
                o.append(" -> ");
                o.append(fca.E((vy5) obj3));
                o.append(", imageSize=");
                o.append(eh.C(z8cVar.e.a));
                o.append(", contentSize=");
                o.append(eh.C(z8cVar.f));
                o.append(", preferredTileSize=");
                o.append(eh.C(z8cVar.g));
                o.append(", contentVisibleRect=");
                o.append(fca.E((vy5) obj));
                o.append(", '");
                return rs8.h(z8cVar.b, o, '\'');
        }
    }

    public /* synthetic */ w24(pc9 pc9Var, lu4 lu4Var, xt4 xt4Var, aw7 aw7Var, aw7 aw7Var2) {
        this.a = 1;
        this.e = pc9Var;
        this.f = lu4Var;
        this.b = xt4Var;
        this.c = aw7Var;
        this.d = aw7Var2;
    }

    public /* synthetic */ w24(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.f = obj5;
    }
}
