package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lh9  reason: default package */
/* loaded from: classes.dex */
public final class lh9 implements c82, dj1, nkd, gz, zk0, kj8, sz9, y75, xd4 {
    public final /* synthetic */ int a;
    public static final lh9 b = new lh9(1);
    public static final lh9 c = new lh9(3);
    public static final /* synthetic */ lh9 d = new lh9(4);
    public static final /* synthetic */ lh9 e = new lh9(5);
    public static final lh9 f = new lh9(6);
    public static final lh9 C = new lh9(7);
    public static final lh9 D = new lh9(8);
    public static final lh9 E = new lh9(9);
    public static final /* synthetic */ lh9 F = new lh9(10);
    public static final qm3 G = new Object();
    public static final lh9 H = new lh9(11);
    public static final p1a I = new p1a(17);
    public static final lh9 J = new lh9(13);
    public static final lh9 K = new lh9(14);

    public /* synthetic */ lh9(int i) {
        this.a = i;
    }

    public static final void o(lh9 lh9Var, ybc ybcVar, ed5 ed5Var, ifc ifcVar) {
        rcc rccVar;
        lh9Var.getClass();
        if (ifcVar != null && (rccVar = ed5Var.c) != null) {
            rccVar.p(ifcVar);
        }
        ed5Var.m = ed5Var.l;
        ed5Var.l = de5.E;
        ed5Var.R(ybcVar);
    }

    public static final boolean p(lh9 lh9Var, dcc dccVar) {
        lh9Var.getClass();
        if (((acc) dccVar.c) == acc.e) {
            return d4b.e(((tbc) dccVar).d.V());
        }
        return false;
    }

    public static void r(StringBuilder sb, mb5 mb5Var, List list, int i) {
        String str;
        Object obj;
        int i2 = 0;
        while (i2 < list.size()) {
            if (!(((gv2) list.get(i2)).a.b instanceof dn0)) {
                str = "ul";
            } else {
                str = "ol";
            }
            sb.append("<");
            sb.append(str);
            sb.append(">");
            while (i2 < list.size()) {
                if (!(((gv2) list.get(i2)).a.b instanceof dn0)) {
                    obj = "ul";
                } else {
                    obj = "ol";
                }
                if (obj.equals(str)) {
                    gv2 gv2Var = (gv2) list.get(i2);
                    sb.append("<li");
                    int i3 = gv2Var.b;
                    if (i3 != i) {
                        sb.append(" class=\"");
                        sb.append("cascade-indent-" + i3);
                        sb.append('\"');
                    }
                    sb.append(">");
                    sb.append(mb5Var.a(gv2Var.a));
                    r(sb, mb5Var, gv2Var.c, gv2Var.b + 1);
                    sb.append("</li>");
                    i2++;
                }
            }
            sb.append("</");
            sb.append(str);
            sb.append(">");
        }
    }

