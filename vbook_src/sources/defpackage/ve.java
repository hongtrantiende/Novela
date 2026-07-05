package defpackage;

import android.content.Context;
import com.reader.data.download.impl.AndroidDownloadService;
import com.reader.data.server.AndroidTestServerService;
import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ve  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ve(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [np6] */
    /* JADX WARN: Type inference failed for: r1v23, types: [my0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [o45, c3e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [o45, c3e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // defpackage.vt4
    public final Object invoke() {
        Throwable th;
        Throwable th2;
        xp6 xp6Var;
        boolean z;
        xp6 xp6Var2;
        String str;
        String str2;
        String str3;
        boolean z2;
        String str4;
        int i = this.a;
        String str5 = "Accept-Encoding";
        boolean z3 = true;
        Integer num = null;
        pvc pvcVar = pvc.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Context context = ((xe) obj).a;
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            case 1:
                cza czaVar = AndroidBookUpdateWorker.G;
                Context context2 = ((AndroidBookUpdateWorker) obj).a;
                context2.getClass();
                return new kf(context2);
            case 2:
                boolean z4 = AndroidDownloadService.C;
                return new li((AndroidDownloadService) obj);
            case 3:
                bq5 bq5Var = ((fl) obj).b;
                bq5Var.getClass();
                ln0 ln0Var = new ln0(tl1.q(bq5Var.a()), 3);
                try {
                    Integer valueOf = Integer.valueOf(new fz3(ln0Var).c(0));
                    try {
                        ln0Var.close();
                    } catch (Throwable th3) {
                        num = th3;
                    }
                    Integer num2 = num;
                    num = valueOf;
                    th = num2;
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    try {
                        ln0Var.close();
                        th = th5;
                    } catch (Throwable th6) {
                        pye.e(th5, th6);
                        th = th5;
                    }
                }
                if (th == null) {
                    return new hz3(num.intValue());
                }
                throw th;
            case 4:
                bq5 bq5Var2 = ((gl) obj).b;
                bq5Var2.getClass();
                ln0 ln0Var2 = new ln0(tl1.q(bq5Var2.a()), 3);
                try {
                    Integer valueOf2 = Integer.valueOf(new fz3(ln0Var2).c(0));
                    try {
                        ln0Var2.close();
                    } catch (Throwable th7) {
                        num = th7;
                    }
                    Integer num3 = num;
                    num = valueOf2;
                    th2 = num3;
                } catch (Throwable th8) {
                    Throwable th9 = th8;
                    try {
                        ln0Var2.close();
                        th2 = th9;
                    } catch (Throwable th10) {
                        pye.e(th9, th10);
                        th2 = th9;
                    }
                }
                if (th2 == null) {
                    return new hz3(num.intValue());
                }
                throw th2;
            case 5:
                hud.o((rl) obj);
                return pvcVar;
            case 6:
                return new ufb(((rm) obj).a);
            case 7:
                cza czaVar2 = AndroidTestServerService.d;
                return new tm((AndroidTestServerService) obj);
            case 8:
                return ((oob) obj).z0();
            case 9:
                o48 o48Var = new o48(((oo) obj).a.getApplicationContext(), "text_to_speech");
                o48Var.w.icon = R.drawable.ic_headphones;
                return o48Var;
            case 10:
                ((dx8) ((s35) obj)).a(0);
                return pvcVar;
            case 11:
                om3 om3Var = (om3) obj;
                if (!om3Var.e() && ((mv) om3Var.b.getValue()) == mv.c) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 12:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                return new b2(objArr);
            case 13:
                ((iya) obj).cancel(null);
                return pvcVar;
            case 14:
                kg0 kg0Var = (kg0) obj;
                kg0Var.d++;
                kg0Var.d();
                return pvcVar;
            case 15:
                return (ps) obj;
            case 16:
                return ml0.b((ml0) obj);
            case 17:
                v72 v72Var = pt0.a;
                return Integer.valueOf(((em8) obj).h());
            case 18:
                return (rk9) obj;
            case 19:
                return (wea) obj;
            case 20:
                return (s0b) ((j71) obj).d.getValue();
            case 21:
                kp6 kp6Var = (kp6) obj;
                if (((qo3) kp6Var.f.invoke()).e) {
                    sp6 sp6Var = (sp6) kp6Var.e.invoke();
                    cp6 cp6Var = kp6Var.a;
                    int h = kp6Var.c.b.h();
                    int h2 = kp6Var.d.b.h();
                    mz1 mz1Var = new mz1(1, kp6Var, kp6.class, "handleClose", "handleClose(Lio/github/linreal/cascade/editor/ui/LinkPopupCloseRequest;)V", 0, 29);
                    sp6Var.getClass();
                    String str6 = sp6Var.d;
                    cp6Var.getClass();
                    if (sp6Var.a && (xp6Var = sp6Var.c) != null) {
                        xp6 xp6Var3 = sp6Var.g;
                        if (sp6Var.e && xp6Var3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            xp6Var2 = xp6Var3;
                        } else {
                            xp6Var2 = xp6Var;
                        }
                        if (!z || (str4 = sp6Var.h) == null) {
                            str = str6;
                        } else {
                            str = str4;
                        }
                        String str7 = sp6Var.f;
                        if (str7 == null) {
                            String obj2 = k4b.N0(str6).toString();
                            if (obj2.length() != 0) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < obj2.length()) {
                                        if (!nqe.y(obj2.charAt(i2))) {
                                            i2++;
                                        }
                                    } else if (k4b.V(obj2, "://", false) || k4b.W(obj2, '.')) {
                                        num = str6;
                                    }
                                }
                            }
                            if (num == null) {
                                str7 = "";
                            } else {
                                str2 = num;
                                str3 = sp6Var.f;
                                if (str3 != null && !sp6Var.j) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                num = new np6(xp6Var2, h, h2, cp6Var, mz1Var, str, str2, str3, z2);
                            }
                        }
                        str2 = str7;
                        str3 = sp6Var.f;
                        if (str3 != null) {
                        }
                        z2 = true;
                        num = new np6(xp6Var2, h, h2, cp6Var, mz1Var, str, str2, str3, z2);
                    }
                    if (num != null) {
                        kp6Var.g.setValue(num);
                    }
                }
                return pvcVar;
            case 22:
                ee1 ee1Var = (ee1) obj;
                if (!((ce1) ee1Var.e.getValue()).a && !ee1Var.E && ee1Var.D) {
                    String str8 = ee1Var.C;
                    hk1 a = jdd.a(ee1Var);
                    sw2 sw2Var = ab3.a;
                    ee1Var.f(a, ru2.c, new de1(true, ee1Var, false, str8, null));
                }
                return pvcVar;
            case 23:
                ?? obj3 = new Object();
                obj3.m8write((byte[]) obj);
                return obj3;
            case 24:
                vt4 vt4Var = ((io1) obj).g0;
                if (vt4Var != null) {
                    vt4Var.invoke();
                }
                return Boolean.TRUE;
            case 25:
                return tl1.A((yk8) obj);
            case 26:
                n10 n10Var = (n10) obj;
                if (n10Var.N == null) {
                    w26 w26Var = n10Var.F;
                    if (w26Var != null) {
                        w26Var.cancel(null);
                    }
                    n10Var.F = null;
                } else if (n10Var.E) {
                    n10Var.m();
                }
                return pvcVar;
            case 27:
                hy1 hy1Var = (hy1) obj;
                m45 m45Var = n45.a;
                ?? c3eVar = new c3e(8);
                rf8 rf8Var = (rf8) hy1Var.b;
                n45 c = rf8Var.c();
                tv1 tv1Var = new tv1(22);
                c.getClass();
                c.c(new f58(11, c3eVar, tv1Var));
                c3eVar.h("Content-Encoding", ((z12) hy1Var.d).getName());
                String b = rf8Var.c().b("Vary");
                if (b != null) {
                    str5 = b.concat(", Accept-Encoding");
                }
                c3eVar.h("Vary", str5);
                return c3eVar.Y();
            case 28:
                iy1 iy1Var = (iy1) obj;
                m45 m45Var2 = n45.a;
                ?? c3eVar2 = new c3e(8);
                qf8 qf8Var = iy1Var.a;
                n45 c2 = qf8Var.c();
                tv1 tv1Var2 = new tv1(23);
                c2.getClass();
                c2.c(new f58(11, c3eVar2, tv1Var2));
                c3eVar2.h("Content-Encoding", iy1Var.b.getName());
                String b2 = qf8Var.c().b("Vary");
                if (b2 != null) {
                    str5 = b2.concat(", Accept-Encoding");
                }
                c3eVar2.h("Vary", str5);
                return c3eVar2.Y();
            default:
                return ((s6f) obj).o(":memory:");
        }
    }
}