    public static String s(int i, String str) {
        str.getClass();
        String obj = k4b.N0(str).toString();
        Pattern compile = Pattern.compile("\\s+");
        compile.getClass();
        obj.getClass();
        String replaceAll = compile.matcher(obj).replaceAll(" ");
        replaceAll.getClass();
        StringBuilder sb = new StringBuilder();
        if (i < 0) {
            i += k4b.y0(replaceAll, new char[]{' '}, 0, 6).size();
        }
        int length = replaceAll.length();
        boolean z = true;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = replaceAll.charAt(i3);
            if (z && Character.isLetter(charAt) && i2 < i) {
                sb.append(Character.toUpperCase(charAt));
                i2++;
                z = false;
            } else {
                sb.append(Character.toLowerCase(charAt));
            }
            if (nqe.y(charAt)) {
                z = true;
            }
        }
        return sb.toString();
    }

    public static void u(String str, String str2) {
        str.getClass();
        if (jy.a()) {
            kw6 kw6Var = kw6.b;
            iea ieaVar = iea.b;
            if (kw6Var.a.a.compareTo(ieaVar) <= 0) {
                kw6Var.a(ieaVar, str, str2, null);
            }
        }
    }

    public static kb5 v(mb5 mb5Var, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return jb5.a;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xl0 xl0Var = (xl0) obj;
            int i2 = xl0Var.d.a;
            while (!arrayList3.isEmpty() && ((gv2) sl1.j0(arrayList3)).b >= i2) {
                arrayList3.remove(arrayList3.size() - 1);
            }
            gv2 gv2Var = new gv2(xl0Var, i2);
            gv2 gv2Var2 = (gv2) sl1.k0(arrayList3);
            if (gv2Var2 == null) {
                arrayList2.add(gv2Var);
            } else {
                gv2Var2.c.add(gv2Var);
            }
            arrayList3.add(gv2Var);
        }
        r(sb, mb5Var, arrayList2, 0);
        return new ib5(sb.toString());
    }

    public static void x(ybc ybcVar, cp3 cp3Var) {
        Object obj;
        ybcVar.getClass();
        j40 j40Var = ybcVar.g;
        if (j40Var != null) {
            j40Var.getClass();
            i40 i40Var = new i40(j40Var);
            while (i40Var.hasNext()) {
                g40 g40Var = (g40) i40Var.next();
                String str = g40Var.a;
                cp3Var.getClass();
                j40 e2 = cp3Var.e();
                if (!e2.i(str)) {
                    j40 j40Var2 = g40Var.c;
                    if (j40Var2 == null) {
                        vg9 vg9Var = vg9.c;
                    } else {
                        str.getClass();
                        if (!j40Var2.i(str)) {
                            vg9 vg9Var2 = vg9.c;
                        } else {
                            if (!j40Var2.i("/ksoup.userdata")) {
                                obj = null;
                            } else {
                                obj = j40Var2.r().get("ksoup.attrs");
                            }
                            Map s = jsc.s(obj);
                            if (s == null) {
                                vg9 vg9Var3 = vg9.c;
                            } else if (((vg9) s.get(str)) == null) {
                                vg9 vg9Var4 = vg9.c;
                            }
                        }
                    }
                    e2.n(str, g40Var.getValue());
                    g40Var.c = e2;
                }
            }
        }
    }

    public static String y(String str) {
        return s21.n("[ˆ̛̆]", s21.n("[̣̀́̃̉]", r4b.N(r4b.N(s21.n("[yỳýỵỷỹ]", s21.n("[YÝỲỸỴ]", s21.n("[uùúụủũưừứựửữ]", s21.n("[UÚÙŨỤƯỨỪỮỰ]", s21.n("[oòóọỏõôồốộổỗơờớợởỡ]", s21.n("[OÓÒÕỌÔỐỒỖỘƠỚỜỠỢ]", s21.n("[iìíịỉĩ]", s21.n("[IÍÌĨỊ]", s21.n("[eèéẹẻẽêềếệểễ]", s21.n("[EÉÈẼẸÊẾỀỄỆ]", s21.n("[aàáạảãâầấậẩẫăằắặẳẵ]", s21.n("[AÁÀÃẠÂẤẦẪẬĂẮẰẴẶ]", str, "A"), "a"), "E"), "e"), "I"), "i"), "O"), "o"), "U"), "u"), "Y"), "y"), false, "Đ", "D"), false, "đ", "d"), ""), "");
    }

    public static ArrayList z(String str, char... cArr) {
        Character ch;
        int i;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 != -1) {
            int length = cArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    char c2 = cArr[i3];
                    i = k4b.f0(str, c2, i2, 4);
                    if (i != -1) {
                        ch = Character.valueOf(c2);
                        break;
                    }
                    i3++;
                } else {
                    ch = null;
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                break;
            }
            arrayList.add(new yk8(str.substring(i2, i), ch));
            i2 = i + 1;
        }
        if (i2 < str.length()) {
            arrayList.add(new yk8(str.substring(i2), null));
        }
        return arrayList;
    }

    @Override // defpackage.fz, defpackage.jz
    public float b() {
        return nae.e;
    }

    @Override // defpackage.nkd
    public jkd c(Activity activity, s13 s13Var) {
        s13Var.getClass();
        yt0.h.getClass();
        return new jkd(new ut0(xt0.a().d(activity)), s13Var.g(activity));
    }

    @Override // defpackage.xd4
    public String e() {
        return null;
    }

    @Override // defpackage.fz
    public void f(r13 r13Var, int i, int[] iArr, tc6 tc6Var, int[] iArr2) {
        if (tc6Var == tc6.a) {
            lz.a(i, iArr, iArr2, false);
        } else {
            lz.a(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.y75
    public an8 h(u75 u75Var, q75 q75Var) {
        return new x75(u75Var, q75Var);
    }

    @Override // defpackage.nkd
    public jkd i(Context context, s13 s13Var) {
        s13Var.getClass();
        Context context2 = context;
        while (true) {
            if (context2 instanceof ContextWrapper) {
                if ((context2 instanceof Activity) || (context2 instanceof InputMethodService)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) context2;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                context2 = contextWrapper.getBaseContext();
                context2.getClass();
            } else {
                context2 = context;
                break;
            }
        }
        if (context2 instanceof Activity) {
            return c((Activity) context2, s13Var);
        }
        if (!(context2 instanceof InputMethodService) && !(context2 instanceof Application)) {
            vs.m("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new jkd(new Rect(0, 0, point.x, point.y), s13Var.g(context));
    }

    @Override // defpackage.sz9
    public rz9 j(long j, long j2, long j3, y22 y22Var, float f2, float f3) {
        y22Var.getClass();
        return new rz9(0.5f, 1.0f, 1.5f);
    }

    @Override // defpackage.jz
    public void k(r13 r13Var, int i, int[] iArr, int[] iArr2) {
        lz.a(i, iArr, iArr2, false);
    }

    @Override // defpackage.y75
    public an8 m() {
        return new x75(u75.n, null);
    }

    @Override // defpackage.sz9
    public rz9 n(long j, long j2, long j3, y22 y22Var, float f2, float f3) {
        y22Var.getClass();
        return new rz9(0.5f, 1.0f, 1.5f);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, pc2] */
    @Override // defpackage.dj1
    public void q(re5 re5Var, aab aabVar) {
        mu4 mu4Var = (mu4) aabVar;
        re5Var.getClass();
        lie lieVar = new lie(3, "BeforeReceive", false);
        ah5 ah5Var = re5Var.e;
        lie lieVar2 = ah5.o;
        ah5Var.getClass();
        lieVar2.getClass();
        if (!ah5Var.e(lieVar)) {
            int c2 = ah5Var.c(lieVar2);
            if (c2 != -1) {
                ah5Var.a.add(c2, new qu8(lieVar, new Object()));
            } else {
                throw new j1("Phase " + lieVar2 + " was not registered for this pipeline", 3);
            }
        }
        ah5Var.g(lieVar, new w8(mu4Var, null, 2));
    }

    public void t(xs3 xs3Var) {
        xs3Var.b(ite.class, ije.a);
        xs3Var.b(rxe.class, sne.a);
        xs3Var.b(kte.class, kje.a);
        xs3Var.b(tte.class, oje.a);
        xs3Var.b(ote.class, mje.a);
        xs3Var.b(rte.class, pje.a);
        xs3Var.b(yqe.class, whe.a);
        xs3Var.b(vqe.class, uhe.a);
        xs3Var.b(xre.class, sie.a);
        xs3Var.b(jxe.class, rme.a);
        xs3Var.b(rqe.class, she.a);
        xs3Var.b(nqe.class, rhe.a);
        xs3Var.b(mue.class, ike.a);
        xs3Var.b(bze.class, jie.a);
        xs3Var.b(lre.class, pie.a);
        xs3Var.b(hre.class, hie.a);
        xs3Var.b(oue.class, jke.a);
        xs3Var.b(dxe.class, lme.a);
        xs3Var.b(fxe.class, nme.a);
        xs3Var.b(axe.class, kme.a);
        xs3Var.b(hud.class, xje.a);
        xs3Var.b(aze.class, pfe.a);
        xs3Var.b(gue.class, zje.a);
        xs3Var.b(tl1.class, kke.a);
        xs3Var.b(uue.class, pke.a);
        xs3Var.b(sue.class, nke.a);
        xs3Var.b(que.class, lke.a);
        xs3Var.b(sve.class, gle.a);
        xs3Var.b(vve.class, ile.a);
        xs3Var.b(zve.class, nle.a);
        xs3Var.b(xve.class, lle.a);
        xs3Var.b(bue.class, wje.a);
        xs3Var.b(cwe.class, qle.a);
        xs3Var.b(gwe.class, sle.a);
        xs3Var.b(iwe.class, ule.a);
        xs3Var.b(kwe.class, wle.a);
        xs3Var.b(xwe.class, gme.a);
        xs3Var.b(uwe.class, ime.a);
        xs3Var.b(pve.class, rke.a);
        xs3Var.b(ose.class, eje.a);
        xs3Var.b(kve.class, ble.a);
        xs3Var.b(ave.class, zke.a);
        xs3Var.b(nve.class, ele.a);
        xs3Var.b(hxe.class, pme.a);
        xs3Var.b(b23.class, foe.a);
        xs3Var.b(ipe.class, ege.a);
        xs3Var.b(dpe.class, yfe.a);
        xs3Var.b(ape.class, wfe.a);
        xs3Var.b(fpe.class, bge.a);
        xs3Var.b(npe.class, yge.a);
        xs3Var.b(lpe.class, vge.a);
        xs3Var.b(p1d.class, zge.a);
        xs3Var.b(q1d.class, bhe.a);
        xs3Var.b(r1d.class, dhe.a);
        xs3Var.b(xpe.class, ghe.a);
        xs3Var.b(zpe.class, ihe.a);
        xs3Var.b(dce.class, dfe.a);
        xs3Var.b(jce.class, ife.a);
        xs3Var.b(fce.class, ffe.a);
        xs3Var.b(ese.class, aje.a);
        xs3Var.b(hu7.class, aie.a);
        xs3Var.b(w9e.class, nce.a);
        xs3Var.b(v9e.class, pce.a);
        xs3Var.b(hma.class, fie.a);
        xs3Var.b(cae.class, qce.a);
        xs3Var.b(y9e.class, tce.a);
        xs3Var.b(yae.class, ude.a);
        xs3Var.b(vae.class, xde.a);
        xs3Var.b(gae.class, vce.a);
        xs3Var.b(dae.class, yce.a);
        xs3Var.b(cbe.class, aee.a);
        xs3Var.b(bbe.class, cee.a);
        xs3Var.b(hbe.class, eee.a);
        xs3Var.b(fbe.class, fee.a);
        xs3Var.b(bce.class, wee.a);
        xs3Var.b(zbe.class, zee.a);
        xs3Var.b(lbe.class, iee.a);
        xs3Var.b(jbe.class, kee.a);
        xs3Var.b(pbe.class, nee.a);
        xs3Var.b(obe.class, qee.a);
        xs3Var.b(ak0.class, zme.a);
        xs3Var.b(dye.class, die.a);
        xs3Var.b(pye.class, uje.a);
        xs3Var.b(nye.class, tje.a);
        xs3Var.b(jye.class, nie.a);
        xs3Var.b(zj0.class, vme.a);
        xs3Var.b(qye.class, tme.a);
        xs3Var.b(sye.class, ane.a);
        xs3Var.b(lye.class, tie.a);
        xs3Var.b(h9a.class, moe.a);
        xs3Var.b(vye.class, poe.a);
        xs3Var.b(tye.class, ioe.a);
        xs3Var.b(kxe.class, ine.a);
        xs3Var.b(ase.class, uie.a);
        xs3Var.b(rse.class, hje.a);
        xs3Var.b(xoe.class, tfe.a);
        xs3Var.b(qre.class, qie.a);
        xs3Var.b(hse.class, dje.a);
        xs3Var.b(fre.class, gie.a);
        xs3Var.b(yte.class, rje.a);
        xs3Var.b(vte.class, qje.a);
        xs3Var.b(s9e.class, lce.a);
        xs3Var.b(xxe.class, vne.a);
        xs3Var.b(aye.class, coe.a);
        xs3Var.b(zxe.class, zne.a);
        xs3Var.b(voe.class, mfe.a);
        xs3Var.b(kqe.class, phe.a);
        xs3Var.b(jqe.class, nhe.a);
        xs3Var.b(cqe.class, lhe.a);
        xs3Var.b(iue.class, cke.a);
        xs3Var.b(kue.class, gke.a);
        xs3Var.b(jue.class, eke.a);
        xs3Var.b(rae.class, ode.a);
        xs3Var.b(pae.class, rde.a);
        xs3Var.b(mwe.class, zle.a);
        xs3Var.b(twe.class, fme.a);
        xs3Var.b(owe.class, bme.a);
        xs3Var.b(qwe.class, dme.a);
        xs3Var.b(xbe.class, see.a);
        xs3Var.b(ube.class, uee.a);
        xs3Var.b(p17.class, one.a);
        xs3Var.b(nxe.class, kne.a);
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return "SingleLineCodepointTransformation";
            case 16:
                return "Arrangement#Center";
            case 19:
                return "Empty";
            default:
                return super.toString();
        }
    }

    public String w(String str) {
        xw8.a.getClass();
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return (String) ((Map) ww8.d.getValue()).get(upperCase);
    }

    @Override // defpackage.xd4
    public void a() {
    }

    @Override // defpackage.zk0
    public long g(long j) {
        return j;
    }

    @Override // defpackage.kj8
    public int d(int i, int i2) {
        return i2;
    }

    @Override // defpackage.xd4
    public void l(long j, String str) {
    }
}
